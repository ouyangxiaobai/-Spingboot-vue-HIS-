package com.neutech.vo.outdepart;


import com.neutech.bean.patient.Patient;
import com.neutech.bean.patient.Patientreg;

public class PatientShow {
    private String reg_Sn;
    private String patient_Name;
    private String reg_ID;
    public PatientShow(){};

    public PatientShow(String reg_Sn, String patient_Name, String reg_ID) {
        this.reg_Sn = reg_Sn;
        this.patient_Name = patient_Name;
        this.reg_ID = reg_ID;
    }

    public String getReg_Sn() {
        return reg_Sn;
    }

    public void setReg_Sn(String reg_Sn) {
        this.reg_Sn = reg_Sn;
    }

    public String getPatient_Name() {
        return patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        this.patient_Name = patient_Name;
    }

    public String getReg_ID() {
        return reg_ID;
    }

    public void setReg_ID(String reg_ID) {
        this.reg_ID = reg_ID;
    }

    @Override
    public String toString() {
        return "PatientShow{" +
                "reg_Sn='" + reg_Sn + '\'' +
                ", patient_Name='" + patient_Name + '\'' +
                ", reg_ID='" + reg_ID + '\'' +
                '}';
    }


}
