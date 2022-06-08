package com.neutech.bean.base;

import java.util.Date;

public class Inspection {
    private String check_RegID;
    private String check_TechID;
    private String check_State;
    private String check_Num;
    private Date check_Time;

    public Inspection(){};

    public Inspection(String check_RegID, String check_TechID, String check_State, String check_Num, Date check_Time) {
        this.check_RegID = check_RegID;
        this.check_TechID = check_TechID;
        this.check_State = check_State;
        this.check_Num = check_Num;
        this.check_Time = check_Time;
    }

    public String getCheck_RegID() {
        return check_RegID;
    }

    public void setCheck_RegID(String check_RegID) {
        this.check_RegID = check_RegID;
    }

    public String getCheck_TechID() {
        return check_TechID;
    }

    public void setCheck_TechID(String check_TechID) {
        this.check_TechID = check_TechID;
    }

    public String getCheck_State() {
        return check_State;
    }

    public void setCheck_State(String check_State) {
        this.check_State = check_State;
    }

    public String getCheck_Num() {
        return check_Num;
    }

    public void setCheck_Num(String check_Num) {
        this.check_Num = check_Num;
    }

    public Date getCheck_Time() {
        return check_Time;
    }

    public void setCheck_Time(Date check_Time) {
        this.check_Time = check_Time;
    }

    @Override
    public String toString() {
        return "Inspection{" +
                "check_RegID='" + check_RegID + '\'' +
                ", check_TechID='" + check_TechID + '\'' +
                ", check_State='" + check_State + '\'' +
                ", check_Num='" + check_Num + '\'' +
                ", check_Time=" + check_Time +
                '}';
    }
}
