package com.outdepart;

import com.neutech.His01Application;
import com.neutech.service.DiagnoseService;
import com.neutech.vo.outdepart.CheckItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = His01Application.class)
public class quezhenTest {
    @Autowired
    DiagnoseService diagnoseService;
    @Test
    public void test1(){//根据病历号获取检查项
        List<CheckItem> inspection = diagnoseService.getInspection("20210628121405");
        System.out.println(inspection);

    }
}
