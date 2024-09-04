<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Connection conn = null;
PreparedStatement pstmt = null;
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String uid = "ex_user";
String pass = "1234";
String sql = "insert into manager values(?, ?, ?)";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String phone = request.getParameter("phone");

	try {
		//1. JDBC 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. 데이터베이스 연결 객체인 Connection 생성
		conn = DriverManager.getConnection(url, uid, pass);
		//3. Statement 객체 생성하기(Preparedstatment)
		pstmt = conn.prepareStatement(sql);
		//4. 바인딩 변수를 채운다
		pstmt.setString(1, name);
		pstmt.setString(2, address);
		pstmt.setString(3, phone);
		//5. SQL문 실행해서 결과처리
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		//6.사용한 리소스 해제
		try {
			if (pstmt != null)
		pstmt.close();
			if (conn != null)
		conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//finally의 끝
	%>
	
	<h3>회원 가입 성공</h3>
	<a href="Manager.jsp">회원 전체 목록 보기</a>

</body>
</html>