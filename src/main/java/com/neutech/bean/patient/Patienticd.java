package com.neutech.bean.patient;

import java.util.Date;

public class Patienticd {

    private String pti_ID;
    private Date pti_Time;
    private String pti_ICE;

    public Patienticd(){};

    public Patienticd(String pti_ID, Date pti_Time, String pti_ICE) {
        this.pti_ID = pti_ID;
        this.pti_Time = pti_Time;
        this.pti_ICE = pti_ICE;
    }

    public String getPti_ID() {
        return pti_ID;
    }

    public void setPti_ID(String pti_ID) {
        this.pti_ID = pti_ID;
    }

    public Date getPti_Time() {
        return pti_Time;
    }

    public void setPti_Time(Date pti_Time) {
        this.pti_Time = pti_Time;
    }

    public String getPti_ICE() {
        return pti_ICE;
    }

    public void setPti_ICE(String pti_ICE) {
        this.pti_ICE = pti_ICE;
    }

    @Override
    public String toString() {
        return "Patienticd{" +
                "pti_ID='" + pti_ID + '\'' +
                ", pti_Time=" + pti_Time +
                ", pti_ICE='" + pti_ICE + '\'' +
                '}';
    }
}
