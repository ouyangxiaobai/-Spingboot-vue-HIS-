package com.neutech.controller.outdepart;

import com.neutech.service.PrescriptionService;
import com.neutech.vo.outdepart.PrescriptionShow;
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
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;

    @PostMapping("/addchufang")
    public Map<String,Object> addPrescription(@RequestBody Map<String,Object> map){
        String pre_RegID=(String)map.get("regID");
        String pre_Name=(String)map.get("name");
        Map<String,Object> res=prescriptionService.addPrescription(pre_RegID,pre_Name);
        return res;
    }

    @PostMapping("/delectchufang")
    public Map<String,Object> deletePrescriptionByNum(@RequestBody Map<String,Object> map){
        Map<String,Object> res=new HashMap<>();
        String pre_RegID=(String)map.get("regID");
        List<Map<String,Object>> maps=(List<Map<String,Object>>) map.get("table");
        for(Map<String,Object> m:maps){
            String pre_ID=(String)m.get("id");
            res=prescriptionService.deletePrescriptionByNum(pre_ID,pre_RegID);
        }
        return res;
    }

    @PostMapping("/openchufang")
    public Map<String,Object> updatePrescription(@RequestBody Map<String,Object> map){
        Map<String,Object> res=new HashMap<>();
        String pre_RegID=(String)map.get("regID");
        List<Map<String,Object>> maps=(List<Map<String,Object>>) map.get("table");
        for(Map<String,Object> m:maps){
            String pre_ID=(String) m.get("id");
            String pre_Name=(String)m.get("name");
            res=prescriptionService.updatePrescription(pre_ID,pre_RegID,pre_Name);
        }
        return res;
    }
}
