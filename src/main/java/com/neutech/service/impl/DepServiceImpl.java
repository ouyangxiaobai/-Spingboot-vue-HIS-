package com.neutech.service.impl;

import com.neutech.bean.base.DepMana;
import com.neutech.mapper.base.DepMapper;
import com.neutech.service.DepService;
import com.neutech.vo.system.DepShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepServiceImpl implements DepService {


    @Autowired
    DepMapper depMapper;

    public Map<String, Object> addDep(DepMana depMana){
        HashMap<String,Object> res=new HashMap<>();
        if(depMapper.getDep(depMana.getDepNum())!= null){
            res.put("flag","no");
        }else {
            depMapper.addDep(depMana);
            res.put("flag","yes");
        }
        return res;
    }
    public Map<String,Object> getAllDep(){
        HashMap<String,Object> res=new HashMap<>();
        List<DepMana> allDep=depMapper.getAllDep();
        List<DepShow> allDepShow=new ArrayList<>();
        for(DepMana dep:allDep){
            allDepShow.add(new DepShow(dep));
        }
        res.put("deps",allDepShow);
        return res;
    }

    public Map<String,Object> getDepBy(DepMana depMana){

        List<DepMana> depmanas=depMapper.getDepBy(depMana);
        HashMap<String,Object> res=new HashMap<>();
        if(depmanas.size()==0){
            res.put("flag","no");
        }
        else{
            List<DepShow> allDepShow=new ArrayList<>();
            for(DepMana depmanaw:depmanas){
                allDepShow.add(new DepShow(depmanaw));
            }
            res.put("flag","yes");
            res.put("deps",allDepShow);
        }
        return res;
    }

    public Map<String,Object> deleteByNum(DepShow dep){
        String num=dep.getDepNum();
        HashMap<String,Object> res=new HashMap<>();
        depMapper.deleteByNum(num);
        res.put("flag","yes");

        return res;
    }

    public Map<String,Object> updateDep(DepShow dep){

        DepMana dep1=new DepMana(dep);
        boolean isupdate=depMapper.updateDep(dep1);
        HashMap<String,Object> res=new HashMap<>();
        res.put("flag","yes");

        return res;
    }
}
