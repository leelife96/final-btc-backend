package com.spring.btc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.btc.service.UserService;
import com.spring.btc.vo.UserVO;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	public String signup(@RequestBody UserVO user) {
		userService.insertUser(user);
		return "User registered successfully";
	}
	
	 @PostMapping("/login")
	 public String login(@RequestBody UserVO user, HttpSession session) {
	        UserVO dbUser = userService.getUserById(user.getUserId());
	        if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {
	        	session.setAttribute("user", dbUser);
	            return "Login successful";
	        } else {
	            return "Invalid credentials";
	        }
	    }
	 
	 @PostMapping("/logout")
	 public String logout(HttpSession session) {
		 session.invalidate(); // 세션 무효화
		 return "Logout successful";
	 }
}
