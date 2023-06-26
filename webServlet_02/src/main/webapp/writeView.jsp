<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WriteView</title>
</head>
<body>
	<form action="joinOk.do">
		제목: <input type="text" name="title"/><br>
		내용: <input type="text" name="content"/><br>
		작성자: <input type="text" name="writer"/><br>
		<input type="submit" value="게시글작성실행"/>
	</form>
	<div>
		<a href="index.do">메인 페이지</a>
		<a href="join.do">회원가입 페이지</a>
		<a href="write.do">게시글작성 페이지</a>
	</div>
</body>
</html>