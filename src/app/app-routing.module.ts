import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListEmployeeComponent } from './Components/list-employee/list-employee.component';
import { AddEmployeeComponent } from './Components/add-employee/add-employee.component';

const routes: Routes = [
  { path: 'employee-list', component:ListEmployeeComponent },
  { path: 'add-employee', component:AddEmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
