package com.neutech.bean.system;

import java.util.Date;

public class Sche {
    private String schedule_UepNum;
    private String schedule_UserID;
    private String schedule_Time;
    private int schedule_Number;
    private int schedule_Max;
    private Date schedule_LastTime;

    public Sche() {
    }

    public Sche(String schedule_UepNum, String schedule_UserID, String schedule_Time, int schedule_Number) {
        this.schedule_UepNum = schedule_UepNum;
        this.schedule_UserID = schedule_UserID;
        this.schedule_Time = schedule_Time;
        this.schedule_Number = schedule_Number;
    }

    public Sche(String schedule_UepNum, String schedule_UserID, String schedule_Time, int schedule_Number, int schedule_Max, Date schedule_LastTime) {
        this.schedule_UepNum = schedule_UepNum;
        this.schedule_UserID = schedule_UserID;
        this.schedule_Time = schedule_Time;
        this.schedule_Number = schedule_Number;
        this.schedule_Max = schedule_Max;
        this.schedule_LastTime = schedule_LastTime;
    }

    public String getSchedule_UepNum() {
        return schedule_UepNum;
    }

    public void setSchedule_UepNum(String schedule_UepNum) {
        this.schedule_UepNum = schedule_UepNum;
    }

    public String getSchedule_UserID() {
        return schedule_UserID;
    }

    public void setSchedule_UserID(String schedule_UserID) {
        this.schedule_UserID = schedule_UserID;
    }

    public String getSchedule_Time() {
        return schedule_Time;
    }

    public void setSchedule_Time(String schedule_Time) {
        this.schedule_Time = schedule_Time;
    }

    public int getSchedule_Number() {
        return schedule_Number;
    }

    public void setSchedule_Number(int schedule_Number) {
        this.schedule_Number = schedule_Number;
    }

    public int getSchedule_Max() {
        return schedule_Max;
    }

    public void setSchedule_Max(int schedule_Max) {
        this.schedule_Max = schedule_Max;
    }

    public Date getSchedule_LastTime() {
        return schedule_LastTime;
    }

    public void setSchedule_LastTime(Date schedule_LastTime) {
        this.schedule_LastTime = schedule_LastTime;
    }

    @Override
    public String toString() {
        return "Sche{" +
                "schedule_UepNum='" + schedule_UepNum + '\'' +
                ", schedule_UserID='" + schedule_UserID + '\'' +
                ", schedule_Time='" + schedule_Time + '\'' +
                ", schedule_Number=" + schedule_Number +
                ", schedule_Max=" + schedule_Max +
                ", schedule_LastTime=" + schedule_LastTime +
                '}';
    }
}
