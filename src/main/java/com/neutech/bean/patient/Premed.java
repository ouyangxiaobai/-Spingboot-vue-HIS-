package com.neutech.bean.patient;

import sun.dc.pr.PRError;

public class Premed {

    private String pm_PreID;
    private String pm_MedID;
    private String pm_Num;
    private String pm_Method;
    private String pm_Frequency;
    private String pm_State;

    public Premed(){};

    public Premed(String pm_PreID, String pm_MedID, String pm_Num, String pm_Method, String pm_Frequency, String pm_State) {
        this.pm_PreID = pm_PreID;
        this.pm_MedID = pm_MedID;
        this.pm_Num = pm_Num;
        this.pm_Method = pm_Method;
        this.pm_Frequency = pm_Frequency;
        this.pm_State = pm_State;
    }

    public String getPm_PreID() {
        return pm_PreID;
    }

    public void setPm_PreID(String pm_PreID) {
        this.pm_PreID = pm_PreID;
    }

    public String getPm_MedID() {
        return pm_MedID;
    }

    public void setPm_MedID(String pm_MedID) {
        this.pm_MedID = pm_MedID;
    }

    public String getPm_Num() {
        return pm_Num;
    }

    public void setPm_Num(String pm_Num) {
        this.pm_Num = pm_Num;
    }

    public String getPm_Method() {
        return pm_Method;
    }

    public void setPm_Method(String pm_Method) {
        this.pm_Method = pm_Method;
    }

    public String getPm_Frequency() {
        return pm_Frequency;
    }

    public void setPm_Frequency(String pm_Frequency) {
        this.pm_Frequency = pm_Frequency;
    }

    public String getPm_State() {
        return pm_State;
    }

    public void setPm_State(String pm_State) {
        this.pm_State = pm_State;
    }

    @Override
    public String toString() {
        return "Premed{" +
                "pm_PreID='" + pm_PreID + '\'' +
                ", pm_MedID='" + pm_MedID + '\'' +
                ", pm_Num='" + pm_Num + '\'' +
                ", pm_Method='" + pm_Method + '\'' +
                ", pm_Frequency='" + pm_Frequency + '\'' +
                ", pm_State='" + pm_State + '\'' +
                '}';
    }
}
