<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.java.dto.BoardDto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listView</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>비밀번호</th>
			<th>휴대폰번호</th>
			<th>등록일</th>
			<th>상세보기</th>
		</tr>
		<%
			ArrayList<BoardDto> memberList = (ArrayList<BoardDto>)request.getAttribute("list");
			for (BoardDto items: memberList) {
		%>
		<tr>
			<th><%=items.getId() %></th>
			<th><%=items.getTitle() %></th>
			<th><%=items.getContent() %></th>
			<th><%=items.getWriter() %></th>
			<th><%=items.getCreate_date() %></th>
			<th>
				<a href="/webServlet_02/detailView.do?id=<%=items.getId()%>">상세보기</a>
			</th>
		</tr>
		<%
			}
		%>
	</table>
	<div>
		<a href="index.do">메인 페이지</a>
		<a href="join.do">회원가입 페이지</a>
		<a href="write.do">게시글작성 페이지</a>
		<a href="list.do">회원리스트 페이지</a>
	</div>
</body>
</html>