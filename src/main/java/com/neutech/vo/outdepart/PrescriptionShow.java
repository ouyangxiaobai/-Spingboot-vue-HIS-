package com.neutech.vo.outdepart;

import com.neutech.bean.patient.Prescription;

public class PrescriptionShow {
    private String id;
    private String name;
    private String state;

    public PrescriptionShow(){};

    public PrescriptionShow(String id, String name, String state) {
        this.id = id;
        this.name = name;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "PrescriptionShow{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public PrescriptionShow(Prescription prescription){
        this.id=prescription.getPre_ID();
        this.name=prescription.getPre_Name();
        this.state=prescription.getPre_State();
    }
}
