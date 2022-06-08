package com.neutech.vo.reception;

public class InquiryShow {
    private String medRecNum;
    private String name;
    private String idNum;
    private String payCon;
    private String quantity;
    private String unitPrice;
    private String totalPrice;
    private String itemState;
    private String payTime;

    public InquiryShow(){};

    public InquiryShow(String medRecNum, String name, String idNum, String payCon, String quantity, String unitPrice, String totalPrice, String itemState, String payTime) {
        this.medRecNum = medRecNum;
        this.name = name;
        this.idNum = idNum;
        this.payCon = payCon;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.itemState = itemState;
        this.payTime = payTime;
    }

    public String getMedRecNum() {
        return medRecNum;
    }

    public void setMedRecNum(String medRecNum) {
        this.medRecNum = medRecNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getPayCon() {
        return payCon;
    }

    public void setPayCon(String payCon) {
        this.payCon = payCon;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getItemState() {
        return itemState;
    }

    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    @Override
    public String toString() {
        return "InquiryShow{" +
                "medRecNum='" + medRecNum + '\'' +
                ", name='" + name + '\'' +
                ", idNum='" + idNum + '\'' +
                ", payCon='" + payCon + '\'' +
                ", quantity='" + quantity + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", itemState='" + itemState + '\'' +
                ", payTime='" + payTime + '\'' +
                '}';
    }
}
