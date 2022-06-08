package com.neutech.mapper.system;

import com.neutech.bean.system.Sche;
import com.neutech.bean.system.Schedule;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScheduleMapper {

    /*
    * 获取所有人的排班信息
    * */
    public List<Schedule> getAll();

    /*
    * 根据医生的id获取排班信息
    * */
    public Schedule getByID(String id);

    /**
     * 根据科室的id查找该科室下的一生的排班信息
     * @param depID
     * @return
     */
    public List<Schedule> getByDepID(String depID);

    @Select("select * from schedule where schedule_UepNum=#{depID} and schedule_UserID=#{userID} and schedule_Time=#{time}")
    public Sche getByDepUT(String depID,String userID,String time);

    @Delete("delete from schedule where schedule_UepNum = #{depID} ")
    public int deleteByUepNum(String depID);

    public int add(Sche sche);
}
