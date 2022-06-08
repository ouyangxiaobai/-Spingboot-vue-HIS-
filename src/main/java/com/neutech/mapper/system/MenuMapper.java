package com.neutech.mapper.system;

import com.neutech.bean.system.MainMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    public List<MainMenu> getMenus();
}
