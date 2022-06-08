package com.neutech.vo.system;

import com.neutech.bean.base.DepMana;

public class DepShow {
    private String depNum;
    private String depName;
    private String depType;
    private boolean Show;

    public DepShow(){};

    public DepShow(String depNum, String depName, String depType, boolean show) {
        this.depNum = depNum;
        this.depName = depName;
        this.depType = depType;
        Show = show;
    }

    public String getDepNum() {
        return depNum;
    }

    public void setDepNum(String depNum) {
        this.depNum = depNum;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepType() {
        return depType;
    }

    public void setDepType(String depType) {
        this.depType = depType;
    }

    public boolean isShow() {
        return Show;
    }

    public void setShow(boolean show) {
        Show = show;
    }

    @Override
    public String toString() {
        return "DepShow{" +
                "depNum='" + depNum + '\'' +
                ", depName='" + depName + '\'' +
                ", depType='" + depType + '\'' +
                ", Show=" + Show +
                '}';
    }

    public DepShow(DepMana depMana){
        this.depName=depMana.getDepName();
        this.depNum=depMana.getDepNum();
        this.depType=depMana.getDepType();
        this.Show=false;
    }
}
