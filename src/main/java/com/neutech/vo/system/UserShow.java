package com.neutech.vo.system;

import com.neutech.bean.system.User;

public class UserShow {
    private String id;
    private String password;
    private String name;
    private String systype;
    private String hisrank;
    private String depart;
    private String regtype;
    private boolean show;

    public UserShow() {}

    public UserShow(String id, String password, String name, String systype, String hisrank, String depart, String regtype, boolean show) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.systype = systype;
        this.hisrank = hisrank;
        this.depart = depart;
        this.regtype = regtype;
        this.show = show;
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

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "UserShow{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", systype='" + systype + '\'' +
                ", hisrank='" + hisrank + '\'' +
                ", depart='" + depart + '\'' +
                ", regtype='" + regtype + '\'' +
                ", show=" + show +
                '}';
    }

    //*********************************************************
    public UserShow(User user){
        this.id = user.getId();
        this.password = user.getPassword();
        this.name = user.getName();
        this.systype = user.getSystype();
        this.hisrank = user.getHisrank();
        this.depart = user.getDepart();
        this.regtype = user.getRegtype();
        this.show = false;
    }
}

