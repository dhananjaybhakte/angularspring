package com.persistent.springbackend.controllers;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.persistent.springbackend.beans.EmployeeBean;
import com.persistent.springbackend.controllers.EmployeeController;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeControllerTest {
	
	 @Autowired
	   private EmployeeController controller;

	   @Test
	   public void checkIfEmployeeList() {
	      List<EmployeeBean> employeeList = controller.getEmployeeList();
	      Assert.assertTrue("Employee List Should Have Employees", employeeList.size() > 0);
	   }

}
