package com.simple.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.board.dto.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardService boardService;
	
	@Override
	public void boardRegist(BoardVO vo) {
		boardService.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		return boardService.getList();
	}

	@Override
	public void boardDelete(int num) {
		boardService.boardDelete(num);
	}

}
