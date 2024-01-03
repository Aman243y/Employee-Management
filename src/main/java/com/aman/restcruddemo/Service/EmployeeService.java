package com.aman.restcruddemo.Service;

import com.aman.restcruddemo.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> FindAll();


    void save(Employee theEmployee);
}
