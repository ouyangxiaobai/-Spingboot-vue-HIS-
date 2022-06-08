package com.neutech.service;

import com.neutech.bean.base.Medicine;
import com.neutech.vo.drugstore.MedicineShow;

import java.util.Map;

public interface MedicineService {

    public Map<String,Object> addMedicine(Medicine medicine);

    public Map<String, Object> getAllMedicine();

    public Map<String,Object> getMedicineBy(Medicine medicine);

    public  Map<String,Object> deleteByID(MedicineShow medicineShow);

    public Map<String,Object> updateMedicine(MedicineShow medicineShow);
}
