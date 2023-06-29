package org.java.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.java.dto.BoardDto;
import org.java.dao.BoardDao;

public class MemberDetail implements MemberService {
	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BoardDao dao = BoardDao.getInstance();	
		
		Long id = Long.parseLong( request.getParameter("id") );
		BoardDto memberDto = dao.getDetail(id);			
		
		String returnUrl = "detailView.jsp";
		
		request.setAttribute("memberDto", memberDto);
		//return View페이지 설정
		request.setAttribute("returnUrl", returnUrl);
	}
}
