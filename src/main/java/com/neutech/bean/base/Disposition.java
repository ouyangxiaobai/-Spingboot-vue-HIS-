package com.neutech.bean.base;

import java.util.Date;

public class Disposition {
    private String dis_RegID;
    private String dis_TechID;
    private String dis_State;
    private String dis_Num;
    private Date dis_Time;

    public Disposition(){};


    public Disposition(String dis_RegID, String dis_TechID, String dis_State, String dis_Num, Date dis_Time) {
        this.dis_RegID = dis_RegID;
        this.dis_TechID = dis_TechID;
        this.dis_State = dis_State;
        this.dis_Num = dis_Num;
        this.dis_Time = dis_Time;
    }

    public String getDis_RegID() {
        return dis_RegID;
    }

    public void setDis_RegID(String dis_RegID) {
        this.dis_RegID = dis_RegID;
    }

    public String getDis_TechID() {
        return dis_TechID;
    }

    public void setDis_TechID(String dis_TechID) {
        this.dis_TechID = dis_TechID;
    }

    public String getDis_State() {
        return dis_State;
    }

    public void setDis_State(String dis_State) {
        this.dis_State = dis_State;
    }

    public String getDis_Num() {
        return dis_Num;
    }

    public void setDis_Num(String dis_Num) {
        this.dis_Num = dis_Num;
    }

    public Date getDis_Time() {
        return dis_Time;
    }

    public void setDis_Time(Date dis_Time) {
        this.dis_Time = dis_Time;
    }

    @Override
    public String toString() {
        return "disposition{" +
                "dis_RegID='" + dis_RegID + '\'' +
                ", dis_TechID='" + dis_TechID + '\'' +
                ", dis_State='" + dis_State + '\'' +
                ", dis_Num='" + dis_Num + '\'' +
                ", dis_Time='" + dis_Time + '\'' +
                '}';
    }
}
