package com.neutech.bean.patient;

import java.util.Date;

public class Wicd {
    private String wicd;
    private String wname;
    private Date wtime;

    public Wicd() {
    }

    public Wicd(String wicd, String wname, Date wtime) {
        this.wicd = wicd;
        this.wname = wname;
        this.wtime = wtime;
    }

    public String getWicd() {
        return wicd;
    }

    public void setWicd(String wicd) {
        this.wicd = wicd;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public Date getWtime() {
        return wtime;
    }

    public void setWtime(Date wtime) {
        this.wtime = wtime;
    }

    @Override
    public String toString() {
        return "Wicd{" +
                "wicd='" + wicd + '\'' +
                ", wname='" + wname + '\'' +
                ", wtime=" + wtime +
                '}';
    }
}
