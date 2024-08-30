package com.spring.btc.service;

import org.springframework.stereotype.Service;

import com.spring.btc.vo.UserVO;

import jakarta.servlet.http.HttpSession;

@Service
public interface UserService {
	
		UserVO getUserById(String userId);
	    void insertUser(UserVO user);
	    String login(UserVO user, HttpSession session);  // 로그인 메서드 추가
}
