package com.neutech.controller.system;

import com.neutech.bean.system.User;
import com.neutech.service.UserService;
import com.neutech.vo.system.UserShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class SysUserController {

    @Autowired
    UserService userService;

    @RequestMapping("/adduser")//添加系统用户的实现
    public Map<String,Object> addUser(@RequestBody User user){
        HashMap<String,Object> res=new HashMap<>();
        if(userService.getUserByID(user.getId())!=null){
            res.put("isAdd","false");
        }else {
            userService.addUser(user);
            res.put("isAdd","true");
        }
        return res;
    }

    @RequestMapping("/getAllUsers")
    public Map<String,Object> getAllUsers(){
        HashMap<String,Object> res=new HashMap<>();
        List<User> allUsers = userService.getAllUsers();
        List<UserShow> allUserShow=new ArrayList<>();
        for(User user: allUsers){
            allUserShow.add(new UserShow(user));
        }
//        System.out.println(allUsers);
        res.put("Users",allUserShow);
        return res;
    }

    @RequestMapping("/getUsersBy")
    public Map<String ,Object> getUsersBy(@RequestBody User user){
        String flag="no";
       //System.out.println(user);
        HashMap<String,Object> res=new HashMap<>();
        List<User> users = userService.getUsersBy(user);
       //System.out.println(users);
        List<UserShow> allUserShow=new ArrayList<>();
        for(User userw: users){
            allUserShow.add(new UserShow(userw));
        }
        if(users.size()!=0){
            flag="yes";
        }
        res.put("flag",flag);
        res.put("users",allUserShow);
        return res;
    }

    @RequestMapping("/deleteById")
    public Map<String ,Object> deleteById(@RequestBody UserShow user){
        String id=user.getId();
        HashMap<String,Object> res=new HashMap<>();
        String flag="yes";
        userService.deleteById(id);

        res.put("flag",flag);
        return res;
    }

    @RequestMapping("/updateUser")
    public Map<String ,Object> updataUser(@RequestBody UserShow user){
        User user1=new User(user);
        boolean isupdate = userService.updateUser(user1);
        HashMap<String,Object> res=new HashMap<>();
        String flag="yes";

        return res;
    }

    @RequestMapping("/userloading")
    public Map<String,Object> loading(){
        Map<String, Object> loading = userService.loading();
        return loading;
    }

}
