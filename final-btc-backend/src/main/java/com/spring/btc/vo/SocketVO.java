package com.spring.btc.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//AllArgsConstructor 어노테이션은 생성자를 자동 생성합니다.
@AllArgsConstructor
@NoArgsConstructor
public class SocketVO {
	private String userName;
	private String content;
}
