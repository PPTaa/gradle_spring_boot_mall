package com.board.pptaamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.board.pptaamall.mapper.MallMapper;

@Controller
@RequestMapping("/admin")
@SessionAttributes("member")
public class AdminController {
	
	@Autowired
	MallMapper mapper;
	
	
	@RequestMapping("/index")
	public String adminIndex() throws Exception {
		return "admin/index";
	}
}
