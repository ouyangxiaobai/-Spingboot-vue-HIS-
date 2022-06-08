package com.neutech.service.impl;

import com.neutech.bean.base.Medicine;
import com.neutech.mapper.base.MedicineMapper;
import com.neutech.service.MedicineService;
import com.neutech.vo.drugstore.MedicineShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    MedicineMapper medicineMapper;

    public Map<String,Object> addMedicine(Medicine medicine){
        HashMap<String,Object> res=new HashMap<>();
        if(medicineMapper.getMedicine(medicine.getMed_ID())!=null){
            res.put("flag","no");
        }else{
            medicineMapper.addMedicine(medicine);
            res.put("flag","yes");
        }
        return res;
    }

    public Map<String, Object> getAllMedicine(){
        HashMap<String,Object> res=new HashMap<>();
        List<Medicine> allMedicine=medicineMapper.getAllMedicine();
        List<MedicineShow> allMedicineShow=new ArrayList<>();
        for(Medicine med:allMedicine){
            allMedicineShow.add((new MedicineShow(med)));
        }
        res.put("meds",allMedicineShow);
        return res;
    }

    public Map<String,Object> getMedicineBy(Medicine medicine){
        //List<Medicine> medicines=medicineMapper.getMedicineBy(medicine);
        List<Medicine> medicines = medicineMapper.getByName(medicine.getMed_Name());
        HashMap<String,Object> res=new HashMap<>();
        if(medicines.size()==0){
            res.put("flag","no");
        }else {
            List<MedicineShow> allMedicineShow=new ArrayList<>();
            for(Medicine med:medicines){
                allMedicineShow.add(new MedicineShow(med));
            }
            res.put("flag","yes");
            res.put("meds",allMedicineShow);
        }
        return res;

    }

    public Map<String,Object> deleteByID(MedicineShow medicineShow){
        String id=medicineShow.getMed_ID();
        HashMap<String,Object> res=new HashMap<>();
        medicineMapper.deleteByID(id);

        res.put("flag","yes");
        return res;
    }

    public Map<String, Object> updateMedicine(MedicineShow medicineShow){

        Medicine medicine=new Medicine(medicineShow);
        int isupdate=medicineMapper.updateMedicine(medicine);
        HashMap<String,Object> res=new HashMap<>();
        if(isupdate>0){
            res.put("flag","yes");
        }
        else{
            res.put("flag","no");
        }

        return res;
    }
}
