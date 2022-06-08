package com.neutech.service.impl;

import com.neutech.bean.patient.Patient;
import com.neutech.bean.patient.Patientreg;
import com.neutech.mapper.patient.PatientMapper;
import com.neutech.mapper.patient.PatientregMapper;
import com.neutech.service.ChaxunService;
import com.neutech.service.InquiryService;
import com.neutech.vo.outdepart.Chaxun;
import com.neutech.vo.reception.InquiryShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class ChaxunServiceImpl implements ChaxunService {
    @Autowired
    InquiryService inquiryService;
    @Autowired
    PatientregMapper patientregMapper;
    @Autowired
    PatientMapper patientMapper;

    public Map<String,Object> getAll(String RegID){
        HashMap<String,Object> res=new HashMap<>();
        List<InquiryShow> inquiryShows= (List<InquiryShow>) inquiryService.getAll().get("frees");
        List<Patientreg> patientregs=patientregMapper.getAllPatientreg();
        List<Patient> patients=patientMapper.getAllPatient();
        List<Chaxun> chaxuns=new ArrayList<>();
        int sum=0;
        for(Patientreg pa:patientregs){
            if(pa.getReg_ID().equals(RegID)){
                for(InquiryShow inq:inquiryShows){
                    if(inq.getMedRecNum().equals(pa.getReg_Patient())){
                        Chaxun cx=new Chaxun();
                        cx.setPayCon(inq.getPayCon());
                        cx.setQuantity(inq.getQuantity());
                        cx.setUnitPrice(inq.getUnitPrice());
                        cx.setTotalPrice(inq.getTotalPrice());
                        cx.setPayState(inq.getItemState());
                        cx.setPayTime(inq.getPayTime());
                        chaxuns.add(cx);
                        sum+=Integer.valueOf(inq.getTotalPrice()).intValue();
                    }
                }
            }
        }
        res.put("tableData",chaxuns);
        res.put("totalprice",sum);
        return res;
    }
}
