package com.neutech.mapper.base;

import com.neutech.bean.base.Icd;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IcdMapper {
    //函数作用：通过主键查询某一条
    //传入参数：icdID
    //返回：Icd
    public Icd getIcd(String icd_ID);

    //函数作用：添加一条
    //传入参数：Icd
    //返回：无
    public void addIcd(Icd icd);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<Icd>
    @Select("select * from icd")
    public List<Icd> getAllIcd();

    //函数作用：通过某项查询，可以不是主键
    //传入参数：Icd
    //返回：List<Icd>
    public List<Icd> getIcdBy(Icd icd);

    //函数作用：通过主键删除
    //传入参数：icdID
    //返回：无
    @Delete("delete from icd where icd_ID=#{icdID}")
    public void deleteById(String icdID);

    //函数作用：编辑保存时更新
    //传入参数：Icd
    //返回：true/false
    public boolean updateIcd(Icd icd);

    @Select("select * from icd where icd_Type=#{type}")
    public List<Icd> getByType(String type);
}
