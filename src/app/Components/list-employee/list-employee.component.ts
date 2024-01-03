import { Component } from '@angular/core';
import { Employee } from 'src/app/common/employee';
import { EmployeesService } from 'src/app/services/employees.service';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent {
  employees:Employee[]=[];

  constructor( private es:EmployeesService) {}
  ngOnInit(){
    this.getEmployees()
  }
  getEmployees(){
    this.es.getEmployee().subscribe((res:any)=>{
      this.employees=res;
      console.log('form emlc'+this.employees);

    })
  }


}
