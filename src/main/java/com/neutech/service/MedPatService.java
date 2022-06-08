package com.neutech.service;

import java.util.Map;

public interface MedPatService {
    public Map<String,Object> getAllmedpat();
    public Map<String,Object> getmedpatByName(String patient_Name);
    public Map<String,Object> getAllMedicine(String pre_RegID);
    public Map<String,Object> UpdateMedicine(String pm_PreID,String pm_MedID);
}
