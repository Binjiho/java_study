package org.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.service.EmployeeInsert;
import org.web.service.EmployeeService;

@WebServlet("*.do")
public class BaseController extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
		doPost(request,response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post");
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
		System.out.println(uri);
		
		String path = request.getContextPath();
		System.out.println(path);
		
		String basicUrl = uri.substring(path.length());
		System.out.println(basicUrl);
		
		String returnUrl = "";
		EmployeeService service = null;

		if (basicUrl.equals("/index.do")) {
			System.out.println("index.jsp페이지 이동");
			returnUrl = "/index.jsp";
		} else if (basicUrl.equals("/join.do")) {
			System.out.println("join.jsp페이지 이동");
			returnUrl = "/joinView.jsp";
		} else if (basicUrl.equals("/joinOk.do")) {
			service = new EmployeeInsert();
			service.executeQueryService(request, response);
			returnUrl = String.valueOf(request.getAttribute("returnUrl"));
		} else {
			returnUrl = "/notPage.jsp";
		}
		System.out.println(returnUrl);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(returnUrl);
		dispatcher.forward(request, response);
	}
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
}