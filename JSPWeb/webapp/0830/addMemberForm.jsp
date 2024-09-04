<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h2>회원의 정보 입력 폼</h2>
<form action ="addMember.jsp" method="post">
<label for ="name">이름</label><input type = "text" id ="name" name = "name"><br>
<label for ="userid">아이디</label><input type = "text" id ="userid" name = "userid"><br>
<label for ="nickname">별명</label><input type = "text" id ="nickname" name = "nickname"><br>
<label for ="pwd">비밀번호</label><input type = "password" id ="pwd" name = "pwd"><br>
<label for ="email">이메일</label><input type = "text" id ="email" name = "email"><br>
<label for ="phone">전화번호</label><input type = "text" id ="phone" name = "phone"><br>
<input type ="submit" value="전송">&nbsp;&nbsp; <input type ="reset" value="취소">
</form>
</body>
</html>