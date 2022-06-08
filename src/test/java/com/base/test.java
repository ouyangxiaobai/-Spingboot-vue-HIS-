package com.base;

import com.neutech.His01Application;
import com.neutech.bean.base.Disposition;
import com.neutech.bean.base.Medicine;
import com.neutech.mapper.base.DispositionMapper;
import com.neutech.mapper.base.MedicineMapper;
import com.neutech.service.MedicineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = His01Application.class)
public class test {

    @Autowired
    private DispositionMapper dispositionMapper;
    @Autowired
    private MedicineMapper medicineMapper;


    @Test
    public void getBy(){
//        Medicine medicine=new Medicine();
//        medicine.setMed_Name("泽泻颗粒");
//        System.out.println(medicine);
//        //List<Medicine> medicineBy = medicineService.getMedicineBy(medicine);
//        System.out.println(medicineBy);
        String RegID="20210001";
        String TechID="004";
        Disposition dispositions=dispositionMapper.getDis(RegID,TechID);
        System.out.println(dispositions);
    }

    @Test
    public void updateMed(){
        Medicine medicine=new Medicine("0001","注射用甲氨喋呤","1g×1支","支","江苏恒瑞医药股份有限公司","注射剂","15.00","西药","足货");
        System.out.println(medicine);
        medicineMapper.updateMedicine(medicine);
        //System.out.println(f);
    }
}
