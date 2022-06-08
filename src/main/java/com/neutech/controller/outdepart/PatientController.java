package com.neutech.controller.outdepart;

import com.neutech.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin
@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/getUserdata")
    public Map<String,Object> patientupByRegID(@RequestBody Map<String,Object> map){

        String reg_ID=(String)map.get("reg_ID");
        Map<String,Object> res=patientService.patientupByRegID(reg_ID);
        return res;
    }
}
