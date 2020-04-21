package com.board.pptaamall.service;

import javax.servlet.http.HttpSession;

import com.board.pptaamall.vo.MemberVO;

public interface IMallService {
	
	public void signup(MemberVO vo) throws Exception;
	public MemberVO login(MemberVO vo) throws Exception;
	public void logout(HttpSession session) throws Exception;

}
