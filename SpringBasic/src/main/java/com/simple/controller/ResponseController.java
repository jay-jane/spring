package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/response")
public class ResponseController {
	
	//화면
	@RequestMapping("/ex01") //입력경로
	public String ex01() {
		return "response/ex01"; //출력경로
	}
	
	//result01 요청 - Model
	@RequestMapping("/result01")
	public String result01(Model model) {
		
		model.addAttribute("data", "이이이"); //키, 값
		model.addAttribute("serverTime", new Date()); //키, 값
		
		return "response/result01";
	}
	
	//result02 요청 - ModelAndView
	@RequestMapping("/result02")
	public ModelAndView result02() {
		
		//View 정보, 데이터 정보를 함께 저장할 수 있는 객체
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "이이이");
		mv.addObject("name", "김김");
		mv.setViewName("response/result02");
		return mv;
	}
}
