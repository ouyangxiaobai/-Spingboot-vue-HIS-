package com.neutech.vo.outdepart;

public class PatientUpShow {
    private String patient_Name;
    private String patient_Age;
    private String patient_ID;

    public PatientUpShow(){};

    public PatientUpShow(String patient_Name, String patient_Age, String patient_ID) {
        this.patient_Name = patient_Name;
        this.patient_Age = patient_Age;
        this.patient_ID = patient_ID;
    }

    public String getPatient_Name() {
        return patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        this.patient_Name = patient_Name;
    }

    public String getPatient_Age() {
        return patient_Age;
    }

    public void setPatient_Age(String patient_Age) {
        this.patient_Age = patient_Age;
    }

    public String getPatient_ID() {
        return patient_ID;
    }

    public void setPatient_ID(String patient_ID) {
        this.patient_ID = patient_ID;
    }

    @Override
    public String toString() {
        return "PatientUpShow{" +
                "patient_Name='" + patient_Name + '\'' +
                ", patient_Age='" + patient_Age + '\'' +
                ", patient_ID='" + patient_ID + '\'' +
                '}';
    }
}
