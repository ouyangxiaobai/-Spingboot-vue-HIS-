package com.neutech.vo.drugstore;

import com.neutech.bean.base.Medicine;

public class MedicineShow {
    private String med_ID;
    private String med_Name;
    private String med_Spec;
    private String med_Un;
    private String med_Manu;
    private String med_Type;
    private String med_UnitPrice;
    private String med_Kind;
    private String med_State;
    private boolean show;

    public MedicineShow(){};

    public MedicineShow(String med_ID, String med_Name, String med_Spec, String med_Un, String med_Manu, String med_Type, String med_UnitPrice, String med_Kind, String med_State, boolean show) {
        this.med_ID = med_ID;
        this.med_Name = med_Name;
        this.med_Spec = med_Spec;
        this.med_Un = med_Un;
        this.med_Manu = med_Manu;
        this.med_Type = med_Type;
        this.med_UnitPrice = med_UnitPrice;
        this.med_Kind = med_Kind;
        this.med_State = med_State;
        this.show = show;
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

    public boolean getShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "MedicineShow{" +
                "med_ID='" + med_ID + '\'' +
                ", med_Name='" + med_Name + '\'' +
                ", med_Spec='" + med_Spec + '\'' +
                ", med_Un='" + med_Un + '\'' +
                ", med_Manu='" + med_Manu + '\'' +
                ", med_Type='" + med_Type + '\'' +
                ", med_UnitPrice='" + med_UnitPrice + '\'' +
                ", med_Kind='" + med_Kind + '\'' +
                ", med_State='" + med_State + '\'' +
                ", show=" + show +
                '}';
    }

    public MedicineShow(Medicine medicine){
        this.med_ID=medicine.getMed_ID();
        this.med_Name=medicine.getMed_Name();
        this.med_Spec=medicine.getMed_Spec();
        this.med_Un=medicine.getMed_Un();
        this.med_Manu=medicine.getMed_Manu();
        this.med_Type=medicine.getMed_Type();
        this.med_UnitPrice=medicine.getMed_UnitPrice();
        this.med_Kind=medicine.getMed_Kind();
        this.med_State=medicine.getMed_State();
        this.show=false;
    }
}
