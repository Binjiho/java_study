package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.BoardDao;

public class BoardDeleteService implements BoardService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("게시글 삭제1");

		Long board0626_id = Long.parseLong(request.getParameter("board0626_id"));

		BoardDao dao = BoardDao.getInstance();
		int rs = dao.boardDelete(board0626_id);

		String returnURL = "";
		
		if (rs != 1) {
			if (rs == 2) {
				//   JPA ->   findById(),findByName(),findByBoard0626Id() -> 아이디 찾기
				System.out.println("글삭제 번호가 없습니다.");
				returnURL = "/boardListView.do";
			} else {
				System.out.println("글삭제 Faill!!");
				returnURL = "/boardListView.do";
			}
		} else {
			System.out.println("글삭제 Success!!");
			returnURL = "/boardListView.do";
		}
		request.setAttribute("returnURL", returnURL);

	}

}
