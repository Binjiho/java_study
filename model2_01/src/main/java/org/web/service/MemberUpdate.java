package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.MemberDao;

public class MemberUpdate implements MemberService {
	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String htel = request.getParameter("htel");
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.update(id,userid,userpw,htel);
		
		String returnUrl = "";
		if(rs!=1) {
			returnUrl = "/";
		}else {
			returnUrl = "/list.do";			
		}
		
		//return View페이지 설정
		request.setAttribute("returnUrl", returnUrl);
	}
}
