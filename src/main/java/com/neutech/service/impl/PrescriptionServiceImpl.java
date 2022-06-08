package com.neutech.service.impl;

import com.neutech.bean.patient.Premed;
import com.neutech.bean.patient.Prescription;
import com.neutech.mapper.patient.PremedMapper;
import com.neutech.mapper.patient.PrescriptionMapper;
import com.neutech.service.PrescriptionService;
import com.neutech.util.MyUtil;
import com.neutech.vo.outdepart.PrescriptionShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    PrescriptionMapper prescriptionMapper;
    @Autowired
    PremedMapper premedMapper;

    /**
     * 添加处方
     * @param pre_RegID
     * @param pre_Name
     * @return
     */
    public Map<String,Object> addPrescription(String pre_RegID,String pre_Name){
        HashMap<String,Object> res=new HashMap<>();
        String pre_ID= MyUtil.getPID().substring(2,11)+MyUtil.getRand(2);
        String pre_State="未开立";
        Date pre_Date=new Date();
        String pre_Usage="";
        Prescription prescription=new Prescription(pre_ID,pre_RegID,pre_Name,pre_State,pre_Date,pre_Usage);
        if(prescriptionMapper.getPrescription(pre_ID,pre_RegID)==null){
            prescriptionMapper.addPrescription(prescription);
            res.put("flag","yes");
            List<Prescription> prescriptions=prescriptionMapper.getAllByReg(pre_RegID);
            List<PrescriptionShow> prescriptionShows=new ArrayList<>();
            for(Prescription p:prescriptions){
                prescriptionShows.add(new PrescriptionShow(p));
            }
            res.put("tableData",prescriptionShows);
        }
        return res;
    }

    /**
     * 删除处方
     * @param pre_ID
     * @param pre_RegID
     * @return
     */
    public Map<String,Object> deletePrescriptionByNum(String pre_ID, String pre_RegID){
        HashMap<String,Object> res=new HashMap<>();
        if(prescriptionMapper.getPrescription(pre_ID,pre_RegID)!=null){
            prescriptionMapper.deletePrescriptionByNum(pre_ID,pre_RegID);
            res.put("flag","yes");
            List<Prescription> prescriptions=prescriptionMapper.getAllByReg(pre_RegID);
            List<PrescriptionShow> prescriptionShows=new ArrayList<>();
            for(Prescription p:prescriptions){
                prescriptionShows.add(new PrescriptionShow(p));
            }
            res.put("tableData",prescriptionShows);
        }
        return res;
    }

    /**
     * 开立处方,更新患者处方，和处方药品
     * @param pre_ID
     * @param pre_RegID
     * @param pre_Name
     * @return
     */
    public Map<String,Object> updatePrescription(String pre_ID, String pre_RegID,String pre_Name){
        HashMap<String,Object> res=new HashMap<>();
        String pre_State="已开立";
        Date pre_Date=new Date();
        String pre_Usage="";
        Prescription prescription=new Prescription(pre_ID,pre_RegID,pre_Name,pre_State,pre_Date,pre_Usage);
        if(prescriptionMapper.getPrescription(pre_ID,pre_RegID)!=null){
            prescriptionMapper.updatePrescription(prescription);
            premedMapper.updateMZState(pre_ID,pre_State);
            res.put("flag","yes");
            List<Prescription> prescriptions=prescriptionMapper.getAllByReg(pre_RegID);
            List<PrescriptionShow> prescriptionShows=new ArrayList<>();
            for(Prescription p:prescriptions){
                prescriptionShows.add(new PrescriptionShow(p));
            }
            res.put("tableData",prescriptionShows);
        }
        return res;
    }
}
