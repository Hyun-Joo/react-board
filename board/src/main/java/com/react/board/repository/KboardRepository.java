package com.react.board.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface KboardRepository {

	public List<Map<String, Object>> list();
	
}
