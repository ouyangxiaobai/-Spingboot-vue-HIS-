package com.neutech.bean.base;

import com.neutech.vo.medtech.TechShow;
import com.neutech.vo.outdepart.CommonInsShow;

public class TechMana {
    private String techNum;
    private String techItem;
    private String techType;
    private String techExeOff;
    private String techUnitPrice;

    public TechMana(){};

    public TechMana(String techNum, String techItem, String techType, String techExeOff, String techUnitPrice) {
        this.techNum = techNum;
        this.techItem = techItem;
        this.techType = techType;
        this.techExeOff = techExeOff;
        this.techUnitPrice = techUnitPrice;
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

    @Override
    public String toString() {
        return "TechMana{" +
                "techNum='" + techNum + '\'' +
                ", techItem='" + techItem + '\'' +
                ", techType='" + techType + '\'' +
                ", techExeOff='" + techExeOff + '\'' +
                ", techUnitPrice='" + techUnitPrice + '\'' +
                '}';
    }

    public TechMana(TechShow techShow){
        this.techExeOff=techShow.getTechExeOff();
        this.techItem=techShow.getTechItem();
        this.techNum=techShow.getTechNum();
        this.techType=techShow.getTechType();
        this.techUnitPrice=techShow.getTechUnitPrice();
    }
    public TechMana(CommonInsShow commonInsShow){
        this.techNum=commonInsShow.getComTechNum();
        this.techItem=commonInsShow.getComTechItem();
        this.techExeOff=commonInsShow.getComTechExeOff();
        this.techUnitPrice=commonInsShow.getComTechUnitPrice();
        this.techType="检验";
    }

}
