package com.spring.btc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/vue")
	public String index() {
		return "index.html";
	}
}