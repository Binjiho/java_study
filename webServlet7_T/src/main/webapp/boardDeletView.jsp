<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글삭제페이지</title>
</head>
<body>
<h1>게시글삭제</h1>
<form action="boardDeletOk.do" method="POST">
글번호: <input type="text" name="board0626_id" /> <br />
글작성자: <input type="text" name="board_writer" /> <br />
<input type="submit" value="글삭제실행" />
</form>
</body>
</html>