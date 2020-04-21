package com.board.pptaamall.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.board.pptaamall.service.MallService;
import com.board.pptaamall.vo.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MallService service;

	//회원가입
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String getsignup() throws Exception {
		return "member/signup";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String postsignup(MemberVO vo) throws Exception {	
		service.signup(vo);
		return "redirect:/home";
	}
	//로그인
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin() throws Exception{
		return "member/login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin(MemberVO vo, RedirectAttributes attributes, HttpServletRequest request) throws Exception{
		MemberVO login = service.login(vo);
		HttpSession session = request.getSession();

		if (login != null) {
			session.setAttribute("member", login);
		} else {
			session.setAttribute("member", null);
			attributes.addFlashAttribute("msg", false);
			return "redirect:/member/login";
		}
		
		return "redirect:/home";
	}
	//로그아웃
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) throws Exception {
		service.logout(session);
		return"redirect:/home";
	}
}
