package org.web.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dto.MemberDto;
import org.web.dao.MemberDao;

public class MemberDetail implements MemberService {
	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		MemberDao dao = MemberDao.getInstance();	
		
		Long id = Long.parseLong( request.getParameter("id") );
		MemberDto memberDto = dao.getDetail(id);			
		
		String returnUrl = "detailView.jsp";
		
		request.setAttribute("memberDto", memberDto);
		//return View페이지 설정
		request.setAttribute("returnUrl", returnUrl);
	}
}
