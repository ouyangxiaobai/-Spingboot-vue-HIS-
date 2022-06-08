package com.neutech.controller.reception;

import com.neutech.bean.patient.Patient;
import com.neutech.bean.patient.Patientreg;
import com.neutech.bean.system.User;
import com.neutech.service.LoadingS;
import com.neutech.service.RegService;
import com.neutech.service.UserService;
import com.neutech.util.MyUtil;
import com.neutech.util.SelectK;
import com.neutech.vo.reception.Departoptions;
import com.neutech.vo.reception.RegDepart;
import com.neutech.vo.reception.RegForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class SiteRegController {


    @Autowired
    LoadingS loadingS;
    @Autowired
    UserService userService;
    @Autowired
    RegService regService;

    /*
    * 加载挂号科室的信息*/
    @RequestMapping("/reception/regloaddep")
    public Map<String,Object> loading(){
        Map<String,Object> res=new HashMap<>();
        List<Departoptions> list = loadingS.sitRegDep();
        res.put("deps",list);
        return res;
    }


    /*
    * 获取并加载当前科室和号别的医生(有余号的)
    * */
    @RequestMapping("/reception/selbydoc")
    public Map<String,Object> SelBydoc(@RequestBody RegDepart regDepart){
        Map<String,Object> res=new HashMap<>();
        if(regDepart.getValue()==null||regDepart.getRegType()==null){//如果没有科室或号别就直接返回null
            return res;
        }
        //根据科室和号别获取医生（有问题，需要动态查询挂号信息,目前是静态）
        List<User> list = regService.getByDeReg(regDepart.getValue(), regDepart.getRegType());

        List<SelectK> list2= new ArrayList<>();
        for(User user1:list){
            list2.add(new SelectK(user1.getName(),user1.getId()));
        }
        res.put("doc",list2);
        if(regDepart.getRegType().equals("专家号")){
            res.put("type","50");
        }else if(regDepart.getRegType().equals("普通号")){
            res.put("type","20");
        }else res.put("type","");
        return res;

    }

    /**
     * 获取当前医生的余号，已经是实时的，已经判断了上下午
     * @param regDepart
     * @return
     */
    @PostMapping("/reception/getRgeNumber")
    public int getNumber(@RequestBody RegDepart regDepart){
        String docID=regDepart.getOptDoc();
        return regService.getRegNumber(docID)-regService.getNowNum(docID);
    }

    /**
     * 获取medRecNum病历号 billNum发票号   regFormNum挂单单号   seqNum序号   regTime(时间非日期)
     */
    @PostMapping("/reception/fetchdate")
    public Map<String,Object> getFetchdate(@RequestBody Map<String,Object> map){
        String optDoc =(String)map.get("optDoc");
        String idNum =(String)map.get("idNum");
        Map<String,Object> res=regService.getFetchdate(optDoc,idNum);
        return res;
    }

    /**
     * 根据身份证号查询是否存在这个病人，并返回其基本的数据
     */
    @PostMapping("/reception/getPatient")
    public Map<String,Object> getPatient(@RequestBody Map<String,Object> map){
        String idNum =(String)map.get("idNum");
        Map<String, Object> patient = regService.getPatient(idNum);
        return patient;
    }

    /**
     * 真正实现了挂号的功能
     * @param regForm
     * @return
     */
    @PostMapping("/reception/addReg")
    public Map<String,Object> addReg(@RequestBody RegForm regForm){

        regService.add(regForm);
        Map<String,Object> res=new HashMap<>();
        res.put("isAdd","true");
        return res;
    }


}
