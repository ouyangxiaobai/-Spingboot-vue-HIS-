package com.neutech.controller.outdepart;

import com.neutech.service.InspectionService;
import com.neutech.util.SelectK;
import com.neutech.vo.outdepart.CommonInsShow;
import com.neutech.vo.outdepart.InspectionShow;
import jdk.nashorn.internal.runtime.PrototypeObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class InspectionController {

    @Autowired
    InspectionService inspectionService;

    @PostMapping("/getallinspe")
    public Map<String,Object> getByRegID(@RequestBody Map<String,Object> map){

        String check_RegID=(String) map.get("patient_reg_id");
        //String comTechType="检验";
        //System.out.println(check_RegID);
        Map<String,Object> res=inspectionService.getByRegID(check_RegID);
        return res;
    }

    @PostMapping("/addIns")
    public Map<String,Object> addIns(@RequestBody Map<String,Object> map){
        String comTechNum=(String)map.get("comTechNum");
        String check_RegID=(String)map.get("check_RegID");
        //System.out.println("add+"+comTechNum+"+"+check_RegID);
        Map<String,Object> res=inspectionService.addIns(comTechNum,check_RegID);
        return res;
    }

    @PostMapping("/deleteById")
    public Map<String,Object> deleteById(@RequestBody CommonInsShow commonInsShow){
        String comTechNum=commonInsShow.getComTechNum();
        Map<String,Object> res=inspectionService.deleteByID(comTechNum);
        return res;
    }

    @RequestMapping("/getallxz")
    public Map<String,Object> getAllInsXZ(){
        Map<String,Object> res=inspectionService.getAllInsXZ();
        return res;
    }

    @PostMapping("/getallxm")
    public Map<String,Object> getAllInsXM(@RequestBody Map<String,Object> map){
        String techExeOff=(String)map.get("depart_id");
        Map<String,Object> res=inspectionService.getAllInsXM(techExeOff);
        return res;
    }

    @PostMapping("/getform")
    public Map<String,Object> getTech(@RequestBody Map<String,Object> map){
        String techMum=(String)map.get("tech_id");
        Map<String,Object> res=inspectionService.getTech(techMum);
        return res;
    }

    @PostMapping("/addtech")
    public Map<String,Object> addTech(@RequestBody Map<String,Object> map){
        String comTechNum=(String)map.get("comTechNum");
        String check_RegID=(String)map.get("check_RegID");
        //System.out.println("add+"+comTechNum+"+"+check_RegID);
        Map<String,Object> res=inspectionService.addIns(comTechNum,check_RegID);
        return res;
    }

    @PostMapping("/addcomItem")
    public Map<String,Object> allCom(@RequestBody CommonInsShow commonInsShow){
        //System.out.println(commonInsShow);
        Map<String,Object> res=inspectionService.allCom(commonInsShow);
        return res;
    }

    @PostMapping("/delectItem")
    public Map<String,Object> deleteInsp(@RequestBody Map<String,Object> map){
        List<Map<String,Object>> maps=(List<Map<String,Object>>) map.get("mult");
        String check_RegID= (String) map.get("check_RegID");
        //System.out.println(maps);
        //System.out.println(check_RegID);
        Map<String,Object> res=new HashMap<>();
        for(Map<String,Object> map1:maps){
            String check_TechID=(String) map1.get("techNum");
            //System.out.println(check_TechID);
            res=inspectionService.deleteInsp(check_RegID,check_TechID);
        }
        return res;
    }


    @PostMapping("/update")
    public Map<String,Object> updateInspection(@RequestBody Map<String,Object> map){
        List<Map<String,Object>> maps=(List<Map<String,Object>>) map.get("mult");
        String check_RegID= (String) map.get("check_RegID");
        Map<String,Object> res=new HashMap<>();
        for(Map<String,Object> map1:maps){
            String check_TechID=(String) map1.get("techNum");
            res=inspectionService.updateInspection(check_RegID,check_TechID);
        }
        return res;
    }
}
