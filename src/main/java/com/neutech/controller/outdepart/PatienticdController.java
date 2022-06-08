package com.neutech.controller.outdepart;

import com.neutech.service.PatienticdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
public class PatienticdController {

    @Autowired
    PatienticdService patienticdService;

    @PostMapping("/getAlldata")
    public Map<String,Object> geticdname(@RequestBody Map<String,Object> map){
        String RegID=(String)map.get("regID");
        Map<String,Object> res=patienticdService.geticdname(RegID);
        return res;
    }
}
