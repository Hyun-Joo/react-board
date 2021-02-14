package com.react.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@GetMapping("/hello")
	public String hi() {
		return "Do Not Talk About Fight Club";
	}

}
