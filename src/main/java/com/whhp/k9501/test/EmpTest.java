package com.whhp.k9501.test;

import com.whhp.k9501.controller.EmpServlet;
import com.whhp.k9501.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/ApplictionContext.xml")
public class EmpTest {
    @Autowired
    private EmpServlet empServlet;
    @Test
    public void empTest(){
        List<Emp>empList=empServlet.doGet();
        for (Emp emp : empList) {
            System.out.println("emp = " + emp);
        }
    }

}
