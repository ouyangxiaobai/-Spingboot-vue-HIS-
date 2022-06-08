package com.neutech.controller.outdepart;

import com.neutech.service.PatientregService;
import com.neutech.vo.outdepart.PatientShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class PatientregController {

    @Autowired
    PatientregService patientregService;

    @PostMapping("/loading")
    public Map<String,Object> getPatient(@RequestBody Map<String,Object> map){

        HashMap<String,Object> res=new HashMap<>();
        String reg_optDoc=(String)map.get("docid");
        String reg_State1="已挂号";
        List<PatientShow> patientShow1 =patientregService.getPatient(reg_optDoc,reg_State1);

        res.put("patiswz",patientShow1);
        String reg_State2="已就诊";
        List<PatientShow> patientShow2=patientregService.getPatient(reg_optDoc,reg_State2);
        System.out.println(patientShow2);
        res.put("patisyz",patientShow2);
        return res;
    }

    @PostMapping("/getUserTable")
    public Map<String,Object> getPatientByDP(@RequestBody Map<String,Object> map){
        HashMap<String,Object> res=new HashMap<>();
        String reg_optDoc=(String)map.get("docid");
        String patient_Name=(String)map.get("patname");
        //System.out.println(reg_optDoc);
        //System.out.println(patient_Name);
        String reg_State1="已挂号";
        List<PatientShow> patientShows1=patientregService.getPatientByDP(reg_optDoc,patient_Name,reg_State1);
        res.put("patisbydpwz",patientShows1);
        String reg_State2="已就诊";
        List<PatientShow> patientShows2=patientregService.getPatientByDP(reg_optDoc,patient_Name,reg_State2);
        res.put("patisbydpyz",patientShows2);
        return res;
    }
}
