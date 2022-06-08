package com.neutech.vo.outdepart;

public class Chaxun {
    private String payCon;
    private String quantity;
    private String unitPrice;
    private String totalPrice;
    private String payState;
    private String payTime;

    public Chaxun(){}

    public Chaxun(String payCon, String quantity, String unitPrice, String totalPrice, String payState, String payTime) {
        this.payCon = payCon;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.payState = payState;
        this.payTime = payTime;
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

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    @Override
    public String toString() {
        return "Chaxun{" +
                "payCon='" + payCon + '\'' +
                ", quantity='" + quantity + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", payState='" + payState + '\'' +
                ", payTime='" + payTime + '\'' +
                '}';
    }
}
