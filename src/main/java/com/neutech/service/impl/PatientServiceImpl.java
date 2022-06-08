package com.neutech.service.impl;

import com.neutech.mapper.patient.PatientMapper;
import com.neutech.service.PatientService;
import com.neutech.vo.outdepart.PatientUpShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientMapper patientMapper;

    public Map<String,Object> patientupByRegID(String reg_ID){
        PatientUpShow patientUpShow= patientMapper.patientupByRegID(reg_ID);
        HashMap<String,Object> res=new HashMap<>();
        res.put("paups",patientUpShow);
        return res;
    }
}
