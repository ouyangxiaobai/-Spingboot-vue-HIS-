package com.neutech.vo.outdepart;

import com.neutech.bean.base.Icd;

public class ICDShow {
    private String icd_ID;
    private String icd_Name;

    public ICDShow(){}
    public ICDShow(String icd_ID, String icd_Name) {
        this.icd_ID = icd_ID;
        this.icd_Name = icd_Name;
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

    @Override
    public String toString() {
        return "ICDShow{" +
                "icd_ID='" + icd_ID + '\'' +
                ", icd_Name='" + icd_Name + '\'' +
                '}';
    }

    public ICDShow(Icd icd){
        this.icd_ID=icd.getIcd_ID();
        this.icd_Name=icd.getIcd_Name();
    }
}
