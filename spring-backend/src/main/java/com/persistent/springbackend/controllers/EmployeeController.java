package com.persistent.springbackend.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.persistent.springbackend.beans.EmployeeBean;

import java.util.ArrayList;
import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@RequestMapping({ "/getEmployeeList" })
	public List<EmployeeBean> getEmployeeList() {
		
		List<EmployeeBean> employeeList = new ArrayList<EmployeeBean>();
		
		EmployeeBean emp = new EmployeeBean();
		emp.setId(1);
		emp.setName("Employee 1");
		emp.setLocation("Goa");
		employeeList.add(emp); 
		
		emp = new EmployeeBean();
		emp.setId(2);
		emp.setName("Employee 2");
		emp.setLocation("Mumbai");
		
		employeeList.add(emp); 
		
		return employeeList;
	}
	
}
