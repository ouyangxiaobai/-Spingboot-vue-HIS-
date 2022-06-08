package com.neutech.controller.outdepart;

import com.neutech.bean.patient.PatientMessage;
import com.neutech.bean.patient.Wicd;
import com.neutech.service.DiagnoseService;
import com.neutech.vo.outdepart.CheckItem;
import com.neutech.vo.outdepart.EicdShow;
import com.neutech.vo.outdepart.WicdShow;
import com.neutech.vo.outdepart.ZDMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class DiagnoseController {
    @Autowired
    DiagnoseService diagnoseService;

    @RequestMapping("/outdepart/dia/quezhen")
    public Map<String,Object> quezhen(@RequestBody Map<String,Object> map){
        String regID=(String)map.get("regID");
        int i = diagnoseService.zhenbi(regID);
        Map<String,Object> res=new HashMap<>();
        if(i>0){
            res.put("flag","true");
        }
        return res;
    }

    /**
     * 确诊界面的初始化，当换人是（点击选择时）
     * 返回检查项，西医/中医诊断，诊断结果，处理意见以及两个ICD编码的所有信息，以供医生添加使用
     * @param map
     * @return
     */
    @RequestMapping("/outdepart/dia/getQueZhenDate")
    public Map<String,Object> loading(@RequestBody Map<String,Object> map){
        String reg_ID=(String) map.get("patient_reg_id");
        Map<String,Object> res=new HashMap<>();
        Map<String, Object> icd1 = diagnoseService.getICD();
        res.put("childtable1",icd1.get("childtable1"));
        res.put("childtable2",icd1.get("childtable2"));
        if(reg_ID.length()!=14){//检查是不是真的挂号单号
            return res;
        }
        //根据挂号单号就去查找
        List<CheckItem> inspection = diagnoseService.getInspection(reg_ID);//获取检查项
        Map<String, Object> icd = diagnoseService.getICD(reg_ID);
        PatientMessage message = diagnoseService.getMessage(reg_ID);

        ZDMessage zdMessage=new ZDMessage(message);

        res.put("table",inspection);
        res.put("form",zdMessage);
        res.put("table1",icd.get("table1"));
        res.put("table2",icd.get("table2"));
        res.put("isAdd","true");

        return res;
    }

    @RequestMapping("/outdepart/addwicd")
    public Map<String,Object> addWicd(@RequestBody Map<String,Object> map){//添加西医诊断
        String regID=(String) map.get("regID");
        String icdID=(String) map.get("icdID");
        int addicd = diagnoseService.addicd(regID, icdID);

        Map<String,Object> res=new HashMap<>();
        if(addicd==0){
            res.put("flag","false");
        }else {
            res.put("flag","true");
        }

        return res;

    }

    @PostMapping("/outdepart/dia/addeicd")
    public Map<String,Object> addEicd(@RequestBody Map<String,Object> map){//添加中医诊断
        String regID=(String) map.get("regID");
        String icdID=(String) map.get("icdID");
        int addicd = diagnoseService.addicd(regID, icdID);

        Map<String,Object> res=new HashMap<>();
        if(addicd==0){
            res.put("flag","false");
        }else {
            res.put("flag","true");
        }

        return res;

    }
    @RequestMapping("/outdepart/dia/update")
    public Map<String,Object> update(@RequestBody Map<String,Object> map){
        String regID=(String)map.get("regID");
        Map<String,Object> map1=(Map<String,Object>)map.get("form");
        PatientMessage patientMessage=new PatientMessage();
        patientMessage.setPm_ID(regID);
        patientMessage.setPm_Jieguo((String)map1.get("disrsu"));
        patientMessage.setPm_Yijian((String)map1.get("dissug"));
        int i = diagnoseService.updateMessage(patientMessage);
        /*--------*/
        Map<String,Object> res=new HashMap<>();
        if(i==0){
            res.put("flag","false");
        }else {
            res.put("flag","true");
        }

        return res;
    }

    @RequestMapping("outdepart/dia/delete")
    public Map<String,Object> deletew(@RequestBody Map<String,Object> map){
        Map<String,Object> res= new HashMap<>();
        String regID=(String) map.get("regID");
        String icdID=(String) map.get("icdID");
        int delete = diagnoseService.delete(regID, icdID);
        if(delete==0){
            res.put("flag","false");
        }else {
            res.put("flag","true");
        }
        return res;
    }


}
