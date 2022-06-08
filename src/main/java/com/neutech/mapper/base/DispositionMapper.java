package com.neutech.mapper.base;

import com.neutech.bean.base.Disposition;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DispositionMapper {
    //函数作用：通过主键查询某一条
    //传入参数：dis_RegID,dis_TechID
    //返回：Disposition
    public Disposition getDis(String dis_RegID,String dis_TechID);

    //函数作用：添加一条
    //传入参数：disposition
    //返回：无
    public void addDis(Disposition disposition);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<Disposition>
    @Select("select * from disposition")
    public List<Disposition> getAllDis();

    //函数作用：通过某项查询，可以不是主键
    //传入参数：Disposition
    //返回：List<Disposition>
    public List<Disposition> getDisBy(Disposition disposition);

    //函数作用：通过主键删除
    //传入参数：dis_RegID,dis_TechID
    //返回：无
    @Delete("delete from disposition where dis_RegID=#{dis_RegID} and dis_TechID=#{dis_TechID}")
    public void deleteByID(String dis_RegID,String dis_TechID);

    //函数作用：编辑保存时更新
    //传入参数：Disposition
    //返回：true/false
    public boolean updateDis(Disposition disposition);
}
