package com.simple.score.dao;

import java.util.ArrayList;

import com.simple.command.ScoreVO;
import com.simple.command.dto.ScoreListResDTO;
import com.simple.command.dto.ScoreRegistReqDTO;

public interface ScoreDAO {
	void regist(ScoreRegistReqDTO registerDTO);
	ArrayList<ScoreVO> getList();
	void delete(int num);
	ScoreVO detail(int num);
}
