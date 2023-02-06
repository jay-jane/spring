package com.simple.service;

import java.util.ArrayList;
import java.util.List;

import com.simple.command.ScoreVO;
import com.simple.command.dto.ScoreDetailResDTO;
import com.simple.command.dto.ScoreListResDTO;
import com.simple.command.dto.ScoreRegistReqDTO;

public interface ScoreService {
	void regist(ScoreRegistReqDTO registerDTO);
	List<ScoreListResDTO> getList();
	void delete(int num);
	ScoreDetailResDTO detail(int num);
}
