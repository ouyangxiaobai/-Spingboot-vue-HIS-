package com.neutech.mapper.base;

import com.neutech.bean.base.DepMana;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepMapper {

    //函数作用：通过主键查询某一条
    //传入参数：depNum
    //返回：DepMana
    public DepMana getDep(String depNum);

    //函数作用：添加一条
    //传入参数：depMana
    //返回：无
    public void addDep(DepMana depMana);

    //函数作用：查询所有
    //传入参数：无
    //返回：List<DepMana>
    @Select("select * from depMana")
    public List<DepMana> getAllDep();

    //函数作用：通过某一项查询，可以不是主键
    //传入参数：DepMana
    //返回：List<DepMana>
    public List<DepMana> getDepBy(DepMana depMana);

    //函数作用：通过主键删除
    //传入参数：depNum
    //返回：无
    @Delete("delete from depmana where depNum = #{depNum}")
    public void deleteByNum(String depNum);

    //函数作用：更新，编辑保存时
    //传入参数：depMana
    //返回：true/false
    public boolean updateDep(DepMana depMana);

}
