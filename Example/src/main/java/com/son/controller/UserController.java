package com.son.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	//메인 페이지 이동
	@GetMapping("/user/login")
	public void loginGet() {
		
		logger.info("메인 페이지 진입");
		
	}
	
	//메인 페이지 이동
	@GetMapping("/user/join")
	public void joinGet() {
		
		logger.info("메인 페이지 진입");
		
	}

}