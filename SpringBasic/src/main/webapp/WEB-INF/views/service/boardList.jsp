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

	<h2>게시글 목록</h2>

	<table>
		<tr>
			<td>번호</td>
			<td>작성자</td>
			<td>제목</td>
			<td>내용</td>
			<td>비고</td>
		</tr>

		<!-- 반복데이터처리 -->
		<c:forEach var="boardItem" items="${list }">
			<tr>
				<td>${boardItem.id }</td>
				<td>${boardItem.name }</td>
				<td>${boardItem.title }</td>
				<td>${boardItem.content }</td>
				<td><input type="button" value="삭제" onclick="location.href='delete?id=${boardItem.id}'"></td>
			</tr>
		</c:forEach>
	</table>

	<%--게시글 작성페이지로 이동시키세요. --%>
	<a href="boardRegister">게시글 작성</a>




</body>
</html>




