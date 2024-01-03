package com.aman.restcruddemo.rest;

import com.aman.restcruddemo.Entity.Employee;
import com.aman.restcruddemo.Service.EmployeeService;
import com.aman.restcruddemo.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeController {

    EmployeeService es;
    @Autowired
    public EmployeeController(EmployeeService es) {
        this.es = es;
    }

    @GetMapping("/hello")
    public  String sayHello(){
        return "hello moto";
    }

    //field injection
    @Autowired
    private  EmployeeDao ed;

    //Constructor for injection
    public EmployeeController(EmployeeDao ed) {
        this.ed = ed;
    }


    //expose "/emp " to get All employees
    @GetMapping("/emp")
    public List<Employee> getAll(){
        return es.FindAll();
    }

    @PostMapping("/employee")
    Employee saveEmployee(@RequestBody Employee theEmployee){
       System.out.println(theEmployee);
        ed.save(theEmployee);
        return theEmployee;

    }
    @GetMapping("/employee/{id}")
    Employee findBy(@PathVariable int id){
        return ed.find(id) ;
    }

    @DeleteMapping("/delete/{id}")
    public  String delete(@PathVariable int id){
        ed.Delete(id);
        return "data deleted";
    }






    
}
