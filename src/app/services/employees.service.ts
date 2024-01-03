import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Employee } from '../common/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeesService {

  constructor(private es:HttpClient) { }

  getEmployee(){
    return this.es.get("http://localhost:8080/api/emp")
  }

  saveEmployee(theEmployee: Employee){
    return this.es.post('http://localhost:8080/api/employee', theEmployee)
  }
}
