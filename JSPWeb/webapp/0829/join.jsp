<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<style type = "text/css">
label {
	display: inline-block;
	width: 160px;
	float: left;
}

#button {
	text-align: center;
}
</style>
<script type="text/javascript" src = "JS/join.js"></script>
</head>
<body>
<form method = "get" action="JoinServlet" name = "reg_frm" id = "reg_frm">
	<label for = "name">이름</label><span style ="color:red">*</span>
	<input type="text" name = "name" id = "name"><br>
	
	<label for = "rrn">주민등록번호</label><span style ="color:red">*</span>
	<input type="text"  name = "rrn1" id = "rrn"> - <input name = "rrn2" id = "rrn"><br>
	
	<label for = "id">아이디</label><span style ="color:red">*</span>
	<input type="text"  name = "id" id = "id"><br>
	
	<label for = "pwd">비밀번호</label><span style ="color:red">*</span>
	<input type="password"  name = "pwd" id = "pwd"><br>
	<label for = "pwd_chk">비밀번호 확인</label><span style ="color:red">*</span>
	<input type="password"  name = "pwd_chk" id = "pwd_chk"><br>
	
	<label for = "email">이메일</label> <input type="text" name = "email"> @ <input type="text" name = "email_dns" value="">
	<select name="emailaddr" >
	<option value = "" >직접 입력</option>
	<option value = "naver.com">naver.com</option>
	<option value = "gmail.com">gmail.com</option>
	</select><br>
	
	<label for = "post">우편번호</label> <input type="text" name = "post" id = "post"><br>
	<label for = "address">주소</label> <input type="text" name = "address1" id = "address"> <input type="text" name = "address2" id = "address"><br>
	<label for = "phone">핸드폰번호</label> <input type="tel" name = "phone" id = "phone"><br>
	
	<label for = "job">직업</label> 
	<select id="job" name="job">
		<option value="학생">학생</option>
		<option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
		<option value="언론">언론</option>
		<option value="공무원" selected>공무원</option>
		<option value="군인">군인</option>
		<option value="서비스업">서비스업</option>
		<option value="교육">교육</option>
	</select><br>
	<label for = "mailing">메일/SMS 정보 수신</label> <input type="radio" name = "mailing" id = "mailing" value="yes" checked>수신 <input type="radio" name = "mailing" id = "mailing" value="no">수신거부<br>	
	<label for="interest"> 관심분야 :</label> 
	<input type="checkbox" name="interest" value="생두"> 생두
	<input type="checkbox" name="interest" value="원두"> 원두 
	<input type="checkbox" name="interest" value="로스팅"> 로스팅
	<input type="checkbox" name="interest" value="핸드드립"> 핸드드립
	<input type="checkbox" name="interest" value="에스프레소"> 에스프레소 
	<input type="checkbox" name="interest" value="창업"> 창업<br><br>
	<div id = "button">
		<button type = "submit" onclick = "return check_ok()">회원가입</button>
		<button type = "reset">취소</button>	
	</div>
</form>
</body>
</html>