package com.persistent.springbackend.jwt;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class JwtUserDetailsServiceTest {
	
	@Autowired
	private JwtUserDetailsService jwt;


	@Test
	public void checkLoadUsername() {
		UserDetails user = jwt.loadUserByUsername("admin");
		Assert.assertTrue("User should be returned", user.getUsername().equals("admin"));
	}

}
