package com.neutech.controller.medtech;


import com.neutech.bean.base.TechMana;
import com.neutech.service.TechService;
import com.neutech.vo.medtech.TechShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class TechController {

    @Autowired
    TechService techService;

    @RequestMapping("/addTech")//添加医技
    public Map<String,Object>addTech(@RequestBody TechMana techMana){
        Map<String,Object> res=techService.addTech(techMana);
        return res;
    }

    @RequestMapping("/getAllTech")
    public Map<String,Object> getAllTech(){
        Map<String,Object>res=techService.getAllTech();
        return res;
    }

    @RequestMapping("/getTechBy")
    public Map<String,Object> getTechBy(@RequestBody TechMana techMana){
        Map<String,Object> res=techService.getTechBy(techMana);
        return res;
    }

    @RequestMapping("/deleteByTechNum")
    public Map<String,Object> deleteByNum(@RequestBody TechShow techShow){
        Map<String,Object> res=techService.deleteByNum(techShow);
        return res;
    }

    @RequestMapping("/updateTech")
    public Map<String,Object> updateUser(@RequestBody TechShow techShow){
        Map<String,Object> res=techService.updateTech(techShow);
        return res;
    }
}
