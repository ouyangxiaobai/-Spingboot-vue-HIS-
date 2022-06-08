package com.neutech.bean.patient;

public class PatientMessage {

    private String pm_ID;//挂号单号
    private String pm_Jieguo;
    private String pm_Yijian;

    public PatientMessage() {}

    public PatientMessage(String pm_ID, String pm_Jieguo, String pm_Yijian) {
        this.pm_ID = pm_ID;
        this.pm_Jieguo = pm_Jieguo;
        this.pm_Yijian = pm_Yijian;
    }

    public String getPm_ID() {
        return pm_ID;
    }

    public void setPm_ID(String pm_ID) {
        this.pm_ID = pm_ID;
    }

    public String getPm_Jieguo() {
        return pm_Jieguo;
    }

    public void setPm_Jieguo(String pm_Jieguo) {
        this.pm_Jieguo = pm_Jieguo;
    }

    public String getPm_Yijian() {
        return pm_Yijian;
    }

    public void setPm_Yijian(String pm_Yijian) {
        this.pm_Yijian = pm_Yijian;
    }

    @Override
    public String toString() {
        return "patientMessage{" +
                "pm_ID='" + pm_ID + '\'' +
                ", pm_Jieguo='" + pm_Jieguo + '\'' +
                ", pm_Yijian='" + pm_Yijian + '\'' +
                '}';
    }
}
