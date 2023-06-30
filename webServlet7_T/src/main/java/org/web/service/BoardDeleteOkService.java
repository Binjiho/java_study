package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.BoardDao;

public class BoardDeleteOkService implements BoardService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("글삭제2");
		//글삭제 페이지로 이동후 삭제 (글번호, 글작성자) -> 글번호확인 -> 글번호&글작성자
		//delete from board0626 where board0626_id=1 and BAORD_WRITER='m1@gmail.com';
		
		//1. 글번호 -> 2. 글작제  글번호, 글작성자
		// 삭제 성공 -> 글목록페이지로 이동
		
		
		Long board0626_id = Long.parseLong(request.getParameter("board0626_id"));
		String board_writer = request.getParameter("board_writer");
		
		BoardDao dao = BoardDao.getInstance();
		int rs = dao.boardDelete2(board0626_id,  board_writer);

		String returnURL = "";

		if (rs != 1) {
			System.out.println("글삭제 Faill!!");
			if (rs == 2) {
				System.out.println("작성글이 없습니다.");
			} else {
				System.out.println("글삭제 오류!!");
			}
			returnURL = "/index.do";
		} else {
			System.out.println("글삭제 Success!!");
			
			returnURL = "/boardListView.do";
		}

		request.setAttribute("returnURL", returnURL);

		
	}

}
