package com.spring.btc.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.btc.mapper.UserMapper;
import com.spring.btc.vo.UserVO;

import jakarta.servlet.http.HttpSession;

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
		// 비밀번호를 SHA-256으로 해싱
		String hashedPassword = hashPassword(user.getPassword());
		user.setPassword(hashedPassword);
		userMapper.insertUser(user);
	}
	
	   @Override
	    public String login(UserVO user, HttpSession session) {
	        UserVO dbUser = userMapper.getUserById(user.getUserId());
	        if (dbUser != null) {
	            String hashedPassword = hashPassword(user.getPassword());
	            if (dbUser.getPassword().equals(hashedPassword)) {
	                session.setAttribute("user", dbUser);
	                return "Login successful";
	            }
	        }
	        return "Invalid credentials";
	    }
	
	private String hashPassword(String password) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			 byte[] hash = digest.digest(password.getBytes());
	            StringBuilder hexString = new StringBuilder();

	            for (byte b : hash) {
	                String hex = Integer.toHexString(0xff & b);
	                if (hex.length() == 1) hexString.append('0');
	                hexString.append(hex);
	            }

	            return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
	}
}
