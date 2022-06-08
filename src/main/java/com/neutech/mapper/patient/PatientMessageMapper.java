package com.neutech.mapper.patient;

import com.neutech.bean.patient.PatientMessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface PatientMessageMapper {

    /**
     * 根据挂号单号获取这次的诊断结果和处理意见
     * @param regID
     * @return
     */
    @Select("select * from patientmessage where pm_ID=#{regID}")
    public PatientMessage getPmByRegID(String regID);

    /**
     * 更新
     * @param patientMessage
     * @return
     */
    public int updateMessage(PatientMessage patientMessage);

    /**
     * 添加一个新的
     * @param patientMessage
     * @return
     */
    public int addMessage(PatientMessage patientMessage);


}
