package com.neutech.bean.patient;

import com.neutech.vo.reception.RegForm;

public class Patient {
    private String patient_ID;
    private String patient_Name;
    private String patient_Sex;
    private String patient_Age;
    private String patient_IdNum;
    private String patient_DataBirth;
    private String patient_Address;

    public Patient(){};

    public Patient(String patient_ID, String patient_Name, String patient_Sex, String patient_Age, String patient_IdNum, String patient_DataBirth, String patient_Address) {
        this.patient_ID = patient_ID;
        this.patient_Name = patient_Name;
        this.patient_Sex = patient_Sex;
        this.patient_Age = patient_Age;
        this.patient_IdNum = patient_IdNum;
        this.patient_DataBirth = patient_DataBirth;
        this.patient_Address = patient_Address;
    }

    public String getPatient_ID() {
        return patient_ID;
    }

    public void setPatient_ID(String patient_ID) {
        this.patient_ID = patient_ID;
    }

    public String getPatient_Name() {
        return patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        this.patient_Name = patient_Name;
    }

    public String getPatient_Sex() {
        return patient_Sex;
    }

    public void setPatient_Sex(String patient_Sex) {
        this.patient_Sex = patient_Sex;
    }

    public String getPatient_Age() {
        return patient_Age;
    }

    public void setPatient_Age(String patient_Age) {
        this.patient_Age = patient_Age;
    }

    public String getPatient_IdNum() {
        return patient_IdNum;
    }

    public void setPatient_IdNum(String patient_IdNum) {
        this.patient_IdNum = patient_IdNum;
    }

    public String getPatient_DataBirth() {
        return patient_DataBirth;
    }

    public void setPatient_DataBirth(String patient_DataBirth) {
        this.patient_DataBirth = patient_DataBirth;
    }

    public String getPatient_Address() {
        return patient_Address;
    }

    public void setPatient_Address(String patient_Address) {
        this.patient_Address = patient_Address;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patient_ID='" + patient_ID + '\'' +
                ", patient_Name='" + patient_Name + '\'' +
                ", patient_Sex='" + patient_Sex + '\'' +
                ", patient_Age='" + patient_Age + '\'' +
                ", patient_IdNum='" + patient_IdNum + '\'' +
                ", patient_DataBirth='" + patient_DataBirth + '\'' +
                ", patient_Address='" + patient_Address + '\'' +
                '}';
    }

    public Patient(RegForm regForm){
        this.patient_ID=regForm.getMedRecNum();//病历号
        this.patient_Name=regForm.getName();//姓名
        this.patient_Sex=regForm.getSex();
        this.patient_Age=regForm.getAge();
        this.patient_IdNum=regForm.getIdNum();
        this.patient_DataBirth=regForm.getDateBirth();
        this.patient_Address=regForm.getAddress();
    }
}
