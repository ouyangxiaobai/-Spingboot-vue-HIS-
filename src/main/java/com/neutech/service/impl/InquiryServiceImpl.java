package com.neutech.service.impl;


import com.neutech.bean.base.Disposition;
import com.neutech.bean.base.Inspection;
import com.neutech.bean.base.Medicine;
import com.neutech.bean.base.TechMana;
import com.neutech.bean.patient.Patient;
import com.neutech.bean.patient.Patientreg;
import com.neutech.bean.patient.Premed;
import com.neutech.bean.patient.Prescription;
import com.neutech.mapper.base.DispositionMapper;
import com.neutech.mapper.base.InspectionMapper;
import com.neutech.mapper.base.MedicineMapper;
import com.neutech.mapper.base.TechMapper;
import com.neutech.mapper.patient.PatientMapper;
import com.neutech.mapper.patient.PatientregMapper;
import com.neutech.mapper.patient.PremedMapper;
import com.neutech.mapper.patient.PrescriptionMapper;
import com.neutech.service.InquiryService;
import com.neutech.util.MyUtil;
import com.neutech.vo.reception.InquiryUpShow;
import com.neutech.vo.reception.InquiryShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class InquiryServiceImpl implements InquiryService {

    @Autowired
    PatientMapper patientMapper;
    @Autowired
    PatientregMapper patientregMapper;
    @Autowired
    InspectionMapper inspectionMapper;
    @Autowired
    TechMapper techMapper;
    @Autowired
    DispositionMapper dispositionMapper;
    @Autowired
    PrescriptionMapper prescriptionMapper;
    @Autowired
    PremedMapper premedMapper;
    @Autowired
    MedicineMapper medicineMapper;

    public Map<String, Object> getAll() {
        HashMap<String, Object> res = new HashMap<>();
        List<Patient> patients = patientMapper.getAllPatient();
        //System.out.println(patients);
        List<Patientreg> patientregs = patientregMapper.getAllPatientreg();
        List<Inspection> inspections = inspectionMapper.getAllCheck();
        List<TechMana> techManas = techMapper.getAllTech();
        List<Disposition> dispositions = dispositionMapper.getAllDis();
        List<Prescription> prescriptions = prescriptionMapper.getAllPrescription();
        List<Premed> premeds = premedMapper.getAllPremed();
        List<Medicine> medicines = medicineMapper.getAllMedicine();
        List<InquiryShow> inquiryShows = new ArrayList<>();
        for (Patient p : patients) {
            for (Patientreg pa : patientregs) {
                if (p.getPatient_ID().equals(pa.getReg_Patient())) {
                    InquiryShow inquiry = new InquiryShow();
                    inquiry.setMedRecNum(p.getPatient_ID());
                    inquiry.setName(p.getPatient_Name());
                    inquiry.setIdNum(p.getPatient_IdNum());
                    inquiry.setPayCon("挂号");
                    inquiry.setQuantity("1");
                    if (pa.getReg_Type().equals("普通号")) {
                        inquiry.setUnitPrice("20");
                        inquiry.setTotalPrice("20");
                    } else {
                        inquiry.setUnitPrice("50");
                        inquiry.setTotalPrice("50");
                    }
                    inquiry.setItemState(pa.getReg_State());
                    inquiry.setPayTime(MyUtil.dateToS(pa.getReg_Date()));
                    inquiryShows.add(inquiry);
                }
            }
        }
        for (Patient p : patients) {
            for (Patientreg pa : patientregs) {
                if (p.getPatient_ID().equals(pa.getReg_Patient())) {
                    for (Inspection ins : inspections) {
                        if (pa.getReg_ID().equals(ins.getCheck_RegID())) {
                            for (TechMana tech : techManas) {
                                if (ins.getCheck_TechID().equals(tech.getTechNum())) {
                                    InquiryShow inquiry = new InquiryShow();
                                    inquiry.setMedRecNum(p.getPatient_ID());
                                    inquiry.setName(p.getPatient_Name());
                                    inquiry.setIdNum(p.getPatient_IdNum());
                                    inquiry.setQuantity(ins.getCheck_Num());
                                    inquiry.setItemState(ins.getCheck_State());
                                    inquiry.setPayTime(MyUtil.dateToS(ins.getCheck_Time()));
                                    inquiry.setPayCon(tech.getTechItem());
                                    inquiry.setUnitPrice(tech.getTechUnitPrice());
                                    inquiry.setTotalPrice(String.valueOf(Integer.valueOf(ins.getCheck_Num()).intValue() * Integer.valueOf(tech.getTechUnitPrice()).intValue()));
                                    inquiryShows.add(inquiry);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (Patient p : patients) {
            for (Patientreg pa : patientregs) {
                if (p.getPatient_ID().equals(pa.getReg_Patient())) {
                    for (Disposition dis : dispositions) {
                        if (pa.getReg_ID().equals(dis.getDis_RegID())) {
                            for (TechMana tech : techManas) {
                                if (dis.getDis_TechID().equals(tech.getTechNum())) {
                                    InquiryShow inquiry = new InquiryShow();
                                    inquiry.setMedRecNum(p.getPatient_ID());
                                    inquiry.setName(p.getPatient_Name());
                                    inquiry.setIdNum(p.getPatient_IdNum());
                                    inquiry.setQuantity(dis.getDis_Num());
                                    inquiry.setItemState(dis.getDis_State());
                                    inquiry.setPayTime(MyUtil.dateToS(dis.getDis_Time()));
                                    inquiry.setPayCon(tech.getTechItem());
                                    inquiry.setUnitPrice(tech.getTechUnitPrice());
                                    inquiry.setTotalPrice(String.valueOf(Integer.valueOf(dis.getDis_Num()).intValue() * Integer.valueOf(tech.getTechUnitPrice()).intValue()));
                                    inquiryShows.add(inquiry);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (Patient p : patients) {
            for (Patientreg pa : patientregs) {
                if (p.getPatient_ID().equals(pa.getReg_Patient())) {
                    for (Prescription pre : prescriptions) {
                        if (pa.getReg_ID().equals(pre.getPre_RegID())) {
                            for (Premed prem : premeds) {
                                if (pre.getPre_ID().equals(prem.getPm_PreID())) {
                                    for (Medicine m : medicines) {
                                        if (prem.getPm_MedID().equals(m.getMed_ID())) {
                                            InquiryShow inquiry = new InquiryShow();
                                            inquiry.setMedRecNum(p.getPatient_ID());
                                            inquiry.setName(p.getPatient_Name());
                                            inquiry.setIdNum(p.getPatient_IdNum());
                                            inquiry.setQuantity(prem.getPm_Num());
                                            inquiry.setItemState(prem.getPm_State());
                                            inquiry.setPayTime(MyUtil.dateToS(pre.getPre_Date()));
                                            inquiry.setPayCon(m.getMed_Name());
                                            inquiry.setUnitPrice(m.getMed_UnitPrice());
                                            inquiry.setTotalPrice(String.valueOf(
                                                    Integer.valueOf(prem.getPm_Num().trim()).intValue() * Integer.valueOf(m.getMed_UnitPrice().trim()).intValue()
                                            ));
                                            inquiryShows.add(inquiry);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        res.put("frees", inquiryShows);
        return res;
    }


    public Map<String, Object> inquiry(InquiryUpShow inquiryUpShow){
        HashMap<String,Object> res=new HashMap<>();
        String medRecNum=inquiryUpShow.getMedRecNum();
        String name=inquiryUpShow.getName();
        String idNum=inquiryUpShow.getIdNum();
        List<InquiryShow> inquiryShows= (List<InquiryShow>) getAll().get("frees");
        //System.out.println(inquiryShows);
        List<InquiryShow> inquiryShows1=new ArrayList<>();
        if(medRecNum.length()==0) {
            if(name.length()==0){
                if(idNum.length()==0){
                    res.put("flag","no");
                }
                else{
                    for(InquiryShow inq:inquiryShows){
                        if(inq.getIdNum().equals(idNum)){
                            inquiryShows1.add(inq);
                            res.put("flag","yes");
                        }
                    }
                }
            }
            else{
                for(InquiryShow inq:inquiryShows){
                    if(inq.getName().equals(name)){
                        inquiryShows1.add(inq);
                        res.put("flag","yes");
                    }
                }
            }
        }
        else{
            for(InquiryShow inq:inquiryShows){
                if(inq.getMedRecNum().equals(medRecNum)){
                    inquiryShows1.add(inq);
                    res.put("flag","yes");
                }
            }
        }
        res.put("table",inquiryShows1);
        return res;
    }
}
