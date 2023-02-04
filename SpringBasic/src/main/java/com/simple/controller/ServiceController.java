package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.score.dao.ScoreDAO;
import com.simple.service.ScoreService;

@Controller
@RequestMapping("/service")
public class ServiceController {

	//1. 객체 생성
//	ScoreServiceImpl service = new ScoreServiceImpl();
	
	//2. service를 Bean으로 생성(servlet-context.xml)
	
	//3. ServiceImpl에 @Service로 Bean 생성(servlet-context.xml)
	@Autowired
	@Qualifier("dlfma")
	private ScoreService service; //인터페이스 타입 선언

	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		return "service/scoreRegist";
	}
	
	@RequestMapping(value="/regist", method=RequestMethod.POST)
	public String regist(ScoreVO vo) {
		service.regist(vo);
		return("service/scoreResult");
	}
	
	@RequestMapping("/scoreList")
	public String registList(Model model) {
		ArrayList<ScoreVO> list = service.getList();
//		System.out.println(list.toString());
		model.addAttribute("list", list);		
		return "service/scoreList";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("num") int num) {
		service.delete(num);
		return "redirect:/service/scoreList";
	}
}
