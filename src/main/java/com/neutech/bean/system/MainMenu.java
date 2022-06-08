package com.neutech.bean.system;

import java.util.List;

public class MainMenu {
    private int id;
    private String title;
    private List<SubMenu> sList;

    public MainMenu(){}

    public MainMenu(String title, String path, List<SubMenu> sList) {
        this.title = title;
        this.sList = sList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubMenu> getsList() {
        return sList;
    }

    public void setsList(List<SubMenu> sList) {
        this.sList = sList;
    }

    @Override
    public String toString() {
        return "MainMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sList=" + sList +
                '}';
    }
}
