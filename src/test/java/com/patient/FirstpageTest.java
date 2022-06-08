package com.patient;


import com.neutech.His01Application;
import com.neutech.bean.patient.FirstPage;
import com.neutech.mapper.patient.FirstpageMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = His01Application.class)
public class FirstpageTest {

    @Autowired
    FirstpageMapper firstpageMapper;

    @Test
    public void getFpage(){
        String ftID="20210001";
        FirstPage firstPage= firstpageMapper.getFpage(ftID);
        System.out.println(firstPage);
    }

    @Test
    public void addFpage(){
        FirstPage firstPage=new FirstPage("1","1","1","1","1","1","1","1","1");
        firstpageMapper.addFpage(firstPage);

    }

    @Test
    public void getallFpage(){
        List<FirstPage> firstPages=firstpageMapper.getAllFpage();
        System.out.println(firstPages);
    }

    @Test
    public void updateFpage(){
        FirstPage firstPage=new FirstPage("1","11111","1","1","1","1","1","1","1");
        firstpageMapper.updateFpage(firstPage);
    }

    @Test
    public void deleteFpage(){
        String ftID="1";
        firstpageMapper.deleteFpageByNum(ftID);
    }
}
