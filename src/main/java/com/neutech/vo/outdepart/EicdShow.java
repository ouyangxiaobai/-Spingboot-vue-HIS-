package com.neutech.vo.outdepart;

public class EicdShow {
    private String eicd;
    private String ename;
    private String etime;

    public EicdShow() {
    }

    public EicdShow(String eicd, String ename) {
        this.eicd = eicd;
        this.ename = ename;
    }

    public EicdShow(String eicd, String ename, String etime) {
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

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    @Override
    public String toString() {
        return "EicdShow{" +
                "eicd='" + eicd + '\'' +
                ", ename='" + ename + '\'' +
                ", etime='" + etime + '\'' +
                '}';
    }
}
