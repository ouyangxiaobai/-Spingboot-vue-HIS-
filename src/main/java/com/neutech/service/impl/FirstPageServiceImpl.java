package com.neutech.service.impl;

import com.neutech.bean.patient.FirstPage;
import com.neutech.mapper.patient.FirstpageMapper;
import com.neutech.mapper.patient.PatientregMapper;
import com.neutech.service.FirstpageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FirstPageServiceImpl implements FirstpageService {

    @Autowired
    FirstpageMapper firstpageMapper;

    public Map<String,Object> getFirstpage(String ft_ID){
        HashMap<String,Object> res=new HashMap<>();
        if(firstpageMapper.getFpage(ft_ID)!=null){
            FirstPage firstPage=firstpageMapper.getFpage(ft_ID);
            res.put("fpage",firstPage);
            res.put("isAdd","true");
        }else {
            res.put("isAdd","true");
            res.put("fpage",new FirstPage("","","","","","","","",""));
        }
        return res;
    }

    /**
     * 先判断有就是更新，没有就是添加
     * @param firstPage
     * @return
     */
    public Map<String,Object> addFirstpage(FirstPage firstPage){
        HashMap<String,Object> res=new HashMap<>();
        FirstPage fp;
        if(firstpageMapper.getFpage(firstPage.getFt_ID())!= null){
            firstpageMapper.updateFpage(firstPage);
            res.put("isAdd","gengxin");
        }
        else{
            firstpageMapper.addFpage(firstPage);
            res.put("isAdd","tianjia");
        }
        return res;
    }
}
