package com.neutech.bean.patient;

import com.neutech.vo.outdepart.PrescriptionShow;

import java.util.Date;

public class Prescription {
    private String pre_ID;
    private String pre_RegID;
    private String pre_Name;
    private String pre_State;
    private Date pre_Date;
    private String pre_Usage;

    Prescription(){};

    public Prescription(String pre_ID, String pre_RegID, String pre_Name, String pre_State, Date pre_Date, String pre_Usage) {
        this.pre_ID = pre_ID;
        this.pre_RegID = pre_RegID;
        this.pre_Name = pre_Name;
        this.pre_State = pre_State;
        this.pre_Date = pre_Date;
        this.pre_Usage = pre_Usage;
    }

    public String getPre_ID() {
        return pre_ID;
    }

    public void setPre_ID(String pre_ID) {
        this.pre_ID = pre_ID;
    }

    public String getPre_RegID() {
        return pre_RegID;
    }

    public void setPre_RegID(String pre_RegID) {
        this.pre_RegID = pre_RegID;
    }

    public String getPre_Name() {
        return pre_Name;
    }

    public void setPre_Name(String pre_Name) {
        this.pre_Name = pre_Name;
    }

    public String getPre_State() {
        return pre_State;
    }

    public void setPre_State(String pre_State) {
        this.pre_State = pre_State;
    }

    public Date getPre_Date() {
        return pre_Date;
    }

    public void setPre_Date(Date pre_Date) {
        this.pre_Date = pre_Date;
    }

    public String getPre_Usage() {
        return pre_Usage;
    }

    public void setPre_Usage(String pre_Usage) {
        this.pre_Usage = pre_Usage;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "pre_ID='" + pre_ID + '\'' +
                ", pre_RegID='" + pre_RegID + '\'' +
                ", pre_Name='" + pre_Name + '\'' +
                ", pre_State='" + pre_State + '\'' +
                ", pre_Date='" + pre_Date + '\'' +
                ", pre_Usage='" + pre_Usage + '\'' +
                '}';
    }

//    public Prescription(PrescriptionShow prescriptionShow,String pre_RegID){
//        this.pre_ID=prescriptionShow.getId();
//        this.pre_Name=prescriptionShow.getName();
//        this.pre_State=prescriptionShow.getState();
//        this.pre_RegID=pre_RegID;
//        this.pre_Date=new Date();
//        this.pre_Usage="";
//    }
}
