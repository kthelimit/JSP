package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadioServlet
 */
@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		
		out.print("<html><head><title>입력정보</title></head><body>");
		out.print("당신이 입력한 정보입니다.");
		out.print("<hr>");
		out.print("성별 : <b>");
		out.print(gender);
		out.print("</b><br>메일 정보 수신 여부 : <b>");
		out.print(chk_mail);
		out.print("</b><br>가입 인사 : <pre>");
		out.print(content);
		out.print("</pre><br><br><br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
