package com.spring.btc.service;

import org.springframework.stereotype.Service;

import com.spring.btc.vo.UserVO;

@Service
public interface UserService {
	
		UserVO getUserById(String userId);
	    void insertUser(UserVO user);
}
