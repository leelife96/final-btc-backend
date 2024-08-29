package com.spring.btc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.btc.mapper.UserMapper;
import com.spring.btc.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserVO getUserById(String userId) {
		// TODO Auto-generated method stub
		return userMapper.getUserById(userId);
	}

	@Override
	public void insertUser(UserVO user) {
		// TODO Auto-generated method stub
		userMapper.insertUser(user);
	}
}
