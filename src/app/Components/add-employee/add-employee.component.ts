import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Employee } from 'src/app/common/employee';
import { EmployeesService } from 'src/app/services/employees.service';


@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent {

  constructor (private cs:EmployeesService){}

  addEmployeeForm =new FormGroup(
    {
      firstname:  new FormControl("",[Validators.required, Validators.minLength(2)]),
      lastname:new FormControl("",[Validators.required]),
      email:new FormControl("",[Validators.required])

    }
  );
  onFormSubmit(){
    //console.log("form submit");
   // console.log(this.addEmployeeForm.value);

    const theEmp =new Employee(this.addEmployeeForm.value.firstname as string, this.addEmployeeForm.value.lastname as string,this.addEmployeeForm.value.email as string);
    console.log(theEmp);

   this.cs.saveEmployee(theEmp).subscribe(res=>{
    next:{
      console.log('Employee registration is successfully');

    }
   });


  }
}
