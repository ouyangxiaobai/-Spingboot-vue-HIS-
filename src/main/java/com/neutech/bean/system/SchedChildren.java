package com.neutech.bean.system;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SchedChildren {
    public String time;
    public int number;
    public int max;
    public Date lastTime;

    public SchedChildren(){}

    public SchedChildren(String time, int number, int max) {
        this.time = time;
        this.number = number;
        this.max = max;
    }

    public SchedChildren(String time, int number, int max, Date lastTime) {
        this.time = time;
        this.number = number;
        this.max = max;
        this.lastTime = lastTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public String toString() {
        return "SchedChildren{" +
                "time='" + time + '\'' +
                ", number=" + number +
                ", max=" + max +
                ", lastTime=" + lastTime +
                '}';
    }
}
