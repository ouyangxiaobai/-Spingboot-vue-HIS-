package com.neutech.mapper.base;

import com.neutech.bean.base.Medicine;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MedicineMapper {
    //函数作用：通过主键查询某一条
    //传入参数：med_ID
    //返回：Medicine
    public Medicine getMedicine(String med_ID);

    //函数作用：添加一条
    //传入参数：Medicine
    //返回：无
    public void addMedicine(Medicine medicine);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<Medicine>
    @Select("select * from medicine")
    public List<Medicine> getAllMedicine();

    //函数作用：通过某项查询，可以不是主键
    //传入参数：Medicine
    //返回：List<Medicine>
    public List<Medicine> getMedicineBy(Medicine medicine);

    //函数作用：通过主键删除
    //传入参数：med_ID
    //返回：无
    @Delete("delete from medicine where med_ID=#{med_ID}")
    public void deleteByID(String med_ID);

    //函数作用：编辑保存时更新
    //传入参数：Medicine
    //返回：true/false
    public int updateMedicine(Medicine medicine);

    //通过药品名查询，没有就是空
    public List<Medicine> getByName(String med_Name);
}
