package com.simple.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.command.dto.ScoreDetailResDTO;
import com.simple.command.dto.ScoreListResDTO;
import com.simple.command.dto.ScoreRegistReqDTO;
import com.simple.score.dao.ScoreDAO;
import com.simple.service.ScoreService;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/service")
public class ServiceController {

	private static final Logger logger = LoggerFactory.getLogger(ServiceController.class);
	//1. 객체 생성
	//	ScoreServiceImpl service = new ScoreServiceImpl();

	//2. service를 Bean으로 생성(servlet-context.xml)

	//3. ServiceImpl에 @Service로 Bean 생성(servlet-context.xml)
	@Autowired
	@Qualifier("dlfma")
	private ScoreService service; //인터페이스 타입 선언

	@GetMapping("/scoreRegist")
	public String registForm() {
		return "service/scoreRegist";
	}

	@PostMapping("/regist")
	public String regist(ScoreRegistReqDTO registerDTO) {
		service.regist(registerDTO);

		return ("service/scoreResult");
	}

	@GetMapping("/scoreList")
	public String list(Model model) {
		List<ScoreListResDTO> list = service.getList();
		model.addAttribute("list", list);

		return "service/scoreList";
	}

	@PostMapping("/delete")
	public String delete(@RequestParam("num") int num) {
		service.delete(num);

		return "redirect:/service/scoreList";
	}

	@GetMapping("/detail")
	public String detailForm(@RequestParam("num") int num, Model model) {
		ScoreDetailResDTO result = service.detail(num);
		model.addAttribute("user", result);
		logger.info("db get VO {}", result.toString());

		return "service/scoreDetail";
	}

	@GetMapping("/scoreUpdate")
	public String updateForm(@RequestParam("num") int num, Model model) {
		ScoreDetailResDTO result = service.detail(num);
		model.addAttribute("user", result);
		logger.info("db get VO {}", result.toString());
		return "service/scoreUpdate";
	}

	@PostMapping("/update")
	public String update() {
		
		
		return "";
	}
}
