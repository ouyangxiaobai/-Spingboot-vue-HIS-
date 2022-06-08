package com.base;

import com.neutech.His01Application;
import com.neutech.bean.base.Icd;
import com.neutech.mapper.base.IcdMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = His01Application.class)
public class icdTest {

    @Autowired
    IcdMapper icdMapper;

    @Test
    public void geticd(){
        String icd_ID="A01.1";
        Icd icd= icdMapper.getIcd(icd_ID);
        System.out.println(icd);
    }

    @Test
    public void addicd(){
        Icd icd=new Icd("1","1","1");
        icdMapper.addIcd(icd);

    }

    @Test
    public void getallicd(){
        List<Icd> icds=icdMapper.getAllIcd();
        System.out.println(icds);
    }

    @Test
    public void updateicd(){
        Icd icd=new Icd("1","2","1");
        icdMapper.updateIcd(icd);
    }

    @Test
    public void deleteicd(){
        String icd_ID="1";
        icdMapper.deleteById(icd_ID);
    }

}
