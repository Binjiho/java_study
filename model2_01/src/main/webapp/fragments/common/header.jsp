<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//로그인이 성공하면 session 아이디 설정  ->  Spring Security 관리
	String sessionId=(String) session.getAttribute("sessionId");
%>
<div class="header">
	<div class="nav">
		<h1 class="logo">
			<a href="index.do">LOGO</a>
		</h1>
		<div class="gnb">
			<ul>
				<li><a href="index.do">HOME</a></li>
				<li><a href="list.do">LIST</a></li>
				<li><a href="joinView.do">JOIN</a></li>
				<li><a href="loginView.do">LOGIN</a></li>
				<%-- 로그인 한 후에 보이기, 로그인한 회원의 정보 수정, 삭제  --%>
				<%
					if(sessionId!=null){
				%>
				<li><a href="updateView.do">UPDATE</a></li>
				<li><a href="deleteView.do">DELETE</a></li>
				<%
					if(sessionId.equals("ADMIN")){
						%>
				<%-- 로그인, session 아이디가  ADMIN인 관리자만 보이게 --%>
				<li><a href="adminView.do">ADMIN</a></li>						
						<%
						}					
					}
				%>
			</ul>
		</div>
	</div>
</div>