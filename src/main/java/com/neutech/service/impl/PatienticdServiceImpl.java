package com.neutech.service.impl;

import com.neutech.bean.patient.Patienticd;
import com.neutech.bean.patient.Prescription;
import com.neutech.mapper.patient.PatienticdMapper;
import com.neutech.mapper.patient.PrescriptionMapper;
import com.neutech.service.PatienticdService;
import com.neutech.vo.outdepart.PrescriptionShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class PatienticdServiceImpl implements PatienticdService {

    @Autowired
    PatienticdMapper patienticdMapper;
    @Autowired
    PrescriptionMapper prescriptionMapper;

    public Map<String,Object> geticdname(String pti_ID){
        HashMap<String,Object> res=new HashMap<>();
        String icd_Type="西";
        List<String> ptiICE=patienticdMapper.getIce(pti_ID,icd_Type);
        res.put("dis",ptiICE);

        List<Prescription> prescriptions=prescriptionMapper.getAllByReg(pti_ID);
        List<PrescriptionShow> prescriptionShows=new ArrayList<>();
        for(Prescription p:prescriptions){
            prescriptionShows.add(new PrescriptionShow(p));
        }
        res.put("tableData",prescriptionShows);
        return res;
    }
}
