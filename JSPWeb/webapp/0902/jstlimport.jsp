<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlimport</title>
</head>
<body>
<c:import url="http://localhost:8080/JSPWeb/0902/fruitSelectForm.jsp" var="data"></c:import>
${data}
</body>
</html>