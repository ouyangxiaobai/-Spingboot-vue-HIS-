package com.neutech.bean.patient;

import com.neutech.vo.reception.RegForm;

import java.util.Date;

public class Patientreg {
    private String reg_ID;
    private String reg_Patient;
    private String reg_State;
    private String reg_Depart;
    private String reg_Type;
    private String reg_optDoc;
    private String reg_billNum;
    private Date reg_Date;
    private String reg_Sn;

    public Patientreg(){};

    public Patientreg(String reg_ID, String reg_Patient, String reg_State, String reg_Depart, String reg_Type, String reg_optDoc, String reg_billNum, Date reg_Date, String reg_Sn) {
        this.reg_ID = reg_ID;
        this.reg_Patient = reg_Patient;
        this.reg_State = reg_State;
        this.reg_Depart = reg_Depart;
        this.reg_Type = reg_Type;
        this.reg_optDoc = reg_optDoc;
        this.reg_billNum = reg_billNum;
        this.reg_Date = reg_Date;
        this.reg_Sn = reg_Sn;
    }

    public String getReg_ID() {
        return reg_ID;
    }

    public void setReg_ID(String reg_ID) {
        this.reg_ID = reg_ID;
    }

    public String getReg_Patient() {
        return reg_Patient;
    }

    public void setReg_Patient(String reg_Patient) {
        this.reg_Patient = reg_Patient;
    }

    public String getReg_State() {
        return reg_State;
    }

    public void setReg_State(String reg_State) {
        this.reg_State = reg_State;
    }

    public String getReg_Depart() {
        return reg_Depart;
    }

    public void setReg_Depart(String reg_Depart) {
        this.reg_Depart = reg_Depart;
    }

    public String getReg_Type() {
        return reg_Type;
    }

    public void setReg_Type(String reg_Type) {
        this.reg_Type = reg_Type;
    }

    public String getReg_optDoc() {
        return reg_optDoc;
    }

    public void setReg_optDoc(String reg_optDoc) {
        this.reg_optDoc = reg_optDoc;
    }

    public String getReg_billNum() {
        return reg_billNum;
    }

    public void setReg_billNum(String reg_billNum) {
        this.reg_billNum = reg_billNum;
    }

    public Date getReg_Date() {
        return reg_Date;
    }

    public void setReg_Date(Date reg_Date) {
        this.reg_Date = reg_Date;
    }

    public String getReg_Sn() {
        return reg_Sn;
    }

    public void setReg_Sn(String reg_Sn) {
        this.reg_Sn = reg_Sn;
    }

    @Override
    public String toString() {
        return "Patientreg{" +
                "reg_ID='" + reg_ID + '\'' +
                ", reg_Patient='" + reg_Patient + '\'' +
                ", reg_State='" + reg_State + '\'' +
                ", reg_Depart='" + reg_Depart + '\'' +
                ", reg_Type='" + reg_Type + '\'' +
                ", reg_optDoc='" + reg_optDoc + '\'' +
                ", reg_billNum='" + reg_billNum + '\'' +
                ", reg_Date=" + reg_Date +
                ", reg_Sn='" + reg_Sn + '\'' +
                '}';
    }

    //挂号页面需要的，将挂号页面的数据包装成挂号信息
    public Patientreg(RegForm regForm){
        this.reg_ID=regForm.getRegFormNum();//regFormNum挂单单号
        this.reg_Patient=regForm.getMedRecNum();//病历号
        this.reg_billNum=regForm.getBillNum();//billNum发票号
        this.reg_State="已挂号";//挂号状态
        this.reg_Type=regForm.getRegDepart().getRegType();//挂号类型
        this.reg_optDoc=regForm.getRegDepart().getOptDoc();//挂号的医生
        this.reg_Date=regForm.getRegDate();//挂号日期
        this.reg_Sn=regForm.getSeqNum();//seqNum序号
        this.reg_Depart=regForm.getRegDepart().getValue();//挂号科室
    }
}
