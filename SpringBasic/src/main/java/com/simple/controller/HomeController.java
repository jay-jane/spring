package com.simple.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.simple.command.ScoreVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//로그 출력 기능 - 패키지 별로 등록을 log4j.xml에 등록
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "home";
	}
}


