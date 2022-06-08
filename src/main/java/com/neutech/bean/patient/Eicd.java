package com.neutech.bean.patient;

import java.util.Date;

public class Eicd {
    private String eicd;
    private String ename;
    private Date etime;

    public Eicd() {
    }

    public Eicd(String eicd, String ename, Date etime) {
        this.eicd = eicd;
        this.ename = ename;
        this.etime = etime;
    }

    public String getEicd() {
        return eicd;
    }

    public void setEicd(String eicd) {
        this.eicd = eicd;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    @Override
    public String toString() {
        return "Eicd{" +
                "eicd='" + eicd + '\'' +
                ", ename='" + ename + '\'' +
                ", etime=" + etime +
                '}';
    }
}
