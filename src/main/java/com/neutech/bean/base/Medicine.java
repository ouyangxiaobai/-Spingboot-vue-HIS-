package com.neutech.bean.base;

import com.neutech.vo.drugstore.MedicineShow;

public class Medicine {
    private String med_ID;
    private String med_Name;
    private String med_Spec;
    private String med_Un;
    private String med_Manu;
    private String med_Type;
    private String med_UnitPrice;
    private String med_Kind;
    private String med_State;

    public Medicine(){};

    public Medicine(String med_ID, String med_Name, String med_Spec, String med_Un, String med_Manu, String med_Type, String med_UnitPrice, String med_Kind, String med_State) {
        this.med_ID = med_ID;
        this.med_Name = med_Name;
        this.med_Spec = med_Spec;
        this.med_Un = med_Un;
        this.med_Manu = med_Manu;
        this.med_Type = med_Type;
        this.med_UnitPrice = med_UnitPrice;
        this.med_Kind = med_Kind;
        this.med_State = med_State;
    }

    public String getMed_ID() {
        return med_ID;
    }

    public void setMed_ID(String med_ID) {
        this.med_ID = med_ID;
    }

    public String getMed_Name() {
        return med_Name;
    }

    public void setMed_Name(String med_Name) {
        this.med_Name = med_Name;
    }

    public String getMed_Spec() {
        return med_Spec;
    }

    public void setMed_Spec(String med_Spec) {
        this.med_Spec = med_Spec;
    }

    public String getMed_Un() {
        return med_Un;
    }

    public void setMed_Un(String med_Un) {
        this.med_Un = med_Un;
    }

    public String getMed_Manu() {
        return med_Manu;
    }

    public void setMed_Manu(String med_Manu) {
        this.med_Manu = med_Manu;
    }

    public String getMed_Type() {
        return med_Type;
    }

    public void setMed_Type(String med_Type) {
        this.med_Type = med_Type;
    }

    public String getMed_UnitPrice() {
        return med_UnitPrice;
    }

    public void setMed_UnitPrice(String med_UnitPrice) {
        this.med_UnitPrice = med_UnitPrice;
    }

    public String getMed_Kind() {
        return med_Kind;
    }

    public void setMed_Kind(String med_Kind) {
        this.med_Kind = med_Kind;
    }

    public String getMed_State() {
        return med_State;
    }

    public void setMed_State(String med_State) {
        this.med_State = med_State;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "med_ID='" + med_ID + '\'' +
                ", med_Name='" + med_Name + '\'' +
                ", med_Spec='" + med_Spec + '\'' +
                ", med_Un='" + med_Un + '\'' +
                ", med_Manu='" + med_Manu + '\'' +
                ", med_Type='" + med_Type + '\'' +
                ", med_UnitPrice='" + med_UnitPrice + '\'' +
                ", med_Kind='" + med_Kind + '\'' +
                ", med_State='" + med_State + '\'' +
                '}';
    }

    public Medicine(MedicineShow medicineShow){
        this.med_ID=medicineShow.getMed_ID();
        this.med_Name=medicineShow.getMed_Name();
        this.med_Spec=medicineShow.getMed_Spec();
        this.med_Un=medicineShow.getMed_Un();
        this.med_Manu=medicineShow.getMed_Manu();
        this.med_Type=medicineShow.getMed_Type();
        this.med_UnitPrice=medicineShow.getMed_UnitPrice();
        this.med_Kind=medicineShow.getMed_Kind();
        this.med_State=medicineShow.getMed_State();
    }
}
