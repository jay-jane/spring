package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

public interface TestMapper {

	@Mapper // 마이바티스 매퍼를 지칭 -(스프링에선 생략가능)
	String getTime (); //1
	ArrayList<ScoreVO> getScore();
	ScoreVO getOne(int a);
	int insertOne(String name); //단일값
	int insertTwo(ScoreVO vo); //다중값
	int insertThree(Map<String,String> map); //map을 이용한 다중값?
	Map<String,Object> selectMap(int num); //키값조회
	ArrayList<Map<String, Object>> selectTwo(); //맵을통한 다중조회
	boolean updateOne (ScoreVO vo);
	void insertFour(@Param("name") String name, @Param("kor") int kor);
}
