package com.base;


import com.neutech.His01Application;
import com.neutech.bean.base.Disposition;
import com.neutech.mapper.base.DispositionMapper;
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
public class dispositionTest {

    @Autowired
    DispositionMapper dispositionMapper;

    @Test
    public void getdisposition(){
        String dis_RegID="20210001";
        String dis_TechID="004";
        Disposition disposition=dispositionMapper.getDis(dis_RegID,dis_TechID);
        System.out.println(disposition);
    }

    @Test
    public void adddisposition(){
        Disposition disposition=new Disposition("2","1","1","1",new Date());
        dispositionMapper.addDis(disposition);
    }

    @Test
    public void getalldisposition(){
        List<Disposition> dispositions =dispositionMapper.getAllDis();
        System.out.println(dispositions);
    }

    @Test
    public void getcheckby() throws ParseException {
        String dis_State="已开立";
        Disposition disposition=new Disposition();
        disposition.setDis_State(dis_State);
        List<Disposition> dispositions= dispositionMapper.getDisBy(disposition);
        System.out.println(dispositions);
    }

    @Test
    public void updatedisposition(){
        Disposition disposition=new Disposition("2","1","12","1",new Date());
        dispositionMapper.updateDis(disposition);

    }

    @Test
    public void deletedisposition(){
        String dis_RegID="2";
        String dis_TechID="1";
        dispositionMapper.deleteByID(dis_RegID,dis_TechID);
    }
}
