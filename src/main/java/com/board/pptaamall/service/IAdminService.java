package com.board.pptaamall.service;

import java.util.List;

import com.board.pptaamall.vo.CategoryVO;

public interface IAdminService {
	
	public List<CategoryVO> category() throws Exception;
}
