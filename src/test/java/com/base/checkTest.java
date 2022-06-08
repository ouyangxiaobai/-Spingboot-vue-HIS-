package com.base;

import com.neutech.His01Application;
import com.neutech.bean.base.Inspection;
import com.neutech.mapper.base.InspectionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = His01Application.class)
public class checkTest {

    @Autowired
    InspectionMapper checkMapper;

    @Test
    public void getcheck(){
        String check_RegID="20210001";
        String check_TechID="001";
        Inspection inspection =checkMapper.getInspection(check_RegID,check_TechID);
        System.out.println(inspection);
    }

    @Test
    public void addcheck(){
        Inspection inspection =new Inspection("2","1","1","1",new Date());
        checkMapper.addInspection(inspection);
    }

    @Test
    public void getallcheck(){
        List<Inspection> inspections =checkMapper.getAllCheck();
        System.out.println(inspections);
    }

    @Test
    public void getcheckby() throws ParseException {
        String check_State="已开立";
        Inspection inspection=new Inspection();
        inspection.setCheck_State(check_State);
        List<Inspection> inspections= checkMapper.getInspectionBy(inspection);
        System.out.println(inspections);
    }

    @Test
    public void updatecheck(){
        Inspection inspection =new Inspection("2","1","12","1",new Date());
        checkMapper.updateInspection(inspection);

    }

    @Test
    public void deletecheck(){
        String check_RegID="2";
        String check_TechID="1";
        checkMapper.deleteById(check_RegID,check_TechID);
    }
}
