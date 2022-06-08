package com.patient;

import com.neutech.His01Application;
import com.neutech.bean.patient.Patient;
import com.neutech.mapper.patient.PatientMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = His01Application.class)
public class patientTest {

    @Autowired
    PatientMapper patientMapper;

    @Test
    public void getpatient(){
        String patient_ID="000001";
        Patient patient= patientMapper.getPatient(patient_ID);
        System.out.println(patient);
    }

    @Test
    public void addpatient(){
        Patient patient=new Patient("1","1","1","1","1","1","1");
        patientMapper.addPatient(patient);

    }

    @Test
    public void getallpatient(){
        List<Patient> patients=patientMapper.getAllPatient();
        System.out.println(patients);
    }

    @Test
    public void updatepatient(){
        Patient patient=new Patient("1","11111","1","1","1","1","1");
        patientMapper.updatePatient(patient);
    }

    @Test
    public void deletepatient(){
        String patient_ID="1";
        patientMapper.deletePatientByNum(patient_ID);
    }
}
