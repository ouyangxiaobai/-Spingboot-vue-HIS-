package com.patient;

import com.neutech.His01Application;
import com.neutech.bean.patient.Patienticd;
import com.neutech.mapper.patient.PatienticdMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = His01Application.class)
public class patienticdTest {

    @Autowired
    PatienticdMapper patienticdMapper;

    @Test
    public void getPatienticd(){
        String pti_ID="20210001";
        Patienticd patienticd= patienticdMapper.getPicd(pti_ID);
        System.out.println(patienticd);
    }

    @Test
    public void addPatienticd(){
        Patienticd patienticd=new Patienticd("1",new Date(),"1");
        patienticdMapper.addPicd(patienticd);

    }

    @Test
    public void getallPatienticd(){
        List<Patienticd> patienticds=patienticdMapper.getAllPicd();
        System.out.println(patienticds);
    }

    @Test
    public void updatePatienticd(){
        Patienticd patienticd=new Patienticd("1",new Date(),"33333");
        patienticdMapper.updatePicd(patienticd);
    }

    @Test
    public void deletePatienticd(){
        String pti_ID="1";
        patienticdMapper.deletePicdByNum(pti_ID);
    }
}
