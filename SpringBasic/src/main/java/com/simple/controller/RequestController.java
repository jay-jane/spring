package com.simple.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/request") //메소드 앞에 공통으로 들어가는 요청 경로 
public class RequestController {
	
	//String 메소드 - 출력 화면을 직접 지정 - 주로 쓰임
//	@RequestMapping("/ex01") //요청 경로
//	public String ex01() {
//		return "request/ex01"; //출력 경로
//	}
	
	//void 메소드 - 요청 경로가 출력 경로가 됨
	@RequestMapping("/ex01")
	public void ex01() {}
	
	//get만 허용
//	@RequestMapping(value="/basic1", method = RequestMethod.GET)
	@GetMapping("/basic1") //위와 같음
	public String basic1() {
		System.out.println("get만");
		return null;
	}
	
	//post만 허용
//	@RequestMapping(value="/basic2", method = RequestMethod.POST)
	@PostMapping("/basic2") //위와 같음
	public String basic2() {
		System.out.println("post만");
		return null;
	}
	
	//get, post 둘 다 허용
	@RequestMapping("/basic3")
	public String basic3() {
		System.out.println("get, post");
		return null;
	}
	
	@RequestMapping("/ex02")
	public String ex02() {
		return "request/ex02";
	}
	
	//파라미터 값 처리 1
//	@RequestMapping(value="/doAction", method=RequestMethod.POST)
//	public String doAtion(HttpServletRequest request) {
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		//체크박스 값
//		String[] inter = request.getParameterValues("inter");
//		
//		return "request/ex02_ok";
//	}
	
	//파라미터 값 처리 2 - @RequestParam
//	@RequestMapping(value="/doAction")
//	public String doAction(@RequestParam(value="name", required=false, defaultValue="default") String name,
//						   @RequestParam(value="age", required=false, defaultValue="999") int age,
//						   @RequestParam(value="inter", required=false, defaultValue="") List<String> inter) {
//		//@RequestParam은 공백 또는 null 데이터가 전달되면 요청을 거절함
//		//필수가 아닌 파라미터는 required=false 지정하고 defaultValue값을 설정해줌
//		
//		System.out.println(name + ", " + age + ", " + inter.toString());
//		return "request/ex02_ok";
//	}
	
	//파라미터 값 처리 3 - VO객체 (넘어오는 데이터의 name과 setter 이름이 같아야 함)
//	@RequestMapping("/doAction")
//	public String doAction(ReqVO vo) {
//		
//		System.out.println(vo.toString());
//		
//		return "request/ex02_ok";
//	}
	
	//실습
	@RequestMapping("/req_quiz01")
	public String quiz01() {
		return "request/req_quiz01";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("id") String id,
						@RequestParam("pw") String pw) {
		
		if(id.equals("abc123") && pw.equals("xxx123")) {
			return "request/req_quiz01_ok";
		} else {
			return "request/req_quiz01_no";
		}
	}
}
