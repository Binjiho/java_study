package org.java.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.java.dto.BoardDto;
import org.java.dao.BoardDao;

public class MemberSelect implements MemberService {
	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BoardDao dao = BoardDao.getInstance();		
		String returnUrl = "";
		ArrayList<BoardDto> items = new ArrayList<BoardDto>();
		HashMap<String,String> searchMap = new HashMap<>();

		System.out.println(request);

		items = dao.getList(searchMap);			
		returnUrl = "listView.jsp";
		
		request.setAttribute("list", items);
		//return View페이지 설정
		request.setAttribute("returnUrl", returnUrl);
	}
}
