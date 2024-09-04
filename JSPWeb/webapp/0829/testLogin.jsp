<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder"%>
<%
String id = "berrytop";
String pwd = "1234";
String name = "이정은";
request.setCharacterEncoding("UTF-8");
if (id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {
	response.sendRedirect("loginMain.jsp?name=" + URLEncoder.encode(name, "UTF-8"));
} else {
	response.sendRedirect("loginForm.jsp");
}
%>