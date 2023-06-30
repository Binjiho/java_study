package org.java.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.java.service.BoardDelete;
import org.java.service.BoardDetail;
import org.java.service.BoardInsert;
import org.java.service.BoardSelect;
import org.java.service.BoardService;
import org.java.service.BoardUpdate;
import org.java.service.MemberDetail;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberService;
import org.java.service.MemberUpdate;
import org.java.service.BoardDeleteOkService;

//컨트롤러 @Controller
@WebServlet("*.do") // URL패턴
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
		String path = request.getContextPath();
		String basicURL = uri.substring(path.length());
		System.out.println(basicURL);

		String returnURL = "";
		MemberService memberService = null;
		BoardService boardService = null;

		if (basicURL.equals("/index.do")) {
			returnURL = "/index.jsp";

		} else if (basicURL.equals("/joinView.do")) {
			returnURL = "/joinView.jsp";

		} else if (basicURL.equals("/writeView.do")) {
			returnURL = "/writeView.jsp";

		} else if (basicURL.equals("/joinOk.do")) {
			memberService = new MemberInsert();
			memberService.executeQueryService(request, response);
			returnURL = (String) request.getAttribute("returnURL");

		} else if (basicURL.equals("/writeOk.do")) {
			boardService = new BoardInsert();
			boardService.executeQueryService(request, response);
			returnURL = (String) request.getAttribute("returnURL");

		} else if (basicURL.equals("/memberListView.do")) {
			memberService = new MemberSelect();
			memberService.executeQueryService(request, response);
			returnURL = (String) request.getAttribute("returnURL");
		
		} else if (basicURL.equals("/boardListView.do")) {
			boardService = new BoardSelect();
			boardService.executeQueryService(request, response);
			returnURL = (String) request.getAttribute("returnURL");

		} else if (basicURL.equals("/boardDetail.do")) {
			boardService = new BoardDetail();
			boardService.executeQueryService(request, response);
			returnURL = (String) request.getAttribute("returnURL");
			
		}else if (basicURL.equals("/boardUpdate.do")) {
			boardService = new BoardUpdate();
			boardService.executeQueryService(request, response);
			returnURL = (String) request.getAttribute("returnURL");
		}else if (basicURL.equals("/boardDelete.do")) {
			boardService = new BoardDelete();
			boardService.executeQueryService(request, response);
			returnURL = (String) request.getAttribute("returnURL");
		}else if (basicURL.equals("/boardDeleteView.do")) {
			returnURL = "/boardDeletView.jsp";
			
		}else if (basicURL.equals("/boardDeletOk.do")) {
			boardService = new BoardDeleteOkService();
			boardService.executeQueryService(request, response);
			returnURL = (String) request.getAttribute("returnURL");
		} else {
			returnURL = "/notPage.jsp";
		}
		System.out.println(returnURL);
		
		// 정보를 가지고 View페이지로 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher(returnURL);
		dispatcher.forward(request, response);
	}

}
