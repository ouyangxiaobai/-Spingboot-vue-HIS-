package com.neutech.service;

import com.neutech.vo.outdepart.CommonInsShow;

import java.util.Map;

public interface InspectionService {

    public Map<String,Object> getByRegID(String check_RegID);
    public Map<String,Object> addIns(String comTechNum, String check_RegID);
    public Map<String,Object> deleteByID(String comTechNum);
    public Map<String,Object> getAllInsXZ();
    public Map<String,Object> getAllInsXM(String techExeOff);
    public Map<String,Object> getTech(String techMum);
    public Map<String,Object> allCom(CommonInsShow commonInsShow);
    public Map<String,Object> deleteInsp(String check_RegID,String check_TechID);
    public Map<String,Object> updateInspection(String check_RegID,String check_TechID);
}
