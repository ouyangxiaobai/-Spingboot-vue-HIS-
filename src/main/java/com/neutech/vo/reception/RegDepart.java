package com.neutech.vo.reception;

public class RegDepart {
    public String value;
    public String regType;
    public String optDoc;

    public RegDepart() {
    }

    public RegDepart(String value, String regType, String optDoc) {
        this.value = value;
        this.regType = regType;
        this.optDoc = optDoc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getOptDoc() {
        return optDoc;
    }

    public void setOptDoc(String optDoc) {
        this.optDoc = optDoc;
    }

    @Override
    public String toString() {
        return "RegDepart{" +
                "value='" + value + '\'' +
                ", regType='" + regType + '\'' +
                ", optDoc='" + optDoc + '\'' +
                '}';
    }
}
