package com.spring.btc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/")
	public String home() {
		return "Data 준비중...";
	}
	
	
	@GetMapping("/connectTest")
	public String Test() {
		return "스프링 뷰트 & 뷰 테스트...";
	}
	
	
}
