<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<jsp:useBean id="member" class="exercise.MemberBean" />
<jsp:setProperty name = "member" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
label {
	display: inline-block;
	width: 70px;
}
</style>
</head>
<body>
	<h2>입력 완료된 회원 정보</h2>
	<label>이름</label><jsp:getProperty property="name" name="member"/><br>
	<label>아이디</label><jsp:getProperty property="userid" name="member"/><br>
	<label>별명</label><jsp:getProperty property="nickname" name="member"/><br>
	<label>비밀번호</label><jsp:getProperty property="pwd" name="member"/><br>
	<label>이메일</label><jsp:getProperty property="email" name="member"/><br>
	<label>전화번호</label><jsp:getProperty property="phone" name="member"/><br>
</body>
</html>