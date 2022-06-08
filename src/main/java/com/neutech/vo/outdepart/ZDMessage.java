package com.neutech.vo.outdepart;

import com.neutech.bean.patient.PatientMessage;

public class ZDMessage {
    private String dissug;
    private String disrsu;
    public ZDMessage(){}

    public ZDMessage(String dissug, String disrsu) {
        this.dissug = dissug;
        this.disrsu = disrsu;
    }

    public String getDissug() {
        return dissug;
    }

    public void setDissug(String dissug) {
        this.dissug = dissug;
    }

    public String getDisrsu() {
        return disrsu;
    }

    public void setDisrsu(String disrsu) {
        this.disrsu = disrsu;
    }

    @Override
    public String toString() {
        return "ZDMessage{" +
                "dissug='" + dissug + '\'' +
                ", disrsu='" + disrsu + '\'' +
                '}';
    }

    public ZDMessage(PatientMessage patientMessage){
        if(patientMessage==null){
            this.disrsu="";
            this.dissug="";
        }else {
            this.disrsu=patientMessage.getPm_Jieguo();
            this.dissug=patientMessage.getPm_Yijian();
        }

    }
}
