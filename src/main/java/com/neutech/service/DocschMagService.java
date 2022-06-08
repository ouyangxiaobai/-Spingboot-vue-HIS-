package com.neutech.service;

import com.neutech.bean.system.Schedule;
import com.neutech.vo.system.DocTableData;
import com.neutech.vo.system.ListTableData;

import java.util.List;

public interface DocschMagService {

    /**
     * 根据科室的id找到这个科室下的所有的医生的排班信息
     * @param depID
     * @return
     */
    public List<DocTableData> getByDep(String depID);

    /**
     * 更新排班信息
     * @param list
     * @return
     */
    public boolean update(ListTableData list);
}
