package com.board.pptaamall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.pptaamall.mapper.AdminMapper;
import com.board.pptaamall.vo.CategoryVO;

@Service
public class AdminService implements IAdminService {
	
	@Autowired
	AdminMapper mapper;
	
	@Override
	public List<CategoryVO> category() throws Exception {
		// TODO Auto-generated method stub
		return mapper.category();
	}

}
