<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id ="movie" class="exercise.MovieBean"/>
<jsp:setProperty name ="movie" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 완료된 정보</title>
<style>
.center{
text-align : center;
font-weight : bold;
}
</style>
</head>
<body>
	<h3>입력 완료된 정보</h3>
	<table>
		<tr>
			<td class="center">제목</td>
			<td><c:out value="${movie.name}"/></td>
		</tr>
		<tr>
			<td class="center">가격</td>
			<td><c:out value="${movie.price}"/></td>
		</tr>
		<tr>
			<td class="center">감독</td>
			<td><c:out value="${movie.director}"/></td>
		</tr>
		<tr>
			<td class="center">출연배우</td>
			<td><c:out value="${movie.actor}"/></td>
		</tr>
		<tr>
			<td class="center">시놉시스</td>
			<td><c:out value="${movie.synopsis}"/></td>
		</tr>
		<tr>
			<td class="center">장르</td>
			<td><c:out value="${movie.gnere}"/></td>
		</tr>
	</table>
</body>
</html>