<%@page import="org.java.dto.BoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ArrayList<BoardDto> boardList = (ArrayList<BoardDto>) request.getAttribute("boardList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardListView</title>
</head>
<body>
	<h1>게시글 목록</h1>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>글내용</th>
			<th>글작성자</th>
			<th>글작성일</th>
			<th>글상세보기</th>
			<th>글삭제1</th>
		</tr>
		<%
		for (BoardDto board : boardList) {
		%>
		<tr>
			<td><%=board.getId()%></td>
			<td><%=board.getTitle()%></td>
			<td><%=board.getContent()%></td>
			<td><%=board.getWriter()%></td>
			<td><%=board.getCreated_date()%></td>
			<td><a href="boardDetail.do?id=<%=board.getId()%>">상세보기</a></td>
			<td><a href="boardDelete.do?id=<%=board.getId()%>">글삭제</a></td>
		</tr>

		<%
		}
		%>


	</table>



<div>
<a href="index.do">HOME</a>
	<a href="joinView.do">회원등록</a>
	<a href="writeView.do">게시글등록</a>
	<a href="memberListView.do">회원목록</a>
</div>









</body>
</html>