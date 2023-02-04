package com.simple.score.dao;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreDAO {
	void regist(ScoreVO vo);
	ArrayList<ScoreVO> getList();
	void delete(int num);
}
