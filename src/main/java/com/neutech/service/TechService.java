package com.neutech.service;

import com.neutech.bean.base.TechMana;
import com.neutech.vo.medtech.TechShow;

import java.util.List;
import java.util.Map;

public interface TechService {

    public Map<String,Object> addTech(TechMana techMana);
    public Map<String,Object> getAllTech();
    public Map<String,Object> getTechBy(TechMana techMana);

    public Map<String,Object> deleteByNum(TechShow techShow);

    public Map<String,Object> updateTech(TechShow techShow);
}
