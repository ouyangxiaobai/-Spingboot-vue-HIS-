package com.neutech.service;

import java.util.Map;

public interface PrescriptionService {
    public Map<String,Object> addPrescription(String pre_RegID,String pre_Name);
    public Map<String,Object> deletePrescriptionByNum(String pre_ID, String pre_RegID);
    public Map<String,Object> updatePrescription(String pre_ID, String pre_RegID,String pre_Name);
}