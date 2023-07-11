<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	
	String sessionId=(String)session.getAttribute("sessionId");
%>

<div class="header">
	<div class="nav">
		<h1 class="logo">LOGO</h1>
		<div class="gnb">
			<ul>
				<%-- 로그인과 상관없이 기본페이지  --%>
				<li><a href="#">HOME</a></li>
				<li><a href="#">LIST</a></li>
				<%
					if(sessionId!=null){
					%>
				<%-- 로그인 --%>
				<li><a href="#">회원수정</a></li>
				<li><a href="logOut_ex.jsp">LogOut</a></li>
				<li><a href="#">ADMIN</a></li>					
					<%	
					}else{
						%>
				<%-- 비로그인--%>
				<li><a href="#">회원가입</a></li>
				<li><a href="login_ex.jsp">Login</a></li>
				<li><a href="#">ADMIN</a></li>
						
						<%
					}
				%>
			</ul>
		</div>
	</div>
</div>