package com.aman.restcruddemo.Service;

import com.aman.restcruddemo.Entity.Employee;
import com.aman.restcruddemo.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    EmployeeDao ed;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao ed) {
        this.ed = ed;
    }

    @Override
    public List<Employee> FindAll() {
        return ed.FindAll();
    }

    @Transactional
    @Override
    public void save(@RequestBody Employee theEmployee) {
        ed.save(theEmployee);

    }


}
