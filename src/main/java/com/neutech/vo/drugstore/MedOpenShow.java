package com.neutech.vo.drugstore;

public class MedOpenShow {
    private String cid;
    private String mid;
    private String mname;
    private String mspe;
    private String mun;
    private String mman;
    private String mp;
    private String mtype;
    private String munp;
    private String mnum;
    private String mstate;
    private String mtotal;

    public MedOpenShow(){};

    public MedOpenShow(String cid, String mid, String mname, String mspe, String mun, String mman, String mp, String mtype, String munp, String mnum, String mstate, String mtotal) {
        this.cid = cid;
        this.mid = mid;
        this.mname = mname;
        this.mspe = mspe;
        this.mun = mun;
        this.mman = mman;
        this.mp = mp;
        this.mtype = mtype;
        this.munp = munp;
        this.mnum = mnum;
        this.mstate = mstate;
        this.mtotal = mtotal;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMspe() {
        return mspe;
    }

    public void setMspe(String mspe) {
        this.mspe = mspe;
    }

    public String getMun() {
        return mun;
    }

    public void setMun(String mun) {
        this.mun = mun;
    }

    public String getMman() {
        return mman;
    }

    public void setMman(String mman) {
        this.mman = mman;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getMunp() {
        return munp;
    }

    public void setMunp(String munp) {
        this.munp = munp;
    }

    public String getMnum() {
        return mnum;
    }

    public void setMnum(String mnum) {
        this.mnum = mnum;
    }

    public String getMstate() {
        return mstate;
    }

    public void setMstate(String mstate) {
        this.mstate = mstate;
    }

    public String getMtotal() {
        return mtotal;
    }

    public void setMtotal(String mtotal) {
        this.mtotal = mtotal;
    }

    @Override
    public String toString() {
        return "MedOpenShow{" +
                "cid='" + cid + '\'' +
                ", mid='" + mid + '\'' +
                ", mname='" + mname + '\'' +
                ", mspe='" + mspe + '\'' +
                ", mun='" + mun + '\'' +
                ", mman='" + mman + '\'' +
                ", mp='" + mp + '\'' +
                ", mtype='" + mtype + '\'' +
                ", munp='" + munp + '\'' +
                ", mnum='" + mnum + '\'' +
                ", mstate='" + mstate + '\'' +
                ", mtotal='" + mtotal + '\'' +
                '}';
    }
}
