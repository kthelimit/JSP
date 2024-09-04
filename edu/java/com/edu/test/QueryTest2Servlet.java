package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryTest2Servlet
 */
@WebServlet("/queryTest2")
public class QueryTest2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title> Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>Post방식 Query 문자열 추출</h1>");
		ServletInputStream input = req.getInputStream();
		int len = req.getContentLength(); //몸체에 담겨있는 문자열의 길이
		byte[] buf = new byte[len];
		input.readLine(buf, 0, len); //줄 단위로 데이터를 읽어들임
		String s = new String(buf); //buf에 들은 byte값을 String단위로 바꿔준 것임
		out.print("전체 문자열 : " + s);
		out.println("</body></html>");
		out.close();

	}

}
