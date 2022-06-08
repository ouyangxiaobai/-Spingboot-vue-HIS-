package com.neutech.mapper.patient;


import com.neutech.bean.patient.FirstPage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FirstpageMapper {

    //函数作用：通过主键查询某一条
    //传入参数：ftID
    //返回：FirstPage
    public FirstPage getFpage(String ft_ID);

    //函数作用：添加一条
    //传入参数：FirstPage
    //返回：无
    public void addFpage(FirstPage firstPage);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<FirstpageMapper>
    @Select("select * from firstpage")
    public List<FirstPage> getAllFpage();

    //函数作用：通过主键删除
    //传入参数：ftID
    //返回：无
    @Delete("delete from firstpage where ft_ID = #{ftID}")
    public void deleteFpageByNum(String ftID);

    //函数作用：编辑保存时更新
    //传入参数：FirstPage
    //返回：true/false
    public boolean updateFpage(FirstPage firstPage);
}
