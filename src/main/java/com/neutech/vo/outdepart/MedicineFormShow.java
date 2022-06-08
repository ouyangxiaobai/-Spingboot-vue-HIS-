package com.neutech.vo.outdepart;

import com.neutech.bean.base.Medicine;

public class MedicineFormShow {
    private String id;
    private String name;
    private String spec;
    private String un;
    private String manu;
    private String meditype;
    private String type;
    private String up;

    public MedicineFormShow(){};

    public MedicineFormShow(String id, String name, String spec, String un, String manu, String meditype, String type, String up) {
        this.id = id;
        this.name = name;
        this.spec = spec;
        this.un = un;
        this.manu = manu;
        this.meditype = meditype;
        this.type = type;
        this.up = up;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public String getMeditype() {
        return meditype;
    }

    public void setMeditype(String meditype) {
        this.meditype = meditype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    @Override
    public String toString() {
        return "MedicineFormShow{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", spec='" + spec + '\'' +
                ", un='" + un + '\'' +
                ", manu='" + manu + '\'' +
                ", meditype='" + meditype + '\'' +
                ", type='" + type + '\'' +
                ", up='" + up + '\'' +
                '}';
    }

    public MedicineFormShow(Medicine medicine){
        this.id=medicine.getMed_ID();
        this.name=medicine.getMed_Name();
        this.spec=medicine.getMed_Spec();
        this.un=medicine.getMed_Un();
        this.manu=medicine.getMed_Manu();
        this.meditype=medicine.getMed_Type();
        this.type=medicine.getMed_Kind();
        this.up=medicine.getMed_UnitPrice();
    }
}
