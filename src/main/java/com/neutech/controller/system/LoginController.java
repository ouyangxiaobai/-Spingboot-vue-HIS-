package com.neutech.controller.system;

import com.neutech.bean.system.User;
import com.neutech.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/*
* @CrossOrigin：跨域
* @RestController:标识只返回字符串，而不是视图解析
* */

@CrossOrigin
@RestController
public class LoginController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/login")//登录功能的实现
    public Map<String,Object> login(@RequestBody User user){
        User user2 = userService.getUserByID(user.getId());
        HashMap<String,Object> res=new HashMap<>();
        String flag="no";
        if(user2==null){//无效用户
            res.put("flag",flag);
            return res;
        }
        /*数据库中有此id*/
        if(user.getPassword().equals(user2.getPassword())){//验证成功
            flag="yes";
            res.put("user",user2);
        }
        res.put("flag",flag);
        return res;
    }




}
