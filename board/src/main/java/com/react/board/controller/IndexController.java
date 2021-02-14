package com.react.board.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.board.service.TestService;

@RestController
public class IndexController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/hello")
	public String hi() throws Exception {
		String result = testService.test();
		if(StringUtils.isBlank(result)) {
			result = "Do Not Talk About Fight Club";
		}
		return result;
	}

}
