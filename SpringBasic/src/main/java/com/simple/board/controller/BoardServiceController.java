package com.simple.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.board.dto.BoardVO;
import com.simple.board.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardServiceController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/boardRegister")
	public String boardRegister() {
		return "service/boardRegister";
	}

	@PostMapping("/boardRegist")
	public String regist(BoardVO vo) {
		boardService.boardRegist(vo);
		return "service/boardResult";
	}

	@GetMapping("/boardList")
	public String list(Model model) {
		model.addAttribute("list", boardService.getList());
		return "service/boardList";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		boardService.boardDelete(id);
		return "redirect:/service/boardList";
	}


}
