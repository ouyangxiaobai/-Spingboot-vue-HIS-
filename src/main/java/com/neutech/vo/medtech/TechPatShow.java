package com.neutech.vo.medtech;

public class TechPatShow {
    private String id;
    private String name;
    private String num;
    private String unp;
    private String totalp;
    private String state;

    public TechPatShow(){};

    public TechPatShow(String id, String name, String num, String unp, String totalp, String state) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.unp = unp;
        this.totalp = totalp;
        this.state = state;
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getUnp() {
        return unp;
    }

    public void setUnp(String unp) {
        this.unp = unp;
    }

    public String getTotalp() {
        return totalp;
    }

    public void setTotalp(String totalp) {
        this.totalp = totalp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TechPatShow{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", unp='" + unp + '\'' +
                ", totalp='" + totalp + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
