package com.patient;

import com.neutech.His01Application;
import com.neutech.bean.patient.Premed;
import com.neutech.mapper.patient.PremedMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = His01Application.class)
public class premedTest {

    @Autowired
    PremedMapper premedMapper;

    @Test
    public void getpremed(){
        String pm_PreID="0001";
        String pm_MedID="0004";
        Premed premed =premedMapper.getPremed(pm_PreID,pm_MedID);
        System.out.println(premed);
    }

    @Test
    public void addpremed(){
        Premed premed =new Premed("1","1","1","1","1","1");
        premedMapper.addPremed(premed);
    }

    @Test
    public void getallpremed(){
        List<Premed> premeds =premedMapper.getAllPremed();
        System.out.println(premeds);
    }


    @Test
    public void updatepremed(){
        Premed premed =new Premed("1","1","11111","1","1","1");
        premedMapper.updatePremed(premed);
    }

    @Test
    public void deletepremed(){
        String pm_PreID="1";
        String pm_MedID="1";
        premedMapper.deletePremedByNum(pm_PreID,pm_MedID);
    }
}
