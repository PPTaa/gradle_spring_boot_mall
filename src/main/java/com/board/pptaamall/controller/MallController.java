package com.board.pptaamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.board.pptaamall.mapper.MallMapper;

@Controller
@SessionAttributes("member")
public class MallController {
	
	@Autowired
	MallMapper mapper;
	
	
	@RequestMapping("/home")
	public String home() throws Exception {
		return "home";
	}
}
