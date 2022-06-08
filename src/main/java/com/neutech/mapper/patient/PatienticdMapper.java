package com.neutech.mapper.patient;

import com.neutech.bean.patient.Patienticd;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PatienticdMapper {

    //函数作用：通过主键查询某一条
    //传入参数：ptiID,挂号单号
    //返回：Patienticd
    public Patienticd getPicd(String pti_ID);

    //函数作用：添加一条
    //传入参数：Patienticd
    //返回：无
    public void addPicd(Patienticd patienticd);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<PatienticdMapper>
    @Select("select * from patienticd")
    public List<Patienticd> getAllPicd();

    //函数作用：通过主键删除
    //传入参数：ptiID
    //返回：无
    @Delete("delete from patienticd where pti_ID = #{pti_ID}")
    public void deletePicdByNum(String pti_ID);

    //函数作用：编辑保存时更新
    //传入参数：Patienticd
    //返回：true/false
    public boolean updatePicd(Patienticd patienticd);

    //-------------------------------------------
    @Select("select * from patienticd where pti_ID = #{pti_ID}")
    public List<Patienticd> getByRegID(String regID);

    /**
     * 根据挂号单号和icd编号删除诊断信息
     * @param regID
     * @param icdID
     * @return
     */
    @Delete("delete from patienticd where pti_ID = #{regID} and pti_ICE=#{icdID}")
    public int deleteByregicd(String regID,String icdID);

    //通过pti_ID得到几个icd_Name,type是西
    @Select("select icd_Name from icd,patienticd where pti_ID=#{pti_ID} and pti_ICE=icd_ID and icd_Type=#{icd_Type}")
    public List<String> getIce(String pti_ID,String icd_Type);
}
