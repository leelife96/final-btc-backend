package com.spring.btc.service;

import org.springframework.stereotype.Service;

import com.spring.btc.vo.ResultVO;
import com.spring.btc.vo.UserVO;


@Service
public class UserServiceImp implements UserService{
	
	private ResultVO resultvo;
	
	public ResultVO findAll() {
		return resultvo;
	}
	public ResultVO editByID(UserVO uservo) {
		return resultvo;
	}
	public ResultVO delete(int no) {
		return resultvo;
	}
	public ResultVO save(UserVO uservo) {
		return resultvo;
	}
}
