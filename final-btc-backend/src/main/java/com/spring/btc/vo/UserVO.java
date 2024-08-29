package com.spring.btc.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserVO {
	private String userId;
    private String password;
    private String userName;
    private String email;
}
