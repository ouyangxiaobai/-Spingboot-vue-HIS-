package com.neutech.vo.medtech;

import com.neutech.bean.base.TechMana;

public class TechShow {
    private String techNum;
    private String techItem;
    private String techType;
    private String techExeOff;
    private String techUnitPrice;
    private boolean show;

    public TechShow(){};

    public TechShow(String techNum, String techItem, String techType, String techExeOff, String techUnitPrice, boolean show) {
        this.techNum = techNum;
        this.techItem = techItem;
        this.techType = techType;
        this.techExeOff = techExeOff;
        this.techUnitPrice = techUnitPrice;
        this.show = show;
    }

    public String getTechNum() {
        return techNum;
    }

    public void setTechNum(String techNum) {
        this.techNum = techNum;
    }

    public String getTechItem() {
        return techItem;
    }

    public void setTechItem(String techItem) {
        this.techItem = techItem;
    }

    public String getTechType() {
        return techType;
    }

    public void setTechType(String techType) {
        this.techType = techType;
    }

    public String getTechExeOff() {
        return techExeOff;
    }

    public void setTechExeOff(String techExeOff) {
        this.techExeOff = techExeOff;
    }

    public String getTechUnitPrice() {
        return techUnitPrice;
    }

    public void setTechUnitPrice(String techUnitPrice) {
        this.techUnitPrice = techUnitPrice;
    }

    public boolean getShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "TechShow{" +
                "techNum='" + techNum + '\'' +
                ", techItem='" + techItem + '\'' +
                ", techType='" + techType + '\'' +
                ", techExeOff='" + techExeOff + '\'' +
                ", techUnitPrice='" + techUnitPrice + '\'' +
                ", show=" + show +
                '}';
    }

    public TechShow(TechMana techMana){
        this.techNum=techMana.getTechNum();
        this.techItem=techMana.getTechItem();
        this.techType=techMana.getTechType();
        this.techExeOff=techMana.getTechExeOff();
        this.techUnitPrice=techMana.getTechUnitPrice();
        this.show=false;
    }
}
