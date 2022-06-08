package com.neutech.service.impl;

import com.neutech.bean.base.TechMana;
import com.neutech.mapper.base.TechMapper;
import com.neutech.service.TechService;
import com.neutech.vo.medtech.TechShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TechServiceImpl implements TechService {
    @Autowired
    TechMapper techMapper;

    public Map<String,Object> addTech(TechMana techMana){
        HashMap<String,Object> res=new HashMap<>();
        if(techMapper.getTech(techMana.getTechNum())!=null){
            res.put("flag","no");
        }else{
            techMapper.addTech(techMana);
            res.put("flag","yes");
        }
        return res;
    }
    public Map<String,Object> getAllTech(){
        HashMap<String,Object>res=new HashMap<>();
        List<TechMana> allTech=techMapper.getAllDep();
        List<TechShow> allTechShow=new ArrayList<>();
        for(TechMana tech:allTech){
            allTechShow.add(new TechShow(tech));
        }
        res.put("techs",allTechShow);
        return res;
    }
    public Map<String,Object> getTechBy(TechMana techMana){
        HashMap<String,Object> res=new HashMap<>();
        List<TechMana> techManas= techMapper.getTechBy(techMana.getTechItem());
        if(techManas.size()==0){
            res.put("flag","no");
        }else{
            List<TechShow> allTechShow=new ArrayList<>();
            for(TechMana tech:techManas){
                allTechShow.add(new TechShow(tech));
            }
            res.put("flag","yes");
            res.put("techs",allTechShow);
        }
        return res;
    }

    public Map<String,Object> deleteByNum(TechShow techShow){
        String num=techShow.getTechNum();
        HashMap<String,Object> res=new HashMap<>();
        techMapper.deleteByNum(num);

        res.put("flag","yes");
        return res;
    }

    public Map<String,Object> updateTech(TechShow techShow){
        TechMana techMana=new TechMana(techShow);
        int isupdate=techMapper.updateTech(techMana);
        HashMap<String,Object> res=new HashMap<>();
        if(isupdate>0) {
            res.put("flag", "yes");
        }
        else{
            res.put("flsg","no");
        }
        return res;
    }
}
