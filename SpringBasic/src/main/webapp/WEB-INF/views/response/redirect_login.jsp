<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>redirect 사용하기 ! ! ! !</h2>
	<p>${msg }</p>
	<form action="login" method="post">
		<input type="text" name="id">
		<input type="text" name="pw">
		<input type="submit" value="로그인">
	</form>
</body>
</html>