<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상세정보 ! ! ! !</h2>
	번호 : ${user.num } <br/>
	잉름 : ${user.name } <br/>
	국 : ${user.kor } <br/>
	영 : ${user.eng } <br/>
	
	<a href="/basic/service/scoreUpdate?num=${user.num }">수정하기</a>
	<a href="/basic/service/scoreList">목록</a>
</body>
</html>