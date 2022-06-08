package com.neutech.service;

import com.neutech.bean.patient.Patientreg;
import com.neutech.vo.outdepart.PatientShow;

import java.util.List;
import java.util.Map;

public interface PatientregService {
    public List<PatientShow> getPatient(String reg_optDoc, String reg_State);
    public List<PatientShow> getPatientByDP(String reg_optDoc,String patient_name,String reg_State);

    /**
     * 获取的今天在工作时间内挂号的患者
     * @return
     */
    public List<Patientreg> getToday();
}
