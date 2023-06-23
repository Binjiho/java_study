<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JoinView</title>
</head>
<body>
	<form action="joinOk.do">
		사원이름: <input type="text" name="name"/><br>
		사원이메일: <input type="text" name="email"/><br>
		사원부서: <select name="depart">
					<option value="영업부">영업부</option>
					<option value="기획부">기획부</option>
					<option value="IT부">IT부</option>
					<option value="마케팅부">마케팅부</option>
				</select><br>
		<input type="submit" value="직원등록실행"/>
	</form>
	<div>
		<a href="joinView.do">직원등록페이지</a>
	</div>
</body>
</html>