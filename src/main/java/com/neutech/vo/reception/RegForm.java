package com.neutech.vo.reception;


import com.neutech.util.MyUtil;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.util.Date;

public class RegForm {
    private String medRecNum;
    private String name;
    private String sex;
    private String age;
    private String idNum;
    private String dateBirth;
    private String address;
    private RegDepart regDepart;
    private String regCost;
    private String billNum;
    private String regFormNum;
    private String seqNum;
    private Date regDate;
    private String restNum;

    public RegForm(){}

    public RegForm(String medRecNum, String name, String sex, String age, String idNum, String dateBirth, String address, RegDepart regDepart, String regCost, String billNum, String regFormNum, String seqNum, Date regDate, String restNum) {
        this.medRecNum = medRecNum;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idNum = idNum;
        this.dateBirth = dateBirth;
        this.address = address;
        this.regDepart = regDepart;
        this.regCost = regCost;
        this.billNum = billNum;
        this.regFormNum = regFormNum;
        this.seqNum = seqNum;
        this.regDate = regDate;
        this.restNum = restNum;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RegDepart getRegDepart() {
        return regDepart;
    }

    public void setRegDepart(RegDepart regDepart) {
        this.regDepart = regDepart;
    }

    public String getRegCost() {
        return regCost;
    }

    public void setRegCost(String regCost) {
        this.regCost = regCost;
    }

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public String getRegFormNum() {
        return regFormNum;
    }

    public void setRegFormNum(String regFormNum) {
        this.regFormNum = regFormNum;
    }

    public String getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(String seqNum) {
        this.seqNum = seqNum;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) throws ParseException {
        this.regDate = MyUtil.sToDate(regDate);
    }

    public String getRestNum() {
        return restNum;
    }

    public void setRestNum(String restNum) {
        this.restNum = restNum;
    }

    @Override
    public String toString() {
        return "RegForm{" +
                "medRecNum='" + medRecNum + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", idNum='" + idNum + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", address='" + address + '\'' +
                ", regDepart=" + regDepart +
                ", regCost='" + regCost + '\'' +
                ", billNum='" + billNum + '\'' +
                ", regFormNum='" + regFormNum + '\'' +
                ", seqNum='" + seqNum + '\'' +
                ", regDate=" + regDate +
                ", restNum='" + restNum + '\'' +
                '}';
    }
}
