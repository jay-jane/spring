package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ReqVO;

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
	
	//@ModelAttribute
	@RequestMapping("/result03")
	public String result03(@ModelAttribute("num") String num) {
		System.out.println("전달 데이터 : " + num);
		return "response/result03";
	}
	
	@RequestMapping("/result04")
	public String result04(@ModelAttribute("article") ReqVO vo) {
		System.out.println("전달 데이터 : " + vo.toString());
		return "response/result04";
	}
	
	/////////////////////////////////////////////////////////////
	//redirect 이동과 RedirectAttributes
	//스프링에서 redirect는 다시 컨트롤러를 태우는 요청
	//RedirectAttributes는 redirect 시 1회성 데이터를 저장할 수 있다
	
	//화면
	@RequestMapping("/redirect_login")
	public String loginView() {
		return "response/redirect_login";
	}
	
	//로그인 요청
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("id") String id,
						@RequestParam("pw") String pw,
						RedirectAttributes ra) {
		
		if(id.equals(pw)) { //성공
			ra.addFlashAttribute("msg", "성공"); //1회성 데이터
			return "redirect:/"; //model 데이터는 가져갈 수 없음
		} else { //실패
			ra.addFlashAttribute("msg", "id, pw 확인");
			return "redirect:/response/redirect_login"; //"rediect:/절대경로";
		}
	}
	
}
