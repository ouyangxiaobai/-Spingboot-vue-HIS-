package com.neutech.controller.outdepart;

import com.neutech.service.ChaxunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
public class ChaxunController {

    @Autowired
    ChaxunService chaxunService;

    @PostMapping("/recption/inq/selectuser")
    public Map<String,Object> getAll(@RequestBody Map<String,Object> map){
        String RegID=(String)map.get("regID");
        Map<String,Object> res=chaxunService.getAll(RegID);
        return res;
    }
}
