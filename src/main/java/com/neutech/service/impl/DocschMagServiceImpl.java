package com.neutech.service.impl;

import com.neutech.bean.base.DepMana;
import com.neutech.bean.system.Sche;
import com.neutech.bean.system.SchedChildren;
import com.neutech.bean.system.Schedule;
import com.neutech.bean.system.User;
import com.neutech.mapper.base.DepMapper;
import com.neutech.mapper.system.ScheduleMapper;
import com.neutech.mapper.system.UserMapper;
import com.neutech.service.DocschMagService;
import com.neutech.vo.system.DocTableData;
import com.neutech.vo.system.ListTableData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocschMagServiceImpl implements DocschMagService {

    @Autowired
    ScheduleMapper scheduleMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    DepMapper depMapper;
    @Override
    public List<DocTableData> getByDep(String depID) {
        List<DocTableData> list=new ArrayList<>();
        DepMana dep = depMapper.getDep(depID);
        String depName = dep.getDepName();
        User us=new User();
        us.setDepart(depName);
        List<User> usersBy = userMapper.getUsersBy(us);//获取到了这个科室下的所有的医生
        List<Schedule> byDepID = scheduleMapper.getByDepID(depID);//获取到了排班表该中所有的医生
        for(User user1:usersBy){
            DocTableData doc= new DocTableData();
            doc.setId(user1.getId());//设置医生id
            doc.setName(user1.getName());//设置医生姓名
            for(Schedule sc:byDepID){//循环科室中的医生
                if(sc.getUserID().equals(user1.getId())){//如果id一致，就是这个医生
                    List<SchedChildren> list1 = sc.getList();
                    for(SchedChildren scd:list1){//循环医生的上班信息
                        if(scd.getTime().equals("周一上午")){//周一上午
                            doc.setCheck11(true);
                        }else if(scd.getTime().equals("周一下午")){//周一下午
                            doc.setCheck12(true);
                        }else if(scd.getTime().equals("周二上午")){//周二上午
                            doc.setCheck21(true);
                        }else if(scd.getTime().equals("周二下午")){//周二下午
                            doc.setCheck22(true);
                        }else if(scd.getTime().equals("周三上午")){//周三上午
                            doc.setCheck31(true);
                        }else if(scd.getTime().equals("周三下午")){//周三下午
                            doc.setCheck32(true);
                        }else if(scd.getTime().equals("周四上午")){//周四上午
                            doc.setCheck41(true);
                        }else if(scd.getTime().equals("周四下午")){//周四下午
                            doc.setCheck42(true);
                        }else if(scd.getTime().equals("周五上午")){//周五上午
                            doc.setCheck51(true);
                        }else if(scd.getTime().equals("周五下午")){//周五下午
                            doc.setCheck52(true);
                        }else if(scd.getTime().equals("周六上午")){//周六上午
                            doc.setCheck61(true);
                        }else if(scd.getTime().equals("周六下午")){//周六下午
                            doc.setCheck62(true);
                        }else if(scd.getTime().equals("周日上午")){//周日上午
                            doc.setCheck71(true);
                        }else if(scd.getTime().equals("周日下午")) {//周日下午
                            doc.setCheck72(true);
                        }
                    }
                }
            }
            list.add(doc);
        }
        return list;
    }


    @Override
    public boolean update(ListTableData list) {
        String depID=list.getDepID();//科室id
        if(depID==null||depID.equals(""))return false;

        List<DocTableData> list1 = list.getList();
        int i = scheduleMapper.deleteByUepNum(depID);//删除当前科室的所有记录
        for(DocTableData doc:list1){
            User userByID = userMapper.getUserByID(doc.getId());
            int number=30;
            if(userByID.getRegtype().equals("专家号")){//如果是专家号，余号为10，否则是30
                number=10;
            }
            /*设置更新的对象*/
            if(doc.getCheck11()){
                Sche sche=new Sche(depID,doc.getId(),"周一上午",number);//周一上午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck12()){
                Sche sche=new Sche(depID,doc.getId(),"周一下午",number);//周一下午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck21()){
                Sche sche=new Sche(depID,doc.getId(),"周二上午",number);//周二上午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck22()){
                Sche sche=new Sche(depID,doc.getId(),"周二下午",number);//周二下午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck31()){
                Sche sche=new Sche(depID,doc.getId(),"周三上午",number);//周三上午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck32()){
                Sche sche=new Sche(depID,doc.getId(),"周三下午",number);//周三下午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck41()){
                Sche sche=new Sche(depID,doc.getId(),"周四上午",number);//周四上午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck42()){
                Sche sche=new Sche(depID,doc.getId(),"周四下午",number);//周四下午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck51()){
                Sche sche=new Sche(depID,doc.getId(),"周五上午",number);//周五上午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck52()){
                Sche sche=new Sche(depID,doc.getId(),"周五下午",number);//周五下午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck61()){
                Sche sche=new Sche(depID,doc.getId(),"周六上午",number);//周六上午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck62()){
                Sche sche=new Sche(depID,doc.getId(),"周六下午",number);//周六下午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck71()){
                Sche sche=new Sche(depID,doc.getId(),"周日上午",number);//周日上午
                scheduleMapper.add(sche);
            }
            if(doc.getCheck72()){
                Sche sche=new Sche(depID,doc.getId(),"周日下午",number);//周日下午
                scheduleMapper.add(sche);
            }

        }

        return true;
    }
}
