<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JoinView</title>
</head>
<body>
	<form action="joinWrite.do">
		아이디: <input type="text" name="userid"/><br>
		비밀번호: <input type="password" name="userpw"/><br>
		휴대폰번호: <input type="text" name="htel"/><br>
		<input type="submit" value="회원가입실행"/>
	</form>
	<div>
		<a href="index.do">메인 페이지</a>
		<a href="join.do">회원가입 페이지</a>
		<a href="write.do">게시글작성 페이지</a>
		<a href="list.do">회원리스트 페이지</a>
	</div>
</body>
</html>