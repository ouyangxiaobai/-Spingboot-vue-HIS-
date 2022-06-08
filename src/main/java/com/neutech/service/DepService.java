package com.neutech.service;

import com.neutech.bean.base.DepMana;
import com.neutech.vo.system.DepShow;

import java.util.List;
import java.util.Map;

public interface DepService {
    public Map<String, Object> addDep(DepMana depMana);
    public Map<String,Object> getAllDep();

    public Map<String,Object> getDepBy(DepMana depMana);
    public Map<String,Object> deleteByNum(DepShow dep);
    public Map<String,Object> updateDep(DepShow dep);

}
