<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>response ex 01 ! ! ! !</h2>
	
	<a href="result01">Model 객체</a><br>
	<a href="result02">ModelAndView 객체</a><br>
	<a href="result03?num=10">MoedelAttribute</a><br>
	
	<form action="result04" method="post">
		<input type="text" name="name">
		<input type="number" name="age">
		<input type="submit" value="ModelAttr 객체">
	</form>
	
</body>
</html>