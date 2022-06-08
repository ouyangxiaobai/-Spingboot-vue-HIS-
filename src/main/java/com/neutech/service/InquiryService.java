package com.neutech.service;

import com.neutech.vo.reception.InquiryUpShow;

import java.util.Map;

public interface InquiryService {
    public Map<String,Object> getAll();
    public Map<String, Object> inquiry(InquiryUpShow inquiryUpShow);
}
