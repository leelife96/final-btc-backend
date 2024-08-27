package com.spring.btc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.btc.vo.ResultVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {
	
	
	@GetMapping("/")
	public String home() {
		return "Data 준비중...";
	}
	
	@CrossOrigin(origins = "http://localhost:8788")
	@GetMapping("/api")
	public String api() {
		return "Api Data 준비중...";
	}
	
	
	@CrossOrigin(origins = "http://localhost:8788")
	@GetMapping("/connectTest")
	public String Test() {
		return "스프링 뷰트 & 뷰 테스트...";
	}
	
	@PostMapping("/findAll")
	public ResultVO findAll() {
		return null;
	}
	
	@PostMapping("/editById")
	public ResultVO editById() {
		return null;
	}
	
	@DeleteMapping("/delete")
	public ResultVO delete() {
		return null;
	}
	
	@PutMapping("/save")
	public ResultVO save() {
		return null;
	}
	
}
