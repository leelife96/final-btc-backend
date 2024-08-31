package com.spring.btc.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	int bno;
	String title;
	String content;
	String writer;
	Date regDate;
}
