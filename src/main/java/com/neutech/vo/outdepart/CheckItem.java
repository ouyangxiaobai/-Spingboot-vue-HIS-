package com.neutech.vo.outdepart;
//        type: 'a',
//        name: 'a',
//        time: 'a',
//        picture: 'a'
public class CheckItem {//确诊页面显示的检查项
    private String type;
    private String name;
    private String time;
    private String picture;

    public CheckItem() {
    }

    public CheckItem(String type, String name, String time, String picture) {
        this.type = type;
        this.name = name;
        this.time = time;
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "CheckItem{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
