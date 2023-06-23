package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.EmployeeDao;

public class EmployeeInsert implements EmployeeService {
	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String depart = request.getParameter("depart");
		
		EmployeeDao dao = EmployeeDao.getInstance();
		int rs = dao.insert(name,email,depart);
		
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
