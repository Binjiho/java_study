package org.web.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.MemberDao;

public class MemberInsertService implements MemberService {

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원 등록");

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		MemberDao dao = MemberDao.getInstance();

		int rs = dao.insert(name, password, email);

		String returnURL = "";

		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		if (rs != 1) {
			System.out.println("회원가입 실패");
//
//			out.println("<!doctype html>");// HTML코드를 작셍
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<meta charset='utf-8'>");
//			out.println("<title>회원가입실패페이지</title>");
//			out.println("</head>");
//			out.println("<body>");
//			out.println("<script>");
//			out.println("alert('회원가입실패,회원목록으로 이동합니다.!!!');");
//			out.println("location.href='memberListView.do';");
//			out.println("</script>");
//			out.println("</body>");
//			out.println("</html>");
//
//			out.close();
			if(rs==2) {
				System.out.println("등록 이메일이 존재 합니다. 다시 등록 해주세요!!");
				returnURL="/joinView.do";
			}else {				
				returnURL="/joinFail.jsp";
			}
		} else {
			System.out.println("회원가입 성공");
//			returnURL="/writeView.jsp";			
			returnURL = "/memberListView.do";
		}

		request.setAttribute("returnURL", returnURL);

	}

}
