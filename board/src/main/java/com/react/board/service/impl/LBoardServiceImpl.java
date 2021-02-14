package com.react.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.board.repository.LBoardRepository;
import com.react.board.service.LBoardService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LBoardServiceImpl implements LBoardService {
	
	@Autowired
	private LBoardRepository lboardRepository;
	
	@Override
	public List<Map<String, Object>> lboardList() {
		List<Map<String, Object>> result = null;
		try {
			result = lboardRepository.lboardList();
			log.info("lboard result ===> {}",result);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return result;
	}

}
