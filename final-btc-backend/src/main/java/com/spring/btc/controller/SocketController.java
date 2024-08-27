package com.spring.btc.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.spring.btc.vo.SocketVO;

@Controller
public class SocketController {
	
	@MessageMapping("/receive")
	
	@SendTo("/send")
	
	public SocketVO SocketHandler(SocketVO socketVO) {
		
		// vo에서 getter로 userName을 가져옵니다.
		String userName = socketVO.getUserName();
		
		 // vo에서 setter로 content를 가져옵니다.
		String content = socketVO.getContent();
		
		// 생성자로 반환값을 생성합니다.
		SocketVO result = new SocketVO(userName, content);
		
	
		return result;
	}
}
