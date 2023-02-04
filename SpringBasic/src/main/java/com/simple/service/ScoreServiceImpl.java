package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.score.dao.ScoreDAO;
import com.simple.score.dao.ScoreDAOImpl;

//@Component, @Repository, @Controller - 같은 기능을 함
@Service("dlfma") //Bean 이름 지정
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	private ScoreDAO dao;
	
	public void regist(ScoreVO vo) {
		dao.regist(vo);
	}

	@Override
	public ArrayList<ScoreVO> getList() { //데이터 조회
		return dao.getList();
	}

	@Override
	public void delete(int num) {
		dao.delete(num);
	}
}
