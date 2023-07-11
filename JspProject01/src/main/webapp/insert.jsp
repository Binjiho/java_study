<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>

<!-- 커넥션, DB연결 -->
<sql:setDataSource 
	var="conName" 
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/mysql06"
	user="root"
	password="1234"
	/>	
	
<!-- 데이터 추가 , 삭제, 수정  -> 성공하면 1 -->
<sql:update var="result" dataSource="${conName}">	
	insert into member_0711(email,password,name) values(?,?,?)
	<%-- form name --%>
<%-- 	<sql:param value="<%=request.getParameter("email") %>"/> --%>
	<sql:param value="${param.email}"/>
	<sql:param value="${param.password}"/>
	<sql:param value="${param.name}"/>
</sql:update>
<%-- 조건문   --%>
<c:choose>       <%-- 데이터 추가 , 삭제, 수정  -> 성공하면 1  --%>
	<c:when test="${result ==1 }">
		<script>
			alert("회원 가입 성공!! 회원 목록페이지로 이동 ->  ");
			location.href = "select.jsp";
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("회원 가입 실패...회원 가입페이지로 이동 ");
			location.href = "join.jsp";
		</script>
	</c:otherwise>
<%-- 	<c:when test="${result !=1 }">
		<script>
			alert("회원 가입 실패...회원 가입페이지로 이동 ");
			location.href = "join.jsp";
		</script>
	</c:when> --%>
</c:choose>




<!-- DB데이터를 get "select" -->
<%-- <sql:query var="result" dataSource="${conName }">
	select * from member_0711
</sql:query>

<table border="1">
	<tr>
		<th>회원번호</th>
		<th>이메일</th>
		<th>비빌번호</th>
		<th>이름</th>	
		<th>가입날짜</th>	
	</tr>	                 한행씩 테이블을 결과를 가져온다.
<c:forEach var="rs"  items="${result.rows}">
	<tr>
		<td>${rs.member_id}</td>	
		<td>${rs.email}</td>	
		<td>${rs.password}</td>	
		<td>${rs.name}</td>	
		<td>${rs.create_time}</td>		
	</tr>
</c:forEach>


</table>

 --%>

</body>
</html>