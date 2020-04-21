package com.board.pptaamall.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.board.pptaamall.vo.MemberVO;

@Mapper
public interface MallMapper {
	

	public void signup(MemberVO vo) throws Exception;
	public MemberVO login(MemberVO vo) throws Exception;
}
