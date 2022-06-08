package com.neutech.controller.outdepart;

import com.neutech.bean.patient.FirstPage;
import com.neutech.service.FirstpageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin
@RestController
public class FirstPageController {

    @Autowired
    FirstpageService firstpageService;

    @PostMapping("/addbingli")
    public Map<String,Object> getFpage(@RequestBody Map<String,Object> map){
        String ft_ID=(String) map.get("patient_reg_id");

        Map<String,Object> res=firstpageService.getFirstpage(ft_ID);
        return res;
    }

    @PostMapping("/addfpage")
    public Map<String,Object> addFirstpage(@RequestBody FirstPage firstPage){
        Map<String,Object> res=firstpageService.addFirstpage(firstPage);
        return res;
    }
}
