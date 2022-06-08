package com.neutech.vo.outdepart;

import com.neutech.bean.patient.Wicd;

public class WicdShow {
    private String wicd;
    private String wname;
    private String wtime;

    public WicdShow(){}

    public WicdShow(String wicd, String wname) {
        this.wicd = wicd;
        this.wname = wname;
    }

    public WicdShow(String wicd, String wname, String wtime) {
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

    public String getWtime() {
        return wtime;
    }

    public void setWtime(String wtime) {
        this.wtime = wtime;
    }

    @Override
    public String toString() {
        return "WicdShow{" +
                "wicd='" + wicd + '\'' +
                ", wname='" + wname + '\'' +
                ", wtime='" + wtime + '\'' +
                '}';
    }


}
