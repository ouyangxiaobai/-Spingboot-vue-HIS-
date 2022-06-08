package com.neutech.vo.outdepart;

public class InspectionShow {
    private String techNum;
    private String techItem;//医技项目名
    private String techExeOff;//执行科室
    private String techUnitPrice;//单价
    private String check_State;

    public InspectionShow(){}


    public InspectionShow(String techNum, String techItem, String techExeOff, String techUnitPrice, String check_State) {
        this.techNum = techNum;
        this.techItem = techItem;
        this.techExeOff = techExeOff;
        this.techUnitPrice = techUnitPrice;
        this.check_State = check_State;
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

    public String getCheck_State() {
        return check_State;
    }

    public void setCheck_State(String check_State) {
        this.check_State = check_State;
    }

    @Override
    public String toString() {
        return "InspectionShow{" +
                "techNum='" + techNum + '\'' +
                ", techItem='" + techItem + '\'' +
                ", techExeOff='" + techExeOff + '\'' +
                ", techUnitPrice='" + techUnitPrice + '\'' +
                ", check_State='" + check_State + '\'' +
                '}';
    }
}
