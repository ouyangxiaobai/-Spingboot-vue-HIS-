package com.neutech.vo.system;

public class DocTableData {
    private String id;
    private String name;
    private boolean check11;
    private boolean check12;
    private boolean check21;
    private boolean check22;
    private boolean check31;
    private boolean check32;
    private boolean check41;
    private boolean check42;
    private boolean check51;
    private boolean check52;
    private boolean check61;
    private boolean check62;
    private boolean check71;
    private boolean check72;

    public DocTableData(){
        this.id="";
        this.name = "";
        this.check11 = false;
        this.check12 = false;
        this.check21 = false;
        this.check22 = false;
        this.check31 = false;
        this.check32 = false;
        this.check41 = false;
        this.check42 = false;
        this.check51 = false;
        this.check52 = false;
        this.check61 = false;
        this.check62 = false;
        this.check71 = false;
        this.check72 = false;
    };

    public DocTableData(String id,String name, boolean check11, boolean check12, boolean check21, boolean check22, boolean check31, boolean check32, boolean check41, boolean check42, boolean check51, boolean check52, boolean check61, boolean check62, boolean check71, boolean check72) {
        this.id=id;
        this.name = name;
        this.check11 = check11;
        this.check12 = check12;
        this.check21 = check21;
        this.check22 = check22;
        this.check31 = check31;
        this.check32 = check32;
        this.check41 = check41;
        this.check42 = check42;
        this.check51 = check51;
        this.check52 = check52;
        this.check61 = check61;
        this.check62 = check62;
        this.check71 = check71;
        this.check72 = check72;
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

    public boolean getCheck11() {
        return check11;
    }

    public void setCheck11(boolean check11) {
        this.check11 = check11;
    }

    public boolean getCheck12() {
        return check12;
    }

    public void setCheck12(boolean check12) {
        this.check12 = check12;
    }

    public boolean getCheck21() {
        return check21;
    }

    public void setCheck21(boolean check21) {
        this.check21 = check21;
    }

    public boolean getCheck22() {
        return check22;
    }

    public void setCheck22(boolean check22) {
        this.check22 = check22;
    }

    public boolean getCheck31() {
        return check31;
    }

    public void setCheck31(boolean check31) {
        this.check31 = check31;
    }

    public boolean getCheck32() {
        return check32;
    }

    public void setCheck32(boolean check32) {
        this.check32 = check32;
    }

    public boolean getCheck41() {
        return check41;
    }

    public void setCheck41(boolean check41) {
        this.check41 = check41;
    }

    public boolean getCheck42() {
        return check42;
    }

    public void setCheck42(boolean check42) {
        this.check42 = check42;
    }

    public boolean getCheck51() {
        return check51;
    }

    public void setCheck51(boolean check51) {
        this.check51 = check51;
    }

    public boolean getCheck52() {
        return check52;
    }

    public void setCheck52(boolean check52) {
        this.check52 = check52;
    }

    public boolean getCheck61() {
        return check61;
    }

    public void setCheck61(boolean check61) {
        this.check61 = check61;
    }

    public boolean getCheck62() {
        return check62;
    }

    public void setCheck62(boolean check62) {
        this.check62 = check62;
    }

    public boolean getCheck71() {
        return check71;
    }

    public void setCheck71(boolean check71) {
        this.check71 = check71;
    }

    public boolean getCheck72() {
        return check72;
    }

    public void setCheck72(boolean check72) {
        this.check72 = check72;
    }

    @Override
    public String toString() {
        return "DocTableData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", check11=" + check11 +
                ", check12=" + check12 +
                ", check21=" + check21 +
                ", check22=" + check22 +
                ", check31=" + check31 +
                ", check32=" + check32 +
                ", check41=" + check41 +
                ", check42=" + check42 +
                ", check51=" + check51 +
                ", check52=" + check52 +
                ", check61=" + check61 +
                ", check62=" + check62 +
                ", check71=" + check71 +
                ", check72=" + check72 +
                '}';
    }
}
