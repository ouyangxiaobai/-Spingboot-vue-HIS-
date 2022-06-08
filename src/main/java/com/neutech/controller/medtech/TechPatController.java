package com.neutech.controller.medtech;
import com.neutech.service.TechPatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@CrossOrigin
@RestController
public class TechPatController {

    @Autowired
    TechPatService techPatService;

    @RequestMapping("/loadingtech")
    public Map<String,Object> getAllTechPat(){
        Map<String,Object> res=techPatService.getAllTechPat();
        return res;
    }

    @PostMapping("/patient/getUserTable")
    public Map<String,Object> getmedpatByName(@RequestBody Map<String,Object> map){
        String patient_Name=(String)map.get("patname");
        Map<String,Object> res=techPatService.getTechpatByName(patient_Name);
        return res;
    }

    @PostMapping("selecttechpat")
    public Map<String,Object> getAllTech(@RequestBody Map<String,Object> map){
        String check_RegID=(String) map.get("reg_ID");
        Map<String,Object> res=techPatService.getAllTech(check_RegID);
        return res;
    }

    @PostMapping("conftest")
    public Map<String,Object> UpdateTechPat(@RequestBody Map<String,Object> map){
        Map<String,Object> res=new HashMap<>();
        String check_RegID=(String) map.get("regid");
        List<Map<String,Object>> maps=(List<Map<String,Object>>) map.get("tech");
        for(Map<String,Object> m:maps){
            String check_TechID=(String) m.get("id");
            res=techPatService.UpdateTechPat(check_RegID,check_TechID);
        }
        return res;
    }
}
