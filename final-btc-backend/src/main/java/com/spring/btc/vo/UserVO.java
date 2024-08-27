package com.spring.btc.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserVO {
		private int no;
	  private String name;
	  private String email;
	  private String pwd;
	  private Boolean gender;
	  private Boolean del;
	  private LocalDateTime regDate;
}
