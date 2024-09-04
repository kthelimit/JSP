package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryTestServlet
 */
@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8"); // 한글 깨짐 방지
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head><body>");
		out.print("<h1>GET 방식으로 요청되었습니다.</h1>");

		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String name = req.getParameter("user_name");
		String[] hobby = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String religion = req.getParameter("religion");
		String introduction = req.getParameter("introduction");

		out.print("ID : " + id + "<br/>");
		out.print("Password : " + pwd + "<br/>");
		out.print("Name : " + name + "<br/>");
		for (int i = 0; i < hobby.length; i++) {
			out.print("Hobby" + (i + 1) + " : " + hobby[i] + "<br/>");
		}
		out.print("Gender : " + gender + "<br/>");
		out.print("Religion : " + religion + "<br/>");
		out.print("Introduction : " + introduction + "<br/>");
		out.print("전체 Query 문자열 : " + req.getQueryString() );
		
		out.println("</body></html>");
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8"); // 한글 깨짐 방지
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head><body>");
		out.print("<h1>POST 방식으로 요청되었습니다.</h1>");

		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String name = req.getParameter("user_name");
		String[] hobby = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String religion = req.getParameter("religion");
		String introduction = req.getParameter("introduction");

		out.print("ID : " + id + "<br/>");
		out.print("Password : " + pwd + "<br/>");
		out.print("Name : " + name + "<br/>");
		for (int i = 0; i < hobby.length; i++) {
			out.print("Hobby" + (i + 1) + " : " + hobby[i] + "<br/>");
		}
		out.print("Gender : " + gender + "<br/>");
		out.print("Religion : " + religion + "<br/>");
		out.print("Introduction : " + introduction + "<br/>");
		out.print("전체 Query 문자열 : " + req.getQueryString() );
		
		out.println("</body></html>");
		out.close();
	}

}
