package com.whhp.k9501.dao.impl;

import com.whhp.k9501.dao.EmpDao;
import com.whhp.k9501.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpDaoImpl implements com.whhp.k9501.dao.EmpDao {
    @Override
    public List<Emp>selectEmpAll(){
        List<Emp>empList=new ArrayList<Emp>();
        Emp emp = new Emp();
        emp.setName("张珊");
        empList.add(emp);
        return empList;
    }

}
