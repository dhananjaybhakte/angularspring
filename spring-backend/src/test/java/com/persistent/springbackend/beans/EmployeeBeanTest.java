package com.persistent.springbackend.beans;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeBeanTest {

	@Test
	public void createNewBeanTestId() {
		EmployeeBean emp = new EmployeeBean();
		emp.setId(1);
		Assert.assertTrue("Employee Id should exists ", emp.getId() == 1);
	}
	
	@Test
	public void createNewBeanTestName() {
		EmployeeBean emp = new EmployeeBean();
		emp.setName("Admin");
		Assert.assertTrue("Employee Name should exists ", emp.getName().equals("Admin"));
	}
	
	
	@Test
	public void createNewBeanTestLocation() {
		EmployeeBean emp = new EmployeeBean();
		emp.setLocation("XYZ");
		Assert.assertTrue("Employee Name should exists ", emp.getLocation().equals("XYZ"));
	}
	
}
