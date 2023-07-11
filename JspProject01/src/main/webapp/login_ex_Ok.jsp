<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId=(String)request.getParameter("userId");
	String userPw=(String)request.getParameter("userPw");

	if(userId.equals("root")){
		if(userPw.equals("1111")){
			//로그인 성공이면 세션아이디를 설정
			session.setAttribute("sessionId", userId);
			session.setMaxInactiveInterval(60*30);
		%>
		<script>
			alert("로그인 성공!!");
			location.href="header_ex.jsp"; // 페이지 이동
		</script>
		<%				
		}
	}else{
		%>
		<script>
			alert("로그인 실패, 다시 로그인해주세요");
			location.href="login_ex.jsp";			
		</script>
		<%
		
	}
	
	
%>

