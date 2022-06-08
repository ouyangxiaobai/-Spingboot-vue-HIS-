package com.neutech.service.impl;

import com.neutech.bean.base.Medicine;
import com.neutech.bean.patient.Premed;
import com.neutech.mapper.base.MedicineMapper;
import com.neutech.mapper.patient.PremedMapper;
import com.neutech.service.PremedService;
import com.neutech.vo.outdepart.MedicineFormShow;
import com.neutech.vo.outdepart.PremedShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class PremedServiceImpl implements PremedService {

    @Autowired
    PremedMapper premedMapper;
    @Autowired
    MedicineMapper medicineMapper;

    /**
     * 得到处方所有药品
     * @param pm_PreID
     * @return
     */
    public Map<String,Object> getAll(String pm_PreID){
        HashMap<String,Object> res=new HashMap<>();
        List<Premed> premeds=premedMapper.getAllPremed();
        List<Medicine> medicines=medicineMapper.getAllMedicine();
        List<PremedShow> premedShows=new ArrayList<>();
        Integer money=0;
        for(Premed p:premeds){
            if(p.getPm_PreID().equals(pm_PreID)){
                for(Medicine m:medicines){
                    if(m.getMed_ID().equals(p.getPm_MedID())){
                        PremedShow premedShow=new PremedShow();
                        premedShow.setId(m.getMed_ID());
                        premedShow.setName(m.getMed_Name());
                        premedShow.setSpec(m.getMed_Spec());
                        premedShow.setUn(m.getMed_Un());
                        premedShow.setManu(m.getMed_Manu());
                        premedShow.setType(m.getMed_Type());
                        premedShow.setFre(p.getPm_Frequency());
                        premedShow.setUp(m.getMed_UnitPrice());
                        premedShow.setNum(p.getPm_Num());
                        premedShow.setTotal(String.valueOf(
                                Integer.valueOf(m.getMed_UnitPrice()).intValue() * Integer.valueOf(p.getPm_Num()).intValue()
                        ));
                        premedShows.add(premedShow);
                        money+=Integer.valueOf(premedShow.getTotal()).intValue();
                    }
                }
            }
        }
        res.put("table",premedShows);
        res.put("money",String.valueOf(money));
        return res;
    }

    /**
     * 通过药品名查询药品
     * @param med_Name
     * @return
     */
    public Map<String,Object> getMedicineBy(String med_Name){
        HashMap<String,Object> res=new HashMap<>();
        List<Medicine> medicines=new ArrayList<>();
        Medicine medicine=new Medicine();
        medicine.setMed_Name(med_Name);
        if(medicineMapper.getByName(med_Name)!=null){
            res.put("flag","yes");
            medicines=medicineMapper.getByName(med_Name);
            List<MedicineFormShow> medicineFormShows=new ArrayList<>();
            for(Medicine m:medicines){
                medicineFormShows.add(new MedicineFormShow(m));
            }
            res.put("childtale",medicineFormShows);
        }
        return res;
    }

    /**
     * 处方添加药品
     * @param pm_PreID
     * @param pm_MedID
     * @param pm_Num
     * @param pm_Frequency
     * @return
     */
    public Map<String,Object> addPremed(String pm_PreID,String pm_MedID,String pm_Num,String pm_Frequency){
        HashMap<String,Object> res=new HashMap<>();
        String pm_Method="口服";
        String pm_State="未开立";
        Premed premed=new Premed(pm_PreID,pm_MedID,pm_Num,pm_Method,pm_Frequency,pm_State);
        if(premedMapper.getPremed(pm_PreID,pm_MedID)==null){
            premedMapper.addPremed(premed);
            res.put("flag","yes");
            res.put("table",getAll(pm_PreID).get("table"));
        }
        return res;
    }

    public Map<String,Object> deletePremedByNum(String pm_PreID, String pm_MedID){
        HashMap<String,Object> res=new HashMap<>();
        if(premedMapper.getPremed(pm_PreID,pm_MedID)!=null){
            premedMapper.deletePremedByNum(pm_PreID,pm_MedID);
            res.put("flag","yes");
            res.put("table",getAll(pm_PreID).get("table"));
        }
        return res;
    }
}
