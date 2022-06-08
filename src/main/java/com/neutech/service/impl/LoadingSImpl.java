package com.neutech.service.impl;

import com.neutech.bean.base.DepMana;
import com.neutech.bean.base.Disposition;
import com.neutech.mapper.base.DepMapper;
import com.neutech.service.LoadingS;
import com.neutech.util.SelectK;
import com.neutech.vo.reception.Departoptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class LoadingSImpl implements LoadingS {

    @Autowired
    DepMapper depMapper;

    @Override
    public List<Departoptions> sitRegDep() {
        List<DepMana> allDep = depMapper.getAllDep();
        List<Departoptions> list= new ArrayList<>();
        for(DepMana dm:allDep){
            if(dm.getDepType().equals("门诊")){
                list.add(new Departoptions(dm.getDepName(),dm.getDepName()));
            }
        }
        return list;
    }

    @Override
    public List<SelectK> getDepManas() {
        DepMana depMana=new DepMana();
        depMana.setDepType("门诊");
        List<DepMana> deps = depMapper.getDepBy(depMana);
        List<SelectK> list=new ArrayList<>();
        for(DepMana d:deps){
            list.add(new SelectK(d.getDepName(),d.getDepNum()));
        }
        return list;
    }
}
