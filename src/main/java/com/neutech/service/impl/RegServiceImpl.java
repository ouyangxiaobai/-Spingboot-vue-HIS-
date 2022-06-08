package com.neutech.service.impl;

import com.neutech.bean.patient.Patient;
import com.neutech.bean.patient.Patientreg;
import com.neutech.bean.system.SchedChildren;
import com.neutech.bean.system.Schedule;
import com.neutech.bean.system.User;
import com.neutech.mapper.patient.PatientMapper;
import com.neutech.mapper.patient.PatientregMapper;
import com.neutech.mapper.system.ScheduleMapper;
import com.neutech.service.RegService;
import com.neutech.service.UserService;
import com.neutech.util.MyUtil;
import com.neutech.vo.reception.RegForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RegServiceImpl implements RegService {
    @Autowired
    ScheduleMapper scheduleMapper;
    @Autowired
    UserService userService;
    @Autowired
    PatientMapper patientMapper;
    @Autowired
    PatientregMapper patientregMapper;



    @Override
    public int getRegNumber(String id) {//获取的是这个时间上班的医生
        Schedule byID = scheduleMapper.getByID(id);
        if(byID==null){//如果查不到排班信息就返回0
            return 0;
        }
        String week= MyUtil.getNow();
        List<SchedChildren> list = byID.getList();
        for(SchedChildren sc:list){
            if(sc.time.equals(week)){
                return sc.getNumber();
            }
        }
        return 0;
    }
    @Override
    public List<User> getByDeReg(String depart, String regtype){
        List<User> byDeReg = userService.getByDeReg(depart, regtype);

        List<User> list=new ArrayList<>();
        for(User user:byDeReg){
            if(getRegNumber(user.getId())!=0){
                list.add(user);
            }
        }
        return list;
    }

    @Override
    public Map<String,Object> getFetchdate(String docID,String idNum) {//获取billNum发票号   regFormNum挂单单号   seqNum序号   regTime(时间非日期)
        Map<String,Object> res=new HashMap<>();
        String billNum = MyUtil.getRand(8);
        String regFormNum = MyUtil.getPID();
        int seqNum=getNowNum(docID)+1;
        String regTime = MyUtil.dateToS(new Date());
        Patient byIDCard = patientMapper.getByIDCard(idNum);
        if(byIDCard!=null){
            res.put("medRecNum",byIDCard.getPatient_ID());
        }else {
            res.put("medRecNum",MyUtil.getRand(8));
        }
        res.put("billNum",billNum);
        res.put("regFormNum",regFormNum);
        res.put("seqNum",seqNum);
        res.put("regTime",regTime);
        return res;
    }

    @Override
    public Map<String, Object> getPatient(String id) {
        Map<String,Object> map=new HashMap<>();
        Patient patient = patientMapper.getByIDCard(id);
        if(patient==null){
            map.put("flag","false");
        }else {
            map.put("patient",patient);
            map.put("flag","true");
        }

        return map;
    }

    @Override
    public int getNowNum(String docId) {
        List<Patientreg> Patientregs = patientregMapper.getByidTime(docId);
        int i=0;
        for(Patientreg patientreg:Patientregs){
            if(!patientreg.getReg_State().equals("已退号")){//不是已退号都算医生的工作量
                if(MyUtil.getDay().equals(MyUtil.getDay(patientreg.getReg_Date()))){//如果当前的上下午一致，就算数
                    ++i;
                }
            }
        }
        return i;
    }

    @Override
    public void add(RegForm regForm) {
        Patientreg patientreg=new Patientreg(regForm);//挂号信息：用来添加到数据库
        Patient patient=new Patient(regForm);//患者基本信息
        patient.setPatient_DataBirth(patient.getPatient_DataBirth().substring(0,10));

        Patient byIDCard = patientMapper.getByIDCard(patient.getPatient_IdNum());
        if(byIDCard!=null){//如果已存在此用户，就更新数据库
            patientMapper.updatePatient(patient);
        }else {//否则就添加
            patientMapper.addPatient(patient);
        }
        patientregMapper.addPatientreg(patientreg);
//        System.out.println(regForm);
//        System.out.println(patientreg);
//        System.out.println(patient);
    }


}
