package org.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.service.MemberEmailCheckedService;
import org.web.service.MemberInsert;
import org.web.service.MemberService;

@WebServlet("*.do")
public class MemberController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String path=request.getContextPath();
		String uri=request.getRequestURI();
		String basicURL=uri.substring(path.length());
		
		System.out.println(path);
		System.out.println(uri);
		System.out.println(basicURL);
		
		String returnURL="";
		
		MemberService service=null;
		
		if(basicURL.equals("index.do")) {
			returnURL="/index.jsp";
		}else if(basicURL.equals("/join.do")) {
			returnURL="/join.jsp";
		}else if(basicURL.equals("/jsp0706/joinOk.do")) {
			service = new MemberInsert();
			service.executeQueryService(request, response);
			returnURL=(String) request.getAttribute("returnURL");
		}else if(basicURL.equals("/EmailChecked.do")) {
			System.out.println("12");
//			service = new MemberEmailCheckedService();
//			service.executeQueryService(request, response);
//			returnURL=(String) request.getAttribute("returnURL");
		}else if(basicURL.equals("/jsp0706/login.do")) {
			returnURL="/jsp0706/login.jsp";
		}else if(basicURL.equals("/jsp0706/memberList.do")) {
			// service -> DAO -> 회원목록 가지고 memberList.jsp 이동
			returnURL="/jsp0706/memberList.jsp";
		}
			
		RequestDispatcher dispatcher = request.getRequestDispatcher(returnURL);
		dispatcher.forward(request, response);
		
	}
}
