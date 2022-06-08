package com.neutech.service;

import java.util.Map;

public interface TechPatService {
    public Map<String,Object> getAllTechPat();
    public Map<String,Object> getTechpatByName(String patient_Name);
    public Map<String,Object> getAllTech(String check_RegID);
    public Map<String,Object> UpdateTechPat(String check_RegID,String check_TechID);
}
