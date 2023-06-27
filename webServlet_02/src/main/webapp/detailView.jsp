<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.web.dto.MemberDto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DetailView</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>비밀번호</th>
			<th>휴대폰번호</th>
			<th>등록일</th>
		</tr>
<% MemberDto items = (MemberDto)request.getAttribute("memberDto"); %>
		<tr>
			<th><%=items.getId() %></th>
			<th><%=items.getUserid() %></th>
			<th><%=items.getUserpw() %></th>
			<th><%=items.getHtel() %></th>
			<th><%=items.getCreate_date() %></th>
		</tr>
		
	</table>
	<div>
		<a href="index.do">메인 페이지</a>
		<a href="join.do">회원가입 페이지</a>
		<a href="write.do">게시글작성 페이지</a>
		<a href="list.do">회원리스트 페이지</a>
	</div>
	
</body>
</html>