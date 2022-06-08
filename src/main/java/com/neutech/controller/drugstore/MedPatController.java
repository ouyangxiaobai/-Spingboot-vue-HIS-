package com.neutech.controller.drugstore;

import com.neutech.service.MedPatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@CrossOrigin
@RestController
public class MedPatController {

    @Autowired
    MedPatService medPatService;

    @RequestMapping("/getmedpati")
    public Map<String,Object> getAllmedpat(){

        Map<String,Object> res=medPatService.getAllmedpat();
        return res;
    }

    @PostMapping("/outpart/getUserTable")
    public Map<String,Object> getmedpatByName(@RequestBody Map<String,Object> map){
        String patient_Name=(String)map.get("patname");
        Map<String,Object> res=medPatService.getmedpatByName(patient_Name);
        return res;
    }


    @PostMapping("/outpart/selectuser")
    public Map<String,Object> getAllMedicine(@RequestBody Map<String,Object> map){
        String pre_RegID=(String) map.get("regid");
        Map<String,Object> res=medPatService.getAllMedicine(pre_RegID);
        return res;
    }

    @PostMapping("/outpart/opendrug")
    public Map<String,Object> kaiyap(@RequestBody Map<String,Object> map){
        Map<String,Object> res=new HashMap<>();
        List<Map<String,Object>> maps=(List<Map<String,Object>>)map.get("med");
        for(Map<String,Object> m:maps){
            String pm_PreID=(String) m.get("cid");
            String pm_MedID=(String) m.get("mid");
            res=medPatService.UpdateMedicine(pm_PreID,pm_MedID);
        }
        return res;
    }
}
