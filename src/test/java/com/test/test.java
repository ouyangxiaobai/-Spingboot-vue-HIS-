package com.test;

import com.neutech.His01Application;
import com.neutech.bean.system.Sche;
import com.neutech.bean.system.Schedule;
import com.neutech.bean.system.User;
import com.neutech.mapper.system.ScheduleMapper;
import com.neutech.mapper.system.UserMapper;
import com.neutech.service.UserService;
import com.neutech.util.MyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = His01Application.class)
public class test {

    @Autowired
    ScheduleMapper scheduleMapper;
    @Autowired
    UserMapper userMapper;

    @Test
    public void upddate() {


        Schedule byID = scheduleMapper.getByID("010");
        System.out.println(byID);

        System.out.println(MyUtil.getNow());

        System.out.println(MyUtil.getPID());

    }
    @Test
    public void make(){
        StringBuilder str=new StringBuilder();//定义变长字符串
        Random random=new Random();
        //随机生成数字，并添加到字符串
        for(int i=0;i<8;i++){
            str.append(random.nextInt(10));
        }
        System.out.println(str);
    }
    @Test
    public void test2() throws ParseException {
        System.out.println(MyUtil.dateToS(new Date()));
        System.out.println(MyUtil.sToDate("2021-02-12 12:30:45"));

    }
    @Test
    public void test3(){
        System.out.println(scheduleMapper.getByDepID("001"));
        System.out.println(userMapper.getUserByID("010"));
    }

    @Test
    public void test4(){
        Sche sche=new Sche();
        sche.setSchedule_UepNum("001");
        sche.setSchedule_Time("周一上午");
        sche.setSchedule_UserID("010");
        sche.setSchedule_Number(10);
        scheduleMapper.add(sche);

    }
}
