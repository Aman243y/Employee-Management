package com.aman.restcruddemo.dao;

import com.aman.restcruddemo.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    EntityManager em;

    @Autowired
    public EmployeeDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Employee> FindAll() {
        TypedQuery<Employee> q=em.createQuery("from Employee", Employee.class);
        return q.getResultList();
    }

    @Transactional
    @Override
    public void Delete(int id) {
        Employee theEmployee=em.find(Employee.class,id);
        em.remove(theEmployee);

    }

    @Transactional
    @Override
    public Employee save( Employee theEmployee) {
        em.merge(theEmployee);
        return theEmployee;

    }

    @Override
    public Employee find(int id) {
        Employee theEmployee=em.find(Employee.class,id);

        return theEmployee;
    }


//
}
