package com.neutech.service.impl;

import com.neutech.bean.base.Medicine;
import com.neutech.bean.patient.Patient;
import com.neutech.bean.patient.Patientreg;
import com.neutech.bean.patient.Premed;
import com.neutech.bean.patient.Prescription;
import com.neutech.mapper.base.MedicineMapper;
import com.neutech.mapper.patient.PatientMapper;
import com.neutech.mapper.patient.PatientregMapper;
import com.neutech.mapper.patient.PremedMapper;
import com.neutech.mapper.patient.PrescriptionMapper;
import com.neutech.service.MedPatService;
import com.neutech.vo.drugstore.MedOpenShow;
import com.neutech.vo.outdepart.PatientShow;
import com.neutech.vo.outdepart.PatientUpShow;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class MedPatServiceImpl implements MedPatService {

    @Autowired
    PatientregMapper patientregMapper;
    @Autowired
    PrescriptionMapper prescriptionMapper;
    @Autowired
    PremedMapper premedMapper;
    @Autowired
    MedicineMapper medicineMapper;
    @Autowired
    PatientMapper patientMapper;

    /**
     * 显示所有用户
     * @return
     */
    public Map<String,Object> getAllmedpat(){
        HashMap<String,Object> res=new HashMap<>();
        List<Patientreg> today = patientregMapper.getToday();
        List<PatientShow> patientShows=new ArrayList<>();
        for(Patientreg patientreg:today){
            patientShows.add(new PatientShow(
                    patientreg.getReg_Sn(),
                    patientMapper.getPatient(patientreg.getReg_Patient()).getPatient_Name(),
                    patientreg.getReg_ID()));
        }
        //List<PatientShow> patientShows=patientregMapper.getAllReg();
        res.put("pati",patientShows);
        return res;
    }

    /**
     * 通过姓名查询用户
     * @param patient_Name
     * @return
     */
    public Map<String,Object> getmedpatByName(String patient_Name){
        HashMap<String,Object> res=new HashMap<>();
        List<PatientShow> patientShows=patientregMapper.getmedpatByName(patient_Name);
        res.put("table",patientShows);
        return res;
    }

    /**
     * 选择患者显示他的药品和头
     * @param pre_RegID
     * @return
     */
    public Map<String,Object> getAllMedicine(String pre_RegID){
        HashMap<String,Object> res=new HashMap<>();
        List<Prescription> prescriptions=prescriptionMapper.getAllPrescription();
        List<Premed> premeds=premedMapper.getAllPremed();
        List<Medicine> medicines=medicineMapper.getAllMedicine();
        List<Patient> patients=patientMapper.getAllPatient();
        List<Patientreg> patientregs=patientregMapper.getAllPatientreg();
        List<MedOpenShow> medOpenShows=new ArrayList<>();
        PatientUpShow patientUpShow=new PatientUpShow();
        for(Patientreg pa:patientregs){
            if(pa.getReg_ID().equals(pre_RegID)){
                for(Patient p:patients){
                    if(p.getPatient_ID().equals(pa.getReg_Patient())){
                        patientUpShow.setPatient_Name(p.getPatient_Name());
                        patientUpShow.setPatient_Age(p.getPatient_Age());
                        patientUpShow.setPatient_ID(p.getPatient_ID());
                    }
                }
            }
        }
        for(Prescription p:prescriptions){
            if(p.getPre_RegID().equals(pre_RegID)){
                for(Premed pre:premeds){
                    if(pre.getPm_PreID().equals(p.getPre_ID())){
                        for(Medicine m:medicines){
                            if(m.getMed_ID().equals(pre.getPm_MedID())){
                                MedOpenShow medOpenShow=new MedOpenShow();
                                medOpenShow.setCid(p.getPre_ID());
                                medOpenShow.setMid(m.getMed_ID());
                                medOpenShow.setMname(m.getMed_Name());
                                medOpenShow.setMspe(m.getMed_Spec());
                                medOpenShow.setMun(m.getMed_Un());
                                medOpenShow.setMman(m.getMed_Manu());
                                medOpenShow.setMp(m.getMed_Type());
                                medOpenShow.setMtype(m.getMed_Kind());
                                medOpenShow.setMunp(m.getMed_UnitPrice());
                                medOpenShow.setMnum(pre.getPm_Num());
                                medOpenShow.setMstate(m.getMed_State());
                                medOpenShow.setMtotal(String.valueOf(Integer.valueOf(m.getMed_UnitPrice()).intValue() * Integer.valueOf(pre.getPm_Num()).intValue()));
                                medOpenShows.add(medOpenShow);
                            }
                        }
                    }
                }
            }
        }
        res.put("form",patientUpShow);
        res.put("tableData",medOpenShows);
        return res;
    }

    /**
     * 更改药品状态
     * @param pre_RegID
     * @param pm_PreID
     * @param pm_MedID
     * @return
     */
    public Map<String,Object> UpdateMedicine(String pm_PreID,String pm_MedID){
        String pm_State="已完成";
        HashMap<String,Object> res=new HashMap<>();
        if(premedMapper.getPremed(pm_PreID,pm_MedID)!=null){
            res.put("flag","yes");
            premedMapper.updateState(pm_PreID,pm_MedID,pm_State);
        }
        return res;
    }
}
