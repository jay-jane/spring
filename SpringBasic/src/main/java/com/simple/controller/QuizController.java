package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;
import com.simple.command.QuizVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	//1번 문제
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "quiz/quiz01";
	}
//	@RequestMapping(value="/sendBirth", method=RequestMethod.POST)
//	public String quiz01_ok(@RequestParam("year") String year,
//			 				@RequestParam("month") int month,
//			 				@RequestParam("day") String day,
//			 				Model model) {
//		
//		model.addAttribute("year", year);
//		model.addAttribute("month", month);
//		model.addAttribute("day", day);
//		return "quiz/quiz01_ok";
//	}
	@RequestMapping(value="/sendBirth", method=RequestMethod.POST)
	public String quiz01_ok(Quiz01VO vo, Model model) {
		model.addAttribute("birth", vo.getYear() + "년 " +
									vo.getMonth() + "월 " +
									vo.getDay() + "일");
		return "quiz/quiz01_ok";
	}
	
	//2번 문제
	@RequestMapping("/quiz02")
	public String quiz02() {
		return "quiz/quiz02";
	}
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(@ModelAttribute("quizquiz") QuizVO vo) {
		return "quiz/quiz02_ok";
	}
	
	//3번 문제
	@RequestMapping("/quiz03")
	public String quiz03() {
		return "quiz/quiz03";
	}
	@RequestMapping(value="/join2", method=RequestMethod.POST)
	public String join2(@RequestParam("id") String id,
						@RequestParam("pw") String pw,
						@RequestParam("pw_check") String pw_check,
						Model model,
						RedirectAttributes ra) {
		model.addAttribute("id", id);
		if(id.equals("")) {
			ra.addFlashAttribute("msg", "아이디를 입력하세요");
			return "redirect:/quiz/quiz03";
		} else if(pw.equals("")) {
			ra.addFlashAttribute("msg", "비밀번호를 입력하세요");
			return "redirect:/quiz/quiz03";
		} else if(!pw.equals(pw_check)) {
			ra.addFlashAttribute("msg", "비밀번호를 확인하세요");
			return "redirect:/quiz/quiz03";
		} else {
			return "quiz/quiz03_ok"; //결과 화면(redirect 불필요)
		}
	}
}
