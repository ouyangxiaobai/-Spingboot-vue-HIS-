package com.neutech.service;

import com.neutech.bean.base.DepMana;
import com.neutech.util.SelectK;
import com.neutech.vo.reception.Departoptions;

import java.util.List;
import java.util.Map;

public interface LoadingS {
    /**
     * 返回的是门诊科室
     * @return
     */
    public List<Departoptions> sitRegDep();

    /**
     * 返回的是所有门诊科室（通用型）
     * 已经改成科室（label，value）的形式
     * @return
     */
    public List<SelectK> getDepManas();
}
