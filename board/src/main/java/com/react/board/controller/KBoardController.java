package com.react.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.board.service.KBoardService;

@RestController
@RequestMapping("/kboard")
public class KBoardController {

	@Autowired
	private KBoardService kBoardServiece;
	
	@GetMapping("/list")
	public ResponseEntity<?> list(){
		return new ResponseEntity<>(kBoardServiece.list(),HttpStatus.OK);
	}
	
}
