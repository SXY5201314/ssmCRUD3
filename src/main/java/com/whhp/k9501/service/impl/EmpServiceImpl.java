package com.whhp.k9501.service.impl;

import com.whhp.k9501.dao.EmpDao;
import com.whhp.k9501.entity.Emp;
import com.whhp.k9501.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements com.whhp.k9501.service.EmpService {
@Autowired
    private EmpDao empDao;
@Override
    public List<Emp>selectEmpAll(){
        return empDao.selectEmpAll();
    }
}
