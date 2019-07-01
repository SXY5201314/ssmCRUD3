package com.whhp.k9501.controller;

import com.whhp.k9501.entity.Emp;
import com.whhp.k9501.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

//控制层
@Controller
public class EmpServlet {
    //自动注入
    @Autowired
    private EmpService empService;
    public List<Emp>doGet(){
        return empService.selectEmpAll();
    }

}
