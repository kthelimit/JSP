<%@page import = "java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content = "text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Calendar date = Calendar.getInstance();
SimpleDateFormat today = new SimpleDateFormat("yyyy�� MM�� dd��");
SimpleDateFormat now = new SimpleDateFormat("hh�� mm�� ss��");
%>
������ <b> <%= today.format(date.getTime()) %></b> �Դϴ�. <br>
���� �ð��� <b> <%=now.format(date.getTime()) %></b> �Դϴ�.
</body>
</html>