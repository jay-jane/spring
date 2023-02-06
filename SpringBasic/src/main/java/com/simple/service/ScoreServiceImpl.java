package com.simple.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.command.dto.ScoreDetailResDTO;
import com.simple.command.dto.ScoreListResDTO;
import com.simple.command.dto.ScoreRegistReqDTO;
import com.simple.score.dao.ScoreDAO;
import com.simple.score.dao.ScoreDAOImpl;
import com.simple.score.mapper.ScoreMapper;

//@Component, @Repository, @Controller - 같은 기능을 함
@Service("dlfma") //Bean 이름 지정
public class ScoreServiceImpl implements ScoreService {

	//마이바티스 Mapper
	@Autowired
	private ScoreMapper scoreMapper;
	
	@Override
	public void regist(ScoreRegistReqDTO registerDTO) {
		scoreMapper.regist(registerDTO);
	}

	@Override
	public List<ScoreListResDTO> getList() {
		return scoreMapper.getList();
	}

	@Override
	public void delete(int num) {
		scoreMapper.delete(num);
	}

	@Override
	public ScoreDetailResDTO detail(int num) {
		return null;
	}
	
	/*
	 * @Autowired private ScoreDAO dao;
	 * 
	 * public void regist(ScoreRegistReqDTO registerDTO) { dao.regist(registerDTO);
	 * }
	 * 
	 * @Override public List<ScoreListResDTO> getList() { //데이터 조회
	 * List<ScoreListResDTO> list = new ArrayList<ScoreListResDTO>();
	 * 
	 * for(ScoreVO vo : dao.getList()) { ScoreListResDTO dto = new
	 * ScoreListResDTO(); BeanUtils.copyProperties(vo, dto); list.add(dto); }
	 * 
	 * return list; }
	 * 
	 * @Override public void delete(int num) { dao.delete(num); }
	 * 
	 * @Override public ScoreDetailResDTO detail(int num) { ScoreVO findScore =
	 * dao.detail(num); ScoreDetailResDTO result = new ScoreDetailResDTO();
	 * BeanUtils.copyProperties(findScore, result);
	 * 
	 * return result; }
	 */
}
