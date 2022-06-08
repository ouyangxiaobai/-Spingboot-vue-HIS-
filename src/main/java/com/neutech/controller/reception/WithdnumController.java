package com.neutech.controller.reception;

import com.neutech.service.WithdnumService;
import com.neutech.vo.reception.WithShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
public class WithdnumController {
    @Autowired
    WithdnumService withdnumService;

    @RequestMapping("/reception/loadingwith")
    public Map<String,Object> loadingreg(){//退号页面加载信息

        return withdnumService.loading();
    }

    @RequestMapping("/reception/withby")
    public Map<String,Object> searchby(@RequestBody Map<String,Object> map){
        String medRecNum=(String)map.get("medRecNum");
        String name=(String)map.get("name");
        String idNum=(String)map.get("idNum");
        return withdnumService.searchBy(medRecNum,name,idNum);

    }

    @PostMapping("/reception/czwith")
    public Map<String,Object> czwith(@RequestBody WithShow withShow){
        int i = withdnumService.backH(withShow.getRegID());
        String s="true";
        if(i==0){
            s="false";
        }
        Map<String,Object> map= new HashMap<>();
        map.put("flag",s);
        return map;
    }
}
