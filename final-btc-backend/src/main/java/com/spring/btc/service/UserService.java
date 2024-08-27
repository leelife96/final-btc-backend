package com.spring.btc.service;

import com.spring.btc.vo.ResultVO;
import com.spring.btc.vo.UserVO;

public interface UserService {
	
	public ResultVO findAll();
	public ResultVO editByID(UserVO uservo);
	public ResultVO delete(int no);
	public ResultVO save(UserVO uservo);
}
