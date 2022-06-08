package com.neutech.controller.reception;

import com.neutech.service.InquiryService;
import com.neutech.vo.reception.InquiryUpShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
public class InquiryController {

    @Autowired
    InquiryService inquiryService;

    @RequestMapping("/getAllfrees")
    public Map<String,Object> getAll(){
        Map<String,Object> res=inquiryService.getAll();
        return res;
    }

    @PostMapping("/Submitform")
    public Map<String,Object> inquiry(@RequestBody InquiryUpShow inquiryUpShow){
        System.out.println(inquiryUpShow);
        Map<String,Object> res=inquiryService.inquiry(inquiryUpShow);
        return res;
    }
}
