package org.java.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.java.dao.BoardDao;
import org.java.dao.MemberDao;

public class MemberInsert implements MemberService {
	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String htel = request.getParameter("htel");
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.insert(userid,userpw,htel);
		
		String returnUrl = "";
		if(rs!=1) {
			returnUrl = "joinFail.jsp";
		}else {
			returnUrl = "joinSuccess.jsp";			
		}
		
		//return View페이지 설정
		request.setAttribute("returnUrl", returnUrl);
	}
}
