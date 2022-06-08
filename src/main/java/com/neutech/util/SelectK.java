package com.neutech.util;

public class SelectK {
    private String label;
    private String value;

    public SelectK(){};
    public SelectK(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SelectK{" +
                "label='" + label + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
