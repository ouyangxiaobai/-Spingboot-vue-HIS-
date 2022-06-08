package com.neutech.bean.base;

import com.neutech.vo.system.DepShow;

public class DepMana {
    private String depNum;
    private String depName;
    private String depType;

    public DepMana(){};

    public DepMana(String depNum, String depName, String depType){
        this.depNum=depNum;
        this.depName=depName;
        this.depType=depType;
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


    @Override
    public String toString() {
        return "depMana{" +
                "depNum='" + depNum + '\'' +
                ", depName='" + depName + '\'' +
                ", depType='" + depType + '\'' +
                '}';
    }

    public DepMana(DepShow depShow){
        this.depName=depShow.getDepName();
        this.depNum=depShow.getDepNum();
        this.depType=depShow.getDepType();
    }
}
