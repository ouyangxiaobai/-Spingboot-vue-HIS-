package com.neutech.bean.system;

import java.util.List;

public class Schedule {
    private String uepNum;
    private String userID;
    private List<SchedChildren> list;
    public Schedule(){};

    public Schedule(String uepNum, String userID, List<SchedChildren> list) {
        this.uepNum = uepNum;
        this.userID = userID;
        this.list = list;
    }

    public String getUepNum() {
        return uepNum;
    }

    public void setUepNum(String uepNum) {
        this.uepNum = uepNum;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public List<SchedChildren> getList() {
        return list;
    }

    public void setList(List<SchedChildren> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "uepNum='" + uepNum + '\'' +
                ", userID='" + userID + '\'' +
                ", list=" + list +
                '}';
    }
}
