package com.neutech.mapper.patient;

import com.neutech.bean.patient.Patient;
import com.neutech.vo.outdepart.PatientShow;
import com.neutech.vo.outdepart.PatientUpShow;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PatientMapper {

    //函数作用：通过主键查询某一条
    //传入参数：patient_ID
    //返回：Patient
    public Patient getPatient(String patient_ID);

    //函数作用：添加一条
    //传入参数：Patient
    //返回：无
    public void addPatient(Patient patient);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<Patient>
    @Select("select * from patient")
    public List<Patient> getAllPatient();

    //函数作用：通过某项查询，可以不是主键，一般是姓名
    //传入参数：Medicine
    //返回：List<Medicine>
    public List<Patient> getPatientBy(String patient_Name);

    //函数作用：通过主键删除
    //传入参数：patient_ID
    //返回：无
    @Delete("delete from patient where patient_ID = #{patient_ID}")
    public void deletePatientByNum(String patient_ID);

    //函数作用：编辑保存时更新
    //传入参数：Patient
    //返回：1
    public int updatePatient(Patient patient);

    /**
     * 根据id返回患者
     * @param id
     * @return Patient
     */
    @Select("select * from patient where patient_IdNum=#{id}")
    public Patient getByIDCard(String id);

    //门诊页面上面显示患者姓名、年龄、病历号
    @Select("SELECT patient_Name,patient_Age,patient_ID FROM patient,patientreg WHERE reg_ID=#{reg_ID} AND reg_Patient=patient_ID")
    public PatientUpShow patientupByRegID(String reg_ID);

    public List<Patient> getByPatient(Patient patient);

    //通过医生显示门诊页面右侧，患者序号，姓名，挂号单号（隐藏）
    @Select("SELECT reg_Sn,patient_name,reg_ID from patientreg,patient where reg_optDoc=#{reg_optDoc} and reg_Patient=patient_ID and reg_State=#{reg_State}")
    public List<PatientShow> getRegByDoc(String reg_optDoc, String reg_State);


    //@Select("SELECT reg_Sn,patient_name,reg_ID from patientreg,patient where reg_optDoc=#{reg_optDoc} and patient_Name=#{patient_Name} and reg_State=#{reg_State} and reg_Patient=patient_ID")
    //通过输入的（医生和）患者姓名，找到患者序号，姓名，挂号单号（隐藏）
    public List<PatientShow> getRegByDocPat(String reg_optDoc,String patient_Name,String reg_State);



}
