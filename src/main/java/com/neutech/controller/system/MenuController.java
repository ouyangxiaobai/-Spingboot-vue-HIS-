package com.neutech.controller.system;

import com.neutech.bean.system.MainMenu;
import com.neutech.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class MenuController {
    @Autowired
    MenuServiceImpl menuServiceImpl;

    @PostMapping("/menus")
    public Map<String,Object> getAllMenus(@RequestBody Map<String, Object> map){
        HashMap<String,Object> res=new HashMap<>();
        String judge= (String) map.get("userid");
        List<MainMenu> mainMenus=new ArrayList<>();
        mainMenus= menuServiceImpl.judgeMenus(judge);
        res.put("menus",mainMenus);
        return res;
    }
}
