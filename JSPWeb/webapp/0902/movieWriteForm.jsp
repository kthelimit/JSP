<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
<style>
* {
	margin: 0px;
}

body {
	width: 800px;
	margin: 0 auto;
}

h3 {
	text-align: center;
	margin: 30px 0;
}

.container * {
	vertical-align: middle;
}

ul {
	list-style-type: none;
}

ul li {
	margin-top: 5px;
}

label {
	display: inline-block;
	width: 120px;
	text-align: center;
	font-weight: bold;
}

#buttons {
	text-align: center;
}

#buttons * {
	margin: 5px;
}
</style>
</head>
<body>
	<h3>게시판 글쓰기</h3>
	<form action="movieWrite.jsp" method="post">
<ul>
		<li><label for="name">제목</label>  <input type="text" id="name" name="name"></li>
		<li><label for="price">가격</label>  <input type="text" id="price" 	name="price">원</li>
		<li><label for="director">감독</label>  <input 	type="text" id="director" name="director"></li>
		<li><label for="actor">출연배우</label>  <input type="text" id="actor" 	name="actor"></li>
		<li><div class="container">
			<label for="synopsis">시놉시스</label>
			<textarea rows="15" cols="70" id="synopsis" name="synopsis"></textarea>
		</div></li>
		<li><label for="gnere">장르</label> <select id="gnere"
			name="gnere">
			<option value="액션">액션</option>
			<option value="공포">공포</option>
			<option value="스포츠">스포츠</option>
			<option value="다큐멘터리">다큐멘터리</option>
			<option value="로맨스">로맨스</option>
			<option value="뮤지컬">뮤지컬</option>
			<option value="SF">SF</option>
			<option value="스릴러">스릴러</option>
			<option value="코미디">코미디</option>
			<option value="판타지">판타지</option>
		</select></li>
		</ul>
		<div id="buttons">
			<input type="submit" value="등록"><input type="reset" value="다시 작성">
		</div>
	</form>
</body>
</html>