package com.neutech.vo.reception;

public class InquiryUpShow {
    private String medRecNum;
    private String name;
    private String idNum;

    public InquiryUpShow(){}

    public InquiryUpShow(String medRecNum, String name, String idNum) {
        this.medRecNum = medRecNum;
        this.name = name;
        this.idNum = idNum;
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

    @Override
    public String toString() {
        return "InquiryUpShow{" +
                "medRecNum='" + medRecNum + '\'' +
                ", name='" + name + '\'' +
                ", idNum='" + idNum + '\'' +
                '}';
    }
}
