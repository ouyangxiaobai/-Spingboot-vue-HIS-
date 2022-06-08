package com.neutech.vo.reception;
//medRecNum: 'abfassd',
//        name: '王小虎',
//        idNum: '上海市普陀区金沙江路 1518 弄',
//        regDate: '2021.6.5',
//        optDepart: '内科',
//        state: '未诊'
public class WithShow {
    private String regID;
    private String medRecNum;
    private String name;
    private String idNum;
    private String regDate;
    private String optDepart;
    private String state;

    public WithShow() {
    }

    public WithShow(String regID, String medRecNum, String name, String idNum, String regDate, String optDepart, String state) {
        this.regID = regID;
        this.medRecNum = medRecNum;
        this.name = name;
        this.idNum = idNum;
        this.regDate = regDate;
        this.optDepart = optDepart;
        this.state = state;
    }

    public String getRegID() {
        return regID;
    }

    public void setRegID(String regID) {
        this.regID = regID;
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

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getOptDepart() {
        return optDepart;
    }

    public void setOptDepart(String optDepart) {
        this.optDepart = optDepart;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "WithShow{" +
                "regID='" + regID + '\'' +
                ", medRecNum='" + medRecNum + '\'' +
                ", name='" + name + '\'' +
                ", idNum='" + idNum + '\'' +
                ", regDate='" + regDate + '\'' +
                ", optDepart='" + optDepart + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
