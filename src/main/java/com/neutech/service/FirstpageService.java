package com.neutech.service;

import com.neutech.bean.patient.FirstPage;
import com.neutech.mapper.patient.FirstpageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

public interface FirstpageService {

    public Map<String,Object> getFirstpage(String ft_ID);
    public Map<String,Object> addFirstpage(FirstPage firstPage);
}
