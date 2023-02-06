package com.simple.score.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.simple.command.dto.ScoreListResDTO;
import com.simple.command.dto.ScoreRegistReqDTO;

@Mapper
public interface ScoreMapper {
   
   public void regist(ScoreRegistReqDTO registerDTO);
   public List<ScoreListResDTO> getList();
   public void delete(int num);

}
