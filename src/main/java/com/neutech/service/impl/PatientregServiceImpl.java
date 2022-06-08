package com.neutech.service.impl;

import com.neutech.bean.patient.Patientreg;
import com.neutech.mapper.patient.PatientMapper;
import com.neutech.mapper.patient.PatientregMapper;
import com.neutech.service.PatientregService;
import com.neutech.util.MyUtil;
import com.neutech.vo.outdepart.PatientShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
@Service
public class PatientregServiceImpl implements PatientregService {

    @Autowired
    PatientregMapper patientregMapper;
    @Autowired
    PatientMapper patientMapper;

    /**
     * 显示该医生病人在左侧未诊
     * @param reg_optDoc
     * @return
     */
    public List<PatientShow> getPatient(String reg_optDoc,String reg_State){
        List<PatientShow> patientShows=new ArrayList<>();
        List<Patientreg> byidTime = patientregMapper.getByidTime(reg_optDoc);
        for (Patientreg patientreg:byidTime){
            if(patientreg.getReg_State().equals(reg_State)&&MyUtil.getDay(patientreg.getReg_Date()).equals(MyUtil.getDay())){//证明就是当天工作时段的
                String sn=patientreg.getReg_Sn();
                String name=patientMapper.getPatient(patientreg.getReg_Patient()).getPatient_Name();
                String regID=patientreg.getReg_ID();
                patientShows.add(new PatientShow(sn,name,regID));
            }
        }
        return patientShows;
    }


    /**
     * 查询未诊已诊
     * @param reg_optDoc
     * @param patient_Name
     * @return
     */
    public List<PatientShow> getPatientByDP(String reg_optDoc,String patient_Name,String reg_State){
        List<PatientShow> patientShows=patientregMapper.getRegByDocPat(reg_optDoc,patient_Name,reg_State);

        return patientShows;
    }

    @Override
    public List<Patientreg> getToday() {
        List<Patientreg> today = patientregMapper.getToday();
        List<Patientreg> res=new ArrayList<>();
        for(Patientreg patientreg:today){
            if(MyUtil.getDay().equals(MyUtil.getDay(patientreg.getReg_Date()))){
                res.add(patientreg);
            }
        }
        return res;
    }
}
