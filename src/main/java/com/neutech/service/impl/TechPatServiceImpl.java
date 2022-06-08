package com.neutech.service.impl;

import com.neutech.bean.base.Inspection;
import com.neutech.bean.base.TechMana;
import com.neutech.bean.patient.Patient;
import com.neutech.bean.patient.Patientreg;
import com.neutech.mapper.base.InspectionMapper;
import com.neutech.mapper.base.TechMapper;
import com.neutech.mapper.patient.PatientMapper;
import com.neutech.mapper.patient.PatientregMapper;
import com.neutech.service.TechPatService;
import com.neutech.vo.medtech.TechPatShow;
import com.neutech.vo.outdepart.PatientShow;
import com.neutech.vo.outdepart.PatientUpShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TechPatServiceImpl implements TechPatService {

    @Autowired
    PatientregMapper patientregMapper;
    @Autowired
    InspectionMapper inspectionMapper;
    @Autowired
    TechMapper techMapper;
    @Autowired
    PatientMapper patientMapper;

    /**
     * 显示右侧患者
     * @return
     */
    public Map<String,Object> getAllTechPat(){
        HashMap<String,Object> res=new HashMap<>();
        List<Patientreg> today = patientregMapper.getToday();
        List<PatientShow> patientShows=new ArrayList<>();
        for(Patientreg patientreg:today){
            patientShows.add(new PatientShow(
                    patientreg.getReg_Sn(),
                    patientMapper.getPatient(patientreg.getReg_Patient()).getPatient_Name(),
                    patientreg.getReg_ID()));
        }
        //List<PatientShow> patientShows1=patientregMapper.getAllReg();
        res.put("table",patientShows);
        return res;
    }

    /**
     * 通过姓名查询患者
     * @param patient_Name
     * @return
     */
    public Map<String,Object> getTechpatByName(String patient_Name){
        HashMap<String,Object> res=new HashMap<>();
        List<PatientShow> patientShows=patientregMapper.getmedpatByName(patient_Name);
        res.put("patisbydpwz",patientShows);
        return res;
    }

    /**
     * 选择患者，刷新检验和头
     * @param check_RegID
     * @return
     */
    public Map<String,Object> getAllTech(String check_RegID){
        HashMap<String,Object> res=new HashMap<>();
        List<Inspection> inspections=inspectionMapper.getAllCheck();
        List<TechMana> techManas=techMapper.getAllTech();
        List<Patient> patients=patientMapper.getAllPatient();
        List<Patientreg> patientregs=patientregMapper.getAllPatientreg();
        List<TechPatShow> techPatShows=new ArrayList<>();
        PatientUpShow patientUpShow=new PatientUpShow();
        for(Patientreg pa:patientregs){
            if(pa.getReg_ID().equals(check_RegID)){
                for(Patient p:patients){
                    if(p.getPatient_ID().equals(pa.getReg_Patient())){
                        patientUpShow.setPatient_Name(p.getPatient_Name());
                        patientUpShow.setPatient_Age(p.getPatient_Age());
                        patientUpShow.setPatient_ID(p.getPatient_ID());
                    }
                }
            }
        }
        for(Inspection ins:inspections){
            if(ins.getCheck_RegID().equals(check_RegID)&&(ins.getCheck_State().equals("已开立")||ins.getCheck_State().equals("已完成"))){
                for(TechMana tech:techManas){
                    if(tech.getTechNum().equals(ins.getCheck_TechID())){
                        TechPatShow techPatShow=new TechPatShow();
                        techPatShow.setId(tech.getTechNum());
                        techPatShow.setName(tech.getTechItem());
                        techPatShow.setNum(ins.getCheck_Num());
                        techPatShow.setUnp(tech.getTechUnitPrice());
                        techPatShow.setTotalp(String.valueOf(Integer.valueOf(tech.getTechUnitPrice()).intValue() * Integer.valueOf(ins.getCheck_Num())));
                        techPatShow.setState(ins.getCheck_State());
                        techPatShows.add(techPatShow);
                    }
                }
            }
        }
        res.put("magtables",techPatShows);
        res.put("tables",patientUpShow);
        return res;
    }


    public Map<String,Object> UpdateTechPat(String check_RegID,String check_TechID){
        HashMap<String,Object> res=new HashMap<>();
        String check_State="已完成";
        if(inspectionMapper.updateState(check_RegID,check_TechID,check_State)>0){
            res.put("flag","yes");
        }
        return res;
    }
}
