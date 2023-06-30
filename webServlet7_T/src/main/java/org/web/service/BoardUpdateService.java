package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.BoardDao;

public class BoardUpdateService implements BoardService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("게시글 수정");

		Long board0626_id = Long.parseLong(request.getParameter("board0626_id"));
		String board_title = request.getParameter("board_title");
		String content = request.getParameter("content");
		String board_writer = request.getParameter("board_writer");
		// 생성시간, 수정 시간은 자동으로 설정 할수 있다.-> spring boot JPA 자동 설정한다.
		BoardDao dao = BoardDao.getInstance();
		int rs = dao.boardUpdate(board0626_id, board_title, content, board_writer);

		String returnURL = "";

		if (rs != 1) {
			System.out.println("글수정 Faill!!");
			if (rs == 2) {
				System.out.println("작성글이 없습니다.");
			} else {
				System.out.println("게시글 작성 오류!!");
			}
			returnURL = "/index.do";
		} else {
			System.out.println("글수정 Success!!");
//			reurnURL = "/boardListView.do";// 글목록 페이지
			//글상세 페이지로 이동
			returnURL = "/boardDetail.do?board0626_id="+board0626_id;
		}

		request.setAttribute("returnURL", returnURL);

	}

	
	
	
	
	
	
	
	
}
