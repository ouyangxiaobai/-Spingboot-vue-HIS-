package com.neutech.controller.outdepart;

import com.neutech.service.PremedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@CrossOrigin
@RestController
public class PremedController {

    @Autowired
    PremedService premedService;

    @PostMapping("selectchufang")
    public Map<String,Object> getAll(@RequestBody Map<String,Object> map){
        String pm_PreID=(String)map.get("preid");
        Map<String,Object> res=premedService.getAll(pm_PreID);
        return res;
    }

    @PostMapping("finddrug")
    public Map<String,Object> getMedicineBy(@RequestBody Map<String,Object> map){
        String med_Name=(String)map.get("medname");
        Map<String,Object> res=premedService.getMedicineBy(med_Name);
        return res;
    }

    @PostMapping("adddrug")
    public Map<String,Object> addPremed(@RequestBody Map<String,Object> map){
        Map<String,Object> med=(Map<String, Object>)map.get("med");
        String pm_PreID=(String)med.get("cid");
        String pm_MedID=(String)med.get("id");
        String pm_Num=(String)med.get("num");
        String pm_Frequency=(String)med.get("fre");
        Map<String,Object> res=premedService.addPremed(pm_PreID,pm_MedID,pm_Num,pm_Frequency);
        return res;
    }

    @PostMapping("delectdrug")
    public Map<String,Object> deletePremedByNum(@RequestBody Map<String,Object> map){
        List<Map<String,Object>> med=(List<Map<String, Object>>)map.get("med");
        String pm_PreID=(String) map.get("cfid");
        Map<String,Object> res=new HashMap<>();
        for(Map<String,Object> m:med){
            String pm_MedID=(String)m.get("id");
            res=premedService.deletePremedByNum(pm_PreID,pm_MedID);
        }
        return res;
    }
}
