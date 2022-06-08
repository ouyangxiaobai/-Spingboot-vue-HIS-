package com.neutech.service;

import com.neutech.bean.base.Disposition;
import com.neutech.bean.base.Icd;
import com.neutech.bean.base.Inspection;
import com.neutech.bean.patient.PatientMessage;
import com.neutech.vo.outdepart.CheckItem;
import com.neutech.vo.outdepart.EicdShow;
import com.neutech.vo.outdepart.WicdShow;

import java.util.List;
import java.util.Map;

public interface DiagnoseService {
    /**
     * 根据挂号单号获取该病人所有的检验项
     * @param reg_ID
     * @return
     */
    public List<CheckItem> getInspection(String reg_ID);

    /**
     * 获取中西医诊断
     * @return
     */
    public Map<String,Object> getICD(String regID);

    /**
     * 获取诊断结果和处理意见
     * @param regID
     * @return
     */
    public PatientMessage getMessage(String regID);

    /**
     * 获取所有的诊断，用于初始化选项
     * @return
     */
    public Map<String,Object> getICD();

    /**
     * 根据挂号单号和icd编号删除诊断信息
     * @param regID
     * @param icdID
     * @return
     */
    public int deleteByregicd(String regID,String icdID);

    /**
     * 更新处理意见和诊断结果
     * @param patientMessage
     * @return
     */
    public int updateMessage(PatientMessage patientMessage);

    /**
     * 添加中西医诊断
     * @param regID
     * @param icdID
     * @return
     */
    public int addicd(String regID,String icdID);

    /**
     * 删除中西医诊断
     * @param regID
     * @param icdID
     * @return
     */
    public int delete(String regID,String icdID);

    /**
     * 根据挂号单号让其变成已就诊
     * @param regID
     * @return
     */
    public int zhenbi(String regID);
}
