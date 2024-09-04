<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="msg" value="Hello" />
	\${msg} = ${msg}<br>
	<c:set var="age">30</c:set>
	\${age} = ${age}<hr>
	<c:set var="member" value="<%=new exercise.MemberBean()%>" />
	<c:set target="${member}" property="name" value="케이" />
	<c:set target="${member}" property="userid">kei</c:set>
	\${member}=${member}<hr>
	\${member.name}=${member.name}<hr>
	<c:set var="add" value="${10+5}" />
	\${add} = ${add}<br>
	<c:set var="flag" value="${10>5}" />
	\${flag} = ${flag}<br>



</body>
</html>