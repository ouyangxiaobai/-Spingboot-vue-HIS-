package com.neutech.mapper.patient;

import com.neutech.bean.patient.Premed;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PremedMapper {
    //函数作用：通过主键查询某一条
    //传入参数：pm_PreID,pm_MedID
    //返回：Premed
    public Premed getPremed(String pm_PreID, String pm_MedID);

    //函数作用：添加一条
    //传入参数：Premed
    //返回：无
    public void addPremed(Premed premed);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<Premed>
    @Select("select * from premed")
    public List<Premed> getAllPremed();


    //函数作用：通过主键删除
    //传入参数：pm_PreID,pm_MedID
    //返回：无
    @Delete("delete from premed where pm_PreID = #{pm_PreID} and pm_MedID=#{pm_MedID}")
    public void deletePremedByNum(String pm_PreID, String pm_MedID);

    //函数作用：编辑保存时更新
    //传入参数：Premed
    //返回：1
    public int updatePremed(Premed premed);

    //更新状态，已完成，药房更新
    public void updateState(String pm_PreID,String pm_MedID,String pm_State);

    //更新状态，已开立，门诊医生更新
    public void updateMZState(String pm_PreID,String pm_State);
}
