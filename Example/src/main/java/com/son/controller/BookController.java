package com.son.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	//메인 페이지 이동
	@GetMapping("/main")
	public void mainPageGET() {
		
		logger.info("메인 페이지 진입");
		
	}

}
