package com.neutech.mapper.patient;

import com.neutech.bean.patient.Patientreg;
import com.neutech.vo.outdepart.PatientShow;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface PatientregMapper {

    //函数作用：通过主键查询某一条
    //传入参数：regID
    //返回：Patientreg
    public Patientreg getPatientreg(String reg_ID);

    //函数作用：添加一条
    //传入参数：Patientreg
    //返回：无
    public void addPatientreg(Patientreg patientreg);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<Patientreg>
    @Select("select * from patientreg")
    public List<Patientreg> getAllPatientreg();

    //函数作用：通过某项查询，可以不是主键，一般是病历号
    //传入参数：regPatient
    //返回：List<Patientreg>
    public List<Patientreg> getPatientregBy(String regPatient);

    //函数作用：通过主键删除
    //传入参数：regID
    //返回：无
    @Delete("delete from patientreg where reg_ID = #{reg_ID}")
    public void deletePatientregByNum(String reg_ID);

    //函数作用：编辑保存时更新
    //传入参数：Patientreg
    //返回：1
    public int updatePatientreg(Patientreg patientreg);

    /**
     * 返回的是当天医生今天的挂号的病人的数量
     */
    public List<Patientreg> getByidTime(String docID);

    //通过医生显示门诊页面右侧，患者序号，姓名，挂号单号（隐藏）
//    @Select("SELECT reg_Sn,patient_name,reg_ID from patientreg,patient where reg_optDoc=#{reg_optDoc} " +
//            "and reg_Patient=patient_ID and reg_State=#{reg_State} ")
    public List<PatientShow> getRegByDoc(String reg_optDoc, String reg_State);


    //@Select("SELECT reg_Sn,patient_name,reg_ID from patientreg,patient where reg_optDoc=#{reg_optDoc} and patient_Name=#{patient_Name} and reg_State=#{reg_State} and reg_Patient=patient_ID")
    //通过输入的（医生和）患者姓名，找到患者序号，姓名，挂号单号（隐藏）
    public List<PatientShow> getRegByDocPat(String reg_optDoc,String patient_Name,String reg_State);

    /**
     * 根据挂号状态获取所有的挂号信息
     * @param state
     * @return
     */
    @Select("select * from patientreg where reg_State=#{state}")
    public List<Patientreg> getByState(String state);

    /**
     * 根据挂号状态和病号号获取所有的挂号信息
     * @param med
     * @param state
     * @return
     */
    @Select("select * from patientreg where reg_Patient=#{med} and reg_State=#{state}")
    public List<Patientreg> getByMedAndState(String med,String state);

    //药房显示所有
    @Select("SELECT reg_Sn,patient_name,reg_ID from patientreg,patient where reg_Patient=patient_ID")
    public List<PatientShow> getAllReg();

    //药房患者查询，通过姓名显示
    @Select("SELECT reg_Sn,patient_name,reg_ID from patientreg,patient where patient_Name=#{patient_Name} and reg_Patient=patient_ID")
    public List<PatientShow> getmedpatByName(String patient_Name);

    /**
     * 获取今天挂号的患者
     * @return
     */
    public List<Patientreg> getToday();

}
