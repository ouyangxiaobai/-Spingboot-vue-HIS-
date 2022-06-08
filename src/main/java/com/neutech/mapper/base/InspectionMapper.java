package com.neutech.mapper.base;


import com.neutech.bean.base.DepMana;
import com.neutech.bean.base.Inspection;
import com.neutech.bean.base.TechMana;
import com.neutech.vo.outdepart.CommonInsShow;
import com.neutech.vo.outdepart.InspectionShow;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface InspectionMapper {

    //函数作用：通过主键查询某一条
    //传入参数：check_RegID，check_TechID
    //返回：Check
    public Inspection getInspection(String check_RegID, String check_TechID);

    //函数作用：添加一条
    //传入参数：Check
    //返回：无
    public void addInspection(Inspection inspection);

    //函数作用：返回所有
    //传入参数：无
    //返回：List<Check>
    @Select("select * from inspection")
    public List<Inspection> getAllCheck();

    //函数作用：通过某一项查询，可以不是主键
    //传入参数：check
    //返回：List<Check>
    public List<Inspection> getInspectionBy(Inspection inspection);

    //函数作用：通过主键删除
    //传入参数：check_RegID，check_TechID
    //返回：无
    @Delete("delete from inspection where check_RegID=#{check_RegID} and check_TechID=#{check_TechID}")
    public void deleteById(String check_RegID,String check_TechID);


    //更新状态，，，，开立
    //函数作用：编辑的时候保存更新,,,
    //传入参数：Check
    //返回：true/false
    public boolean updateInspection(Inspection inspection);

    //通过挂号单号，显示医技编码、项目、执行科室、单价、状态
    @Select("select techNum,techItem,techExeOff,techUnitPrice,check_State from techmana,inspection where check_RegID=#{check_RegID} and techNum=check_TechID and techType=#{techType}")
    public List<InspectionShow> getByRegID(String check_RegID, String techType);

    //常用项，全部显示
    @Select("select * from comtech where comTechType=#{comTechType}")
    public List<CommonInsShow> getAllIns(String comTechType);

    //科室显示
    @Select("select * from depmana where depType=#{depType}")
    public List<DepMana> getAllInsXZ(String depType);

    //医技名称显示
    @Select("select techNum,techItem,techType,techExeOff,techUnitPrice from techmana,depmana where depNum=#{depNum} and techType=#{techType} and depName=techExeOff")
    public List<TechMana> getAllInsXM(String depNum, String techType);



    //常用项目使用和新增确定--到上面
    @Insert("insert into inspection VALUES (#{check_RegID},#{comTechNum},#{check_State},#{check_Num},#{date})")
    public void addIns(String comTechNum, String check_RegID, String check_State, String check_Num, Date date);

    //常用项目删除
    @Delete("delete from comtech where comTechNum=#{comTechNum}")
    public void deleteComIns(String comTechNum);

    //常用项新增
    @Insert("INSERT INTO comtech VALUES(#{techNum},#{techItem},#{techType},#{techExeOff},#{techUnitPrice})")
    public void addCom(TechMana techMana);

    //通过主键查找常用项
    @Select("Select * from comtech where comTechNum=#{comTechNum}")
    public CommonInsShow getCom(String comTechNum);

    //更新检验状态，检验医生，已完成
    public int updateState(String check_RegID,String check_TechID,String check_State);

}
