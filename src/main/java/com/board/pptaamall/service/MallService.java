package com.board.pptaamall.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.pptaamall.mapper.MallMapper;
import com.board.pptaamall.vo.MemberVO;

@Service
public class MallService implements IMallService {

	@Autowired
	MallMapper mapper;
	
	@Override
	public void signup(MemberVO vo) throws Exception {
		mapper.signup(vo);
	}
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.login(vo);
	}
	@Override
	public void logout(HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		session.invalidate();
	}

}
