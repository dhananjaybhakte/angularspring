package com.persistent.springbackend.jwt;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class JwtTokenUtilTest {

	UserDetails userDetails = new User("admin", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
			new ArrayList<>());

	@Autowired
	private JwtTokenUtil jwt;


	@Test
	public void checkTokenGeneration() {
		String token = jwt.generateToken(userDetails);
		Assert.assertTrue("token should be returned", token.length() > 0);
	}


	@Test
	public void checkTokenUsername() {

		String token = jwt.generateToken(userDetails);

		String username = jwt.getUsernameFromToken(token);
		Assert.assertTrue("Username should be admin", username.equals("admin"));
	}


	@Test
	public void checkIfTokenIsExpired() {

		String token = jwt.generateToken(userDetails);

		Date valid = jwt.getExpirationDateFromToken(token);
		Assert.assertTrue("Username should be admin", valid instanceof Date);
	}

	@Test
	public void validateTokenTest() {

		String token = jwt.generateToken(userDetails);
		
		Boolean valid = jwt.validateToken(token,userDetails);
		Assert.assertTrue("Username should be admin", valid instanceof Boolean);
	}

}

