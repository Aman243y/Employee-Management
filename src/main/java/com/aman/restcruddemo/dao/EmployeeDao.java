package com.aman.restcruddemo.dao;

import com.aman.restcruddemo.Entity.Employee;

import java.util.List;


public interface EmployeeDao {
    List<Employee> FindAll();
    void Delete(int id);
    Employee save(Employee theEmployee);
    Employee find(int id);



}
