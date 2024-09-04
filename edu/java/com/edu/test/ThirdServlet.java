package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method");
	}
	public void destroy() {
		System.out.println("destroy method");
	}
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("service method"); 
//	}//브라우저 요청과 상관없는 통신
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet method"); 
		//한글 깨짐 방지
//		response.setContentType("text/html");
//		response.setCharacterEncoding("UTF-8"); //문자만 설정
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter(); //String객체
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello World </title>");
		out.println("</head>");
		out.println("<body>");
			out.println("<h1>Hello Servlet</h1>");
			out.println("<div>한글을 적어봅시다.</div>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost method");
	}

}
