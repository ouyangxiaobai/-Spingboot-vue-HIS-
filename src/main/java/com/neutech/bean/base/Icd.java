package com.neutech.bean.base;

public class Icd {
    private String icd_ID;
    private String icd_Name;
    private String icd_Type;

    public Icd(){};

    public Icd(String icd_ID, String icd_Name, String icd_Type) {
        this.icd_ID = icd_ID;
        this.icd_Name = icd_Name;
        this.icd_Type = icd_Type;
    }

    public String getIcd_ID() {
        return icd_ID;
    }

    public void setIcd_ID(String icd_ID) {
        this.icd_ID = icd_ID;
    }

    public String getIcd_Name() {
        return icd_Name;
    }

    public void setIcd_Name(String icd_Name) {
        this.icd_Name = icd_Name;
    }

    public String getIcd_Type() {
        return icd_Type;
    }

    public void setIcd_Type(String icd_Type) {
        this.icd_Type = icd_Type;
    }

    @Override
    public String toString() {
        return "Icd{" +
                "icd_ID='" + icd_ID + '\'' +
                ", icd_Name='" + icd_Name + '\'' +
                ", icd_Type='" + icd_Type + '\'' +
                '}';
    }
}
