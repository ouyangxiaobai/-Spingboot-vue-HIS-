package com.neutech.vo.outdepart;

public class PremedShow {
    private String id;
    private String name;
    private String spec;
    private String un;
    private String manu;
    private String type;
    private String fre;
    private String up;
    private String num;
    private String total;

    public PremedShow(){};

    public PremedShow(String id, String name, String spec, String un, String manu, String type, String fre, String up, String num, String total) {
        this.id = id;
        this.name = name;
        this.spec = spec;
        this.un = un;
        this.manu = manu;
        this.type = type;
        this.fre = fre;
        this.up = up;
        this.num = num;
        this.total = total;
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

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFre() {
        return fre;
    }

    public void setFre(String fre) {
        this.fre = fre;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PremedShow{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", spec='" + spec + '\'' +
                ", un='" + un + '\'' +
                ", manu='" + manu + '\'' +
                ", type='" + type + '\'' +
                ", fre='" + fre + '\'' +
                ", up='" + up + '\'' +
                ", num='" + num + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
