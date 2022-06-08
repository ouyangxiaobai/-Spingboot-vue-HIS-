package com.neutech.service;

import com.neutech.bean.system.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    public User getUserByID(String id);

    public void addUser(User user);

    public List<User> getAllUsers();

    public List<User> getUsersBy(User user);

    public void deleteById(String id);

    public boolean updateUser(User user);

    public Map<String,Object> loading();

    /*根据科室和号别查找医生*/
    public List<User> getByDeReg(String depart,String regtype);

}