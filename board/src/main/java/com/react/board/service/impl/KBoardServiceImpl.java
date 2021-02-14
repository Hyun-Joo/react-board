package com.react.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.board.repository.KboardRepository;
import com.react.board.service.KBoardService;
@Service
public class KBoardServiceImpl implements KBoardService {
	@Autowired
	private KboardRepository kBoardRepository;

	@Override
	public List<Map<String, Object>> list() {
		return kBoardRepository.list();
	}
	
}
