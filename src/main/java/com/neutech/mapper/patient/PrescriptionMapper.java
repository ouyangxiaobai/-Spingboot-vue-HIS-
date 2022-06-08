package com.neutech.mapper.patient;

import com.neutech.bean.patient.Prescription;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PrescriptionMapper {
    //函数作用：通过主键查询某一条
    //传入参数：pre_ID,pre_RegID
    //返回：Prescription
    public Prescription getPrescription(String pre_ID, String pre_RegID);

    //函数作用：添加一条
    //传入参数：Prescription
    //返回：无
    public void addPrescription(Prescription prescription);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<Prescription>
    @Select("select * from prescription")
    public List<Prescription> getAllPrescription();


    //函数作用：通过主键删除
    //传入参数：pre_ID,pre_RegID
    //返回：无
    @Delete("delete from prescription where pre_ID = #{pre_ID} and pre_RegID=#{pre_RegID}")
    public void deletePrescriptionByNum(String pre_ID, String pre_RegID);

    //函数作用：编辑保存时更新
    //传入参数：Prescription
    //返回：1
    public int updatePrescription(Prescription prescription);

    //通过pre_RegID返回所有
    @Select("select * from prescription where pre_RegID=#{pre_RegID}")
    public List<Prescription> getAllByReg(String pre_RegID);
}
