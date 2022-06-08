package com.patient;

import com.neutech.His01Application;
import com.neutech.bean.patient.Prescription;
import com.neutech.mapper.patient.PrescriptionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = His01Application.class)
public class prescriptionTest {

    @Autowired
    PrescriptionMapper prescriptionMapper;

    @Test
    public void getprescription(){
        String pre_ID="0001";
        String pre_RegID="20210001";
        Prescription prescription=prescriptionMapper.getPrescription(pre_ID,pre_RegID);
        System.out.println(prescription);
    }

//    @Test
////    public void addprescription(){
////        Prescription prescription =new Prescription("1","1","1","1");
////        prescriptionMapper.addPrescription(prescription);
////    }

    @Test
    public void getallprescription(){
        List<Prescription> prescriptions =prescriptionMapper.getAllPrescription();
        System.out.println(prescriptions);
    }


//    @Test
//    public void updateprescription(){
//        Prescription prescription =new Prescription("1","1","11111","1");
//        prescriptionMapper.updatePrescription(prescription);
//    }

    @Test
    public void deleteprescription(){
        String pre_ID="1";
        String pre_RegID="1";
        prescriptionMapper.deletePrescriptionByNum(pre_ID,pre_RegID);
    }
}
