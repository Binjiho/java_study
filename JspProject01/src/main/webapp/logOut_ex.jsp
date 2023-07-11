<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionId=(String)session.getAttribute("sessionId");
	if(sessionId!=null){
		// 모든 세션 삭제
		session.invalidate();
		%>
		<script>
			alert("로그아웃 성공");
			//history.go(-1); // 이전페이지로 이동
			location.href="header_ex.jsp"; // 페이지 이동
		</script>
		<%
		
	}
%>