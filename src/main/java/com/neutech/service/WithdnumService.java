package com.neutech.service;

import com.neutech.bean.patient.Patientreg;

import java.util.List;
import java.util.Map;

public interface WithdnumService {
    /**
     * 获取所有的挂号信息（状态为已挂号的）
     * @return
     */
    public Map<String,Object> loading();

    /**
     *根据病历号，姓名，身份证号查找
     * @param medRecNum 病历号
     * @param name 姓名
     * @param idNum 身份证号
     * @return
     */
    public Map<String,Object> searchBy(String medRecNum,String name,String idNum);

    /**
     * 查找病历号是id的并且已挂号和已退号的
     * @param id
     * @return
     */
    public List<Patientreg> getyw(String id);

    /**
     * 根据挂号单号退号
     * @param regID
     * @return
     */
    public int backH(String regID);
}
