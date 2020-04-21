package com.board.pptaamall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.board.pptaamall.mapper.MallMapper;
import com.board.pptaamall.service.AdminService;
import com.board.pptaamall.vo.CategoryVO;
import com.mysql.cj.xdevapi.JsonArray;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/admin")
@SessionAttributes("member")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	
	@RequestMapping("/index")
	public String adminIndex() throws Exception {
		return "admin/index";
	}
	
	@RequestMapping(value = "/goods/register")
	public String registerGoods(Model model) throws Exception{
		
		List<CategoryVO> category = null;
		category = service.category();
		
		model.addAttribute("category", JSONArray.fromObject(category));
		
		return "admin/goods/register";
	}
}
