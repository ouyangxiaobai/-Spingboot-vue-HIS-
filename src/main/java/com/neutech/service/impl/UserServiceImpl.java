package com.neutech.service.impl;

import com.neutech.bean.base.DepMana;
import com.neutech.bean.system.User;
import com.neutech.mapper.base.DepMapper;
import com.neutech.mapper.system.UserMapper;
import com.neutech.service.UserService;
import com.neutech.vo.reception.Departoptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    DepMapper depMapper;

    public User getUserByID(String id){
        return userMapper.getUser(id);
    }

    public void addUser(User user){userMapper.addUser(user);}

    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }

    public List<User> getUsersBy(User user){
        return userMapper.getUsersBy(user);
    }

    public void deleteById(String id){
        userMapper.deleteById(id);
    }

    public boolean updateUser(User user){
        return userMapper.updateUser(user);
    }

    //加载用户管理界面搜索功能的下拉框的值
    public Map<String,Object> loading(){
        HashMap<String,Object> res=new HashMap<>();
        /*加载科室名称*/
        List<DepMana> allDep = depMapper.getAllDep();
        List<String> list1=new ArrayList<>();
        for(DepMana dep:allDep){
            if(!list1.contains(dep.getDepName())){
                list1.add(dep.getDepName());
            }
        }
        res.put("deps",list1);
        /*加载医生的职称*/
        List<String> list2= new ArrayList<>();
        List<User> allUsers = userMapper.getAllUsers();
        for(User user : allUsers){
            if(!list2.contains(user.getHisrank())){
                list2.add(user.getHisrank());
            }
        }
        res.put("ranks",list2);
        return res;
    }

    public List<User> getByDeReg(String depart,String regtype){
        List<User> byDeReg = userMapper.getByDeReg(depart, regtype);

        return byDeReg;
    }

}
