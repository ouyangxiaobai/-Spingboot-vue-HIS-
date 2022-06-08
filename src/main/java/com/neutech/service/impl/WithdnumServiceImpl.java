package com.neutech.service.impl;

import com.neutech.bean.patient.Patient;
import com.neutech.bean.patient.Patientreg;
import com.neutech.mapper.patient.PatientMapper;
import com.neutech.mapper.patient.PatientregMapper;
import com.neutech.service.WithdnumService;
import com.neutech.util.MyUtil;
import com.neutech.vo.reception.WithShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WithdnumServiceImpl implements WithdnumService {

    //medRecNum: 'abfassd',
//        name: '王小虎',
//        idNum: '上海市普陀区金沙江路 1518 弄',
//        regDate: '2021.6.5',
//        optDepart: '内科',
//        state: '未诊'
    @Autowired
    PatientregMapper patientregMapper;
    @Autowired
    PatientMapper patientMapper;

    @Override
    public Map<String, Object> loading() {//获取所有的挂号信息（状态为已挂号和已退号的）
        List<Patientreg> list = patientregMapper.getByState("已挂号");
        List<Patientreg> list3 = patientregMapper.getByState("已退号");
        for(Patientreg p:list3){
            list.add(p);
        }
        List<WithShow> list1=new ArrayList<>();
        for(Patientreg patientreg:list){
            Patient patient = patientMapper.getPatient(patientreg.getReg_Patient());
            list1.add(new WithShow(patientreg.getReg_ID(),
                    patientreg.getReg_Patient(),
                    patient.getPatient_Name(),
                    patient.getPatient_IdNum(),
                    MyUtil.dateToS(patientreg.getReg_Date()),
                    patientreg.getReg_Depart(),
                    patientreg.getReg_State()));
        }
        Map<String ,Object> map=new HashMap<>();
        map.put("list",list1);
        return map;
    }

    @Override
    public Map<String, Object> searchBy(String medRecNum, String name, String idNum) {//根据病历号，姓名，身份证号查找
        Patient patient=new Patient();
        patient.setPatient_ID(medRecNum);
        patient.setPatient_Name(name);
        patient.setPatient_IdNum(idNum);
        List<WithShow> list=new ArrayList<>();
        List<Patient> byPatient = patientMapper.getByPatient(patient);//查出来的所有符合条件的病人
        for(Patient p:byPatient){
            List<Patientreg> getyw = getyw(p.getPatient_ID());//获取到病历号是id且已挂号和已退号的
            for(Patientreg pr:getyw){
                list.add(new WithShow(pr.getReg_ID(),
                        pr.getReg_Patient(),
                        p.getPatient_Name(),
                        p.getPatient_IdNum(),
                        MyUtil.dateToS(pr.getReg_Date()),
                        pr.getReg_Depart(),
                        pr.getReg_State()));
            }
        }

        Map<String,Object>map= new HashMap<>();
        map.put("list",list);
        return map;
    }

    @Override
    public List<Patientreg> getyw(String id) {//获取病历号是id并且已挂号和已退号的
        List<Patientreg> list1 = patientregMapper.getByMedAndState(id,"已挂号");
        List<Patientreg> list2 = patientregMapper.getByMedAndState(id,"已退号");
        for(Patientreg p:list2){
            list1.add(p);
        }

        return list1;
    }

    @Override
    public int backH(String regID) {//根据挂号单号退号
        Patientreg patientreg = patientregMapper.getPatientreg(regID);
        patientreg.setReg_State("已退号");
        return patientregMapper.updatePatientreg(patientreg);
    }
}
