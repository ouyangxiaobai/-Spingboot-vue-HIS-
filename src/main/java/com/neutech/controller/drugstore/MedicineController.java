package com.neutech.controller.drugstore;

import com.neutech.bean.base.Medicine;
import com.neutech.service.MedicineService;
import com.neutech.vo.drugstore.MedicineShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin
@RestController
public class MedicineController {
    @Autowired
    MedicineService medicineService;

    @RequestMapping("/addMedicine")
    public Map<String, Object> addMedicine(@RequestBody Medicine medicine){
        Map<String,Object> res=medicineService.addMedicine(medicine);
        return res;
    }

    @RequestMapping("/getAllMedicine")
    public Map<String,Object> getAllMedicine(){
        Map<String,Object> res=medicineService.getAllMedicine();
        return res;
    }

    @RequestMapping("/getMedicineBy")
    public Map<String,Object> getMedicineBy(@RequestBody Medicine medicine){
        Map<String, Object> res = medicineService.getMedicineBy(medicine);
        return res;
    }

    @RequestMapping("/deleteMedicineByID")
    public Map<String,Object> deleteMedicineByID(@RequestBody MedicineShow medicineShow){

        Map<String,Object> res=medicineService.deleteByID(medicineShow);
        return res;
    }

    @RequestMapping("/updateMedicine")
    public Map<String,Object> updateMedicine(@RequestBody MedicineShow medicineShow){
        Map<String,Object> res=medicineService.updateMedicine(medicineShow);
        return res;
    }
}
