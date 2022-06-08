package com.neutech.controller.system;



import com.neutech.bean.base.DepMana;
import com.neutech.service.DepService;
import com.neutech.vo.system.DepShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class DepController {

    @Autowired
    DepService depService;

    @RequestMapping("/addDep")//添加科室
    public Map<String,Object> addDep(@RequestBody DepMana depMana) {
        Map<String,Object> res=depService.addDep(depMana);
        return res;
    }

    @RequestMapping("/getAllDep")
    public Map<String,Object> getAllDep(){
        Map<String,Object> res=depService.getAllDep();
        return res;
    }

    @RequestMapping("/getDepBy")
    public Map<String,Object> getDepBy(@RequestBody DepMana depMana){

        Map<String,Object> res=depService.getDepBy(depMana);
        return res;
    }

    @RequestMapping("/deleteByNum")
    public Map<String,Object> deleteByNum(@RequestBody DepShow dep){
        Map<String,Object> res=depService.deleteByNum(dep);
        return res;
    }

    @RequestMapping("/updateDep")
    public Map<String,Object> updateDep(@RequestBody DepShow dep){

        Map<String,Object> res=depService.updateDep(dep);
        return res;
    }
}
