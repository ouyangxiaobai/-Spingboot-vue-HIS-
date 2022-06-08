package com.neutech.service;

import java.util.Map;

public interface PremedService {
    public Map<String,Object> getAll(String pm_PreID);
    public Map<String,Object> getMedicineBy(String med_Name);
    public Map<String,Object> addPremed(String pm_PreID,String pm_MedID,String pm_Num,String pm_Frequency);
    public Map<String,Object> deletePremedByNum(String pm_PreID, String pm_MedID);
}
