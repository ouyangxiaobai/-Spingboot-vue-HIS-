package com.neutech.bean.system;

import com.neutech.vo.system.UserShow;

public class User {
    private String id;
    private String password;
    private String name;
    private String systype;
    private String hisrank;
    private String depart;
    private String regtype;

    public User(){};

    public User(String id, String password, String name, String systype, String hisrank, String depart, String regtype) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.systype = systype;
        this.hisrank = hisrank;
        this.depart = depart;
        this.regtype = regtype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystype() {
        return systype;
    }

    public void setSystype(String systype) {
        this.systype = systype;
    }

    public String getHisrank() {
        return hisrank;
    }

    public void setHisrank(String hisrank) {
        this.hisrank = hisrank;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getRegtype() {
        return regtype;
    }

    public void setRegtype(String regtype) {
        this.regtype = regtype;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", systype='" + systype + '\'' +
                ", hisrank='" + hisrank + '\'' +
                ", depart='" + depart + '\'' +
                ", regtype='" + regtype + '\'' +
                '}';
    }

    //********************************************************
    public User(UserShow userShow){
        this.id = userShow.getId();
        this.password = userShow.getPassword();
        this.name = userShow.getName();
        this.systype = userShow.getSystype();
        this.hisrank = userShow.getHisrank();
        this.depart = userShow.getDepart();
        this.regtype = userShow.getRegtype();
    }
}
