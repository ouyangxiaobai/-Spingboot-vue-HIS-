package com.neutech.vo.system;

import java.util.List;

public class ListTableData {
    private String depID;
    private List<DocTableData> list;

    public ListTableData() {
    }

    public ListTableData(String depID, List<DocTableData> list) {
        this.depID = depID;
        this.list = list;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public List<DocTableData> getList() {
        return list;
    }

    public void setList(List<DocTableData> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ListTableData{" +
                "depID='" + depID + '\'' +
                ", list=" + list +
                '}';
    }
}
