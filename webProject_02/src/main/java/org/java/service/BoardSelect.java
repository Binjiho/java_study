package org.java.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.java.dao.BoardDao;
import org.java.dto.BoardDto;

public class BoardSelect implements BoardService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BoardDao dao = BoardDao.getInstance();		
		String returnUrl = "";
		ArrayList<BoardDto> items = new ArrayList<BoardDto>();
		HashMap<String,String> searchMap = new HashMap<>();

		items = dao.getList(searchMap);			
		returnUrl = "boardListView.jsp";
		
		request.setAttribute("boardList", items);
		//return View페이지 설정
		request.setAttribute("returnUrl", returnUrl);

	}

}
