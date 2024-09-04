package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String job = request.getParameter("job");
		String[] interests = request.getParameterValues("interest");

		out.print("<html><head><title>콤보박스 결과</title></head><body>");
		out.print("당신이 선택한 직업 : <b>");
		out.print(job);
		out.print("</b><hr>");
		out.print("당신이 선택한 관심 분야 : <b>");
		if (interests == null) {
			out.print("없음");
		} else {
			for (String interest : interests) {
				out.print(interest + " ");
			}
		}
		out.print("</b><br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();

	}

}
