package com.neutech.controller.system;

import com.neutech.service.DocschMagService;
import com.neutech.service.LoadingS;
import com.neutech.util.SelectK;
import com.neutech.vo.system.DocTableData;
import com.neutech.vo.system.ListTableData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class DocschMagController {

    @Autowired
    LoadingS loadingS;
    @Autowired
    DocschMagService docschMagService;

    @RequestMapping("/getdocsch")
    public List<SelectK> getAllDeps(){
        List<SelectK> depManas = loadingS.getDepManas();
        return depManas;
    }

    @PostMapping("/searchdata")
    public Map<String,Object> searchdata(@RequestBody Map<String,Object> map){
        String departID=(String)map.get("depart");
        List<DocTableData> byDep = docschMagService.getByDep(departID);
        ListTableData listTableData= new ListTableData();
        listTableData.setDepID(departID);
        listTableData.setList(byDep);
        Map<String,Object> map1=new HashMap<>();
        map1.put("table",listTableData);
        map1.put("flag","yes");
        return map1;
    }

    @PostMapping("/keepdata")
    public Map<String,Object> update(@RequestBody ListTableData list){
        Map<String,Object> map=new HashMap<>();
        List<DocTableData> DocTableDatas = list.getList();
        boolean isupdate = docschMagService.update(list);
        if(isupdate){
            map.put("flag","yes");
        }
        return map;
    }

}
