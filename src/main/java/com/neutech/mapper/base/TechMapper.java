package com.neutech.mapper.base;


import com.neutech.bean.base.TechMana;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TechMapper {
    //函数作用：通过主键查询某一条
    //传入参数：techMum
    //返回：TechMana
    public TechMana getTech(String techNum);

    //函数作用：添加一条
    //传入参数：TechMana
    //返回：无
    public void addTech(TechMana techMana);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<TechMana>
    @Select("select * from techMana")
    public List<TechMana> getAllDep();

    //函数作用：返回所有
    //传入参数：无
    //返回：List<TechMana>
    @Select("select * from techMana")
    public List<TechMana> getAllTech();

    //函数作用：通过某项查询，可以不是主键
    //传入参数：TechMana
    //返回：List<TechMana>
    public List<TechMana> getTechBy(String techItem);

    //函数作用：通过主键删除
    //传入参数：techNum
    //返回：无
    @Delete("delete from techmana where techNum = #{techNum}")
    public void deleteByNum(String techNum);

    //函数作用：编辑保存时更新
    //传入参数：TechMana
    //返回：true/false
    public int updateTech(TechMana techMana);
}
