package com.neutech.bean.patient;

public class FirstPage {
    private String ft_ID;
    private String ft_MainSuit;
    private String ft_PreMedHis;
    private String ft_PreMedHisCureSitu;
    private String ft_PastHis;
    private String ft_IrriHis;
    private String ft_PhyExam;
    private String ft_PreDiag;
    private String ft_ExamSugg;

    public FirstPage(){};

    public FirstPage(String ft_ID, String ft_MainSuit, String ft_PreMedHis, String ft_PreMedHisCureSitu, String ft_PastHis, String ft_IrriHis, String ft_PhyExam, String ft_PreDiag, String ft_ExamSugg) {
        this.ft_ID = ft_ID;
        this.ft_MainSuit = ft_MainSuit;
        this.ft_PreMedHis = ft_PreMedHis;
        this.ft_PreMedHisCureSitu = ft_PreMedHisCureSitu;
        this.ft_PastHis = ft_PastHis;
        this.ft_IrriHis = ft_IrriHis;
        this.ft_PhyExam = ft_PhyExam;
        this.ft_PreDiag = ft_PreDiag;
        this.ft_ExamSugg = ft_ExamSugg;
    }

    public String getFt_ID() {
        return ft_ID;
    }

    public void setFt_ID(String ft_ID) {
        this.ft_ID = ft_ID;
    }

    public String getFt_MainSuit() {
        return ft_MainSuit;
    }

    public void setFt_MainSuit(String ft_MainSuit) {
        this.ft_MainSuit = ft_MainSuit;
    }

    public String getFt_PreMedHis() {
        return ft_PreMedHis;
    }

    public void setFt_PreMedHis(String ft_PreMedHis) {
        this.ft_PreMedHis = ft_PreMedHis;
    }

    public String getFt_PreMedHisCureSitu() {
        return ft_PreMedHisCureSitu;
    }

    public void setFt_PreMedHisCureSitu(String ft_PreMedHisCureSitu) {
        this.ft_PreMedHisCureSitu = ft_PreMedHisCureSitu;
    }

    public String getFt_PastHis() {
        return ft_PastHis;
    }

    public void setFt_PastHis(String ft_PastHis) {
        this.ft_PastHis = ft_PastHis;
    }

    public String getFt_IrriHis() {
        return ft_IrriHis;
    }

    public void setFt_IrriHis(String ft_IrriHis) {
        this.ft_IrriHis = ft_IrriHis;
    }

    public String getFt_PhyExam() {
        return ft_PhyExam;
    }

    public void setFt_PhyExam(String ft_PhyExam) {
        this.ft_PhyExam = ft_PhyExam;
    }

    public String getFt_PreDiag() {
        return ft_PreDiag;
    }

    public void setFt_PreDiag(String ft_PreDiag) {
        this.ft_PreDiag = ft_PreDiag;
    }

    public String getFt_ExamSugg() {
        return ft_ExamSugg;
    }

    public void setFt_ExamSugg(String ft_ExamSugg) {
        this.ft_ExamSugg = ft_ExamSugg;
    }

    @Override
    public String toString() {
        return "FirstPage{" +
                "ft_ID='" + ft_ID + '\'' +
                ", ft_MainSuit='" + ft_MainSuit + '\'' +
                ", ft_PreMedHis='" + ft_PreMedHis + '\'' +
                ", ft_PreMedHisCureSitu='" + ft_PreMedHisCureSitu + '\'' +
                ", ft_PastHis='" + ft_PastHis + '\'' +
                ", ft_IrriHis='" + ft_IrriHis + '\'' +
                ", ft_PhyExam='" + ft_PhyExam + '\'' +
                ", ft_PreDiag='" + ft_PreDiag + '\'' +
                ", ft_ExamSugg='" + ft_ExamSugg + '\'' +
                '}';
    }
}
