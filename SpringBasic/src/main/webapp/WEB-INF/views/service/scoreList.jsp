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
		${num.index + 1 },
		이름 : ${i.name },
		국 : ${i.kor },
		영 : ${i.eng }
		<a href="delete?num=${i.num } ">삭제</a>
		<br />
	</c:forEach>
</body>
</html>