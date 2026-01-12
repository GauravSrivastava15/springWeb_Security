package com.SecurityApp.SecurityApplication;


import com.SecurityApp.SecurityApplication.entity.User;
import com.SecurityApp.SecurityApplication.services.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityApplicationTests {

	@Autowired
	private JwtService jwtService;

	@Test
	void contextLoads() {
//		User user = new User(4L, "gaurav@gmail.com", "password");
//
//		String token = jwtService.generateAccessToken(user);
//
//		System.out.println(token);
//
//		Long id = jwtService.getUserIdFromToken(token);
//
//		System.out.println(id);
	}

}
