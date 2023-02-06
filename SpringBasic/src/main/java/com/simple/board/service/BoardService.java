package com.simple.board.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.simple.board.dto.BoardVO;

@Mapper
public interface BoardService {

	public void boardRegist(BoardVO vo); //등록
	public ArrayList<BoardVO> getList(); //조회
	public void boardDelete(int num); //삭제
	
	//위 메서드를 구현하는 클래스 BoardServiceImpl을 생성하고 오버라이딩하세요
}
