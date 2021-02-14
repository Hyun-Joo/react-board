package com.react.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.board.service.LBoardService;

@RestController
@RequestMapping("/lboard")
public class LBoardController {
	
	@Autowired
	private LBoardService lboardService;
	
	@GetMapping("/list")
	public ResponseEntity<?> lboardList(){
		List<Map<String,Object>> list = lboardService.lboardList();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

}
