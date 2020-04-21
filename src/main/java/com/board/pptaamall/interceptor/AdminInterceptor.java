package com.board.pptaamall.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.board.pptaamall.vo.MemberVO;

@Component
public class AdminInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object object) throws Exception{
		
		HttpSession session = request.getSession();
		MemberVO vo = (MemberVO) session.getAttribute("member");
		
		if (vo == null) {
			response.sendRedirect("/member/login");
			return false;
		}
		
		if (vo.getVerify() != 9) {
			response.sendRedirect("/home");
			return false;
		}
		
		return true;
	}
}
