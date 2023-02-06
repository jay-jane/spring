<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>목록 ! ! ! !</h2>
	<c:forEach var="i" items="${list }" varStatus="num">
		<a href="/basic/service/detail?num=${i.num}">${num.index + 1 } </a>
		이름 : ${i.name },
		국 : ${i.kor },
		영 : ${i.eng }
		<%-- <a href="delete?num=${i.num } ">삭제</a> --%>
		<form action="delete" method="post">
			<input type="hidden" name="num" value="${i.num }">
			<button type="submit">삭제하기</button>
		</form>
		<br />
	</c:forEach>
</body>
</html>