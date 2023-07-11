package org.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class BaseController extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("get");
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

		if (basicUrl.equals("/*.do")) {
			System.out.println("header_ex.jsp페이지 이동");
			returnUrl = "/header_ex.jsp";
		
		}else if (basicUrl.equals("/login.do")) {
			System.out.println("index.jsp페이지 이동");
			returnUrl = "/login_ex.jsp";
		
		} else if (basicUrl.equals("/join.do")) {
			System.out.println("joinView.jsp페이지 이동");
			returnUrl = "/joinView.jsp";
		
		} else if (basicUrl.equals("/write.do")) {
			System.out.println("writeView.jsp페이지 이동");
			returnUrl = "/writeView.jsp";
			
		} else {
			returnUrl = "/notPage.jsp";
		}
		System.out.println(returnUrl);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(returnUrl);
		dispatcher.forward(request, response);
	}

}
