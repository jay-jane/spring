package com.simple.service;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreService {
	void regist(ScoreVO vo);
	ArrayList<ScoreVO> getList();
	void delete(int num);
}
