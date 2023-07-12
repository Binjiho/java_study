package org.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.service.MemberDetail;
import org.web.service.MemberInsert;
import org.web.service.MemberSelect;
import org.web.service.MemberService;
import org.web.service.MemberUpdate;

//@WebServlet("*.do")
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
		MemberService service = null;

		if (basicUrl.equals("/index.do")) {
			System.out.println("index.jsp페이지 이동");
			returnUrl = "/index.jsp";
		
		} else if (basicUrl.equals("/join.do")) {
			System.out.println("joinView.jsp페이지 이동");
			returnUrl = "/joinView.jsp";
		
		} else if (basicUrl.equals("/write.do")) {
			System.out.println("writeView.jsp페이지 이동");
			returnUrl = "/writeView.jsp";
			
		} else if (basicUrl.equals("/joinWrite.do")) {
			service = new MemberInsert();
			service.executeQueryService(request, response);
			returnUrl = String.valueOf(request.getAttribute("returnUrl"));
		
		} else if (basicUrl.equals("/updateOk.do")) {
			service = new MemberUpdate();
			service.executeQueryService(request, response);
			returnUrl = String.valueOf(request.getAttribute("returnUrl"));
			
		} else if (basicUrl.equals("/list.do")) {
			service = new MemberSelect();
			service.executeQueryService(request, response);
			returnUrl = String.valueOf(request.getAttribute("returnUrl"));
		
		} else if (basicUrl.equals("/detailView.do")) {
			service = new MemberDetail();
			service.executeQueryService(request, response);
			returnUrl = String.valueOf(request.getAttribute("returnUrl"));
		
		} else {
			returnUrl = "/notPage.jsp";
		}
		System.out.println(returnUrl);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(returnUrl);
		dispatcher.forward(request, response);
	}

}
