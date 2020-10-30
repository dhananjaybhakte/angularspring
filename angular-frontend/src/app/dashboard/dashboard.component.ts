import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {

  employeeList = null;

  constructor(private employeeService:EmployeeService) { }

  ngOnInit(): void {
    this.getEmployeeList();
  }

  getEmployeeList(){
    this.employeeService.getEmployeeList().subscribe((data: {}) => {
      this.employeeList = data;
    });
  }

}
