package com.patient;

import com.neutech.His01Application;
import com.neutech.bean.patient.Patientreg;
import com.neutech.mapper.patient.PatientregMapper;
import com.neutech.service.RegService;
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
public class patientregTest {

    @Autowired
    PatientregMapper patientregMapper;
    @Autowired
    RegService regService;

    @Test
    public void getpatientreg(){
        String reg_ID="20210001";
        Patientreg patientreg= patientregMapper.getPatientreg(reg_ID);
        System.out.println(patientreg);
    }

    @Test
    public void addpatientreg(){
        Patientreg patientreg =new Patientreg("1","1","1","1","1","1","1",new Date(),"1");
        patientregMapper.addPatientreg(patientreg);
    }

    @Test
    public void getallcheck(){
        List<Patientreg> patientregs =patientregMapper.getAllPatientreg();
        System.out.println(patientregs);
    }

    @Test
    public void getpatientregby() throws ParseException {
        String regPatient="000001";
        List<Patientreg> patientregs= patientregMapper.getPatientregBy(regPatient);
        System.out.println(patientregs);
    }

    @Test
    public void updatepatientreg(){
        Patientreg patientreg =new Patientreg("1","1","111111","1","1","1","1",new Date(),"1");
        patientregMapper.updatePatientreg(patientreg);

    }

    @Test
    public void deletepatientreg(){
        String reg_ID="1";
        patientregMapper.deletePatientregByNum(reg_ID);
    }

    @Test
    public void getRegNum(){
        int nowNum = regService.getNowNum("015");
        System.out.println(nowNum);
    }
    @Test
    public void getByStete(){
        List<Patientreg> list1 = patientregMapper.getByState("已挂号");
        List<Patientreg> list2 = patientregMapper.getByState("未挂号");
        boolean b = list1.addAll(list2);
        System.out.println(b);
        System.out.println(list1);
    }
}
