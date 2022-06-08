package com.neutech.mapper.system;

import com.neutech.bean.system.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

   public User getUser(String id);

   public void addUser(User user);

   @Select("select * from user")
   public List<User> getAllUsers();

   public List<User> getUsersBy(User user);

   @Delete("delete from user where id = #{id}")
   public void deleteById(String id);

   //@Update("update user set id=#{id},password=#{password},name=#{name},systype=#{systype},rank=#{rank},depart=#{depart},regtype=#{regtype} where id=#{id}")
   public boolean updateUser(User user);

   @Select("select * from user where depart=#{depart} and regtype=#{regtype} ")
   public List<User> getByDeReg(String depart,String regtype);

   @Select("select * from user where id=#{id}")
   public User getUserByID(String userID);

}
