package com.react.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.board.repository.TestRepository;
import com.react.board.service.TestService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestRepository testRepository;

	@Override
	public String test() {
		String result = "";
		try {
			result = testRepository.test();
			log.info("test result: {}",result);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return result;
	}

}
