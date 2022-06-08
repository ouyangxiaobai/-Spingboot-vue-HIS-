package com.neutech.vo.outdepart;

import com.neutech.bean.base.TechMana;

public class CommonInsShow {
    private String comTechNum;
    private String comTechItem;//医技项目名
    private String comTechExeOff;//执行科室
    private String comTechUnitPrice;//单价

    public CommonInsShow(){};

    public CommonInsShow(String comTechNum, String comTechItem, String comTechExeOff, String comTechUnitPrice) {
        this.comTechNum = comTechNum;
        this.comTechItem = comTechItem;
        this.comTechExeOff = comTechExeOff;
        this.comTechUnitPrice = comTechUnitPrice;
    }

    public String getComTechNum() {
        return comTechNum;
    }

    public void setComTechNum(String comTechNum) {
        this.comTechNum = comTechNum;
    }

    public String getComTechItem() {
        return comTechItem;
    }

    public void setComTechItem(String comTechItem) {
        this.comTechItem = comTechItem;
    }

    public String getComTechExeOff() {
        return comTechExeOff;
    }

    public void setComTechExeOff(String comTechExeOff) {
        this.comTechExeOff = comTechExeOff;
    }

    public String getComTechUnitPrice() {
        return comTechUnitPrice;
    }

    public void setComTechUnitPrice(String comTechUnitPrice) {
        this.comTechUnitPrice = comTechUnitPrice;
    }

    @Override
    public String toString() {
        return "CommonInsShow{" +
                "comTechNum='" + comTechNum + '\'' +
                ", comTechItem='" + comTechItem + '\'' +
                ", comTechExeOff='" + comTechExeOff + '\'' +
                ", comTechUnitPrice='" + comTechUnitPrice + '\'' +
                '}';
    }

    public CommonInsShow(TechMana techMana){
        this.comTechExeOff=techMana.getTechExeOff();
        this.comTechItem=techMana.getTechItem();
        this.comTechNum=techMana.getTechNum();
        this.comTechUnitPrice=techMana.getTechUnitPrice();
    }
}
