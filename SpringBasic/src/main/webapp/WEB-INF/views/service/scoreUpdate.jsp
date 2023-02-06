<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글 수정 ! ! ! !</h2>

	<form action="update" method="post">
		번호 : ${user.num }<br />
		이름 : <input type="text" name="" value="${user.name }"><br/>
		국 : <input type="text" name="" value="${user.kor }"><br/>
		영 : <input type="text" name="" value="${user.eng }"><br/>

		<input type="submit" value="수정 완료">
	</form>
		<a href="detail?num=${user.num }"><button type="button">취소</button></a>
</body>
</html>