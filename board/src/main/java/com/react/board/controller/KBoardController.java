package com.react.board.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kboard")
public class KBoardController {

	@GetMapping("/list")
	public ResponseEntity<?> list(){
		return new ResponseEntity<>("성공하였다.",HttpStatus.OK);
	}
	
}
