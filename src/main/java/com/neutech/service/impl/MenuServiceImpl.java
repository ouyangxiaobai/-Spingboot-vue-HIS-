package com.neutech.service.impl;

import com.neutech.bean.system.MainMenu;
import com.neutech.mapper.system.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl {
    @Autowired
    MenuMapper menuMapper;

    public List<MainMenu> getMenus(){
        return menuMapper.getMenus();
    }

    public List<MainMenu> judgeMenus(String judge)
    {
        List<MainMenu> menus = menuMapper.getMenus();
        List<MainMenu> mainMenus=new ArrayList<>();
        if(judge.equals("前台"))
        {
            for(MainMenu m: menus)
            {
                if(m.getId()==0)
                {
                    mainMenus.add(m);
                }
            }
        }
        if(judge.equals("门诊"))
        {
            for(MainMenu m: menus)
            {
                if(m.getId()==1)
                {
                    mainMenus.add(m);
                }
            }
        }
        if(judge.equals("医技"))
        {
            for(MainMenu m: menus)
            {
                if(m.getId()==2)
                {
                    mainMenus.add(m);
                }
            }
        }
        if(judge.equals("药房"))
        {
            for(MainMenu m: menus)
            {
                if(m.getId()==3)
                {
                    mainMenus.add(m);
                }
            }
        }
        if(judge.equals("信息科"))
        {
            for(MainMenu m: menus)
            {
                if(m.getId()==4)
                {
                    mainMenus.add(m);
                }
            }
        }
        if(judge.equals("系统管理员"))
        {
            for(MainMenu m: menus)
            {
                mainMenus.add(m);
            }
        }
        return mainMenus;
    }
}
