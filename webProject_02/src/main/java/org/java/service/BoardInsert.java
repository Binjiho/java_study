package org.java.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.java.dao.BoardDao;

public class BoardInsert implements BoardService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		BoardDao dao = BoardDao.getInstance();
		int rs = dao.insert(title,content,writer);
		
		String returnUrl = "";
		if(rs!=1) {
			System.out.println("등록실패");
			returnUrl = "/";
		}else {
			returnUrl = "boardListView.jsp";			
		}
		
		//return View페이지 설정
		request.setAttribute("returnUrl", returnUrl);

	}

}
