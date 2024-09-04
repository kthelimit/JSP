package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckboxServlet
 */
@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String[] items = request.getParameterValues("item");
		out.print("<html><head><title>체크박스</title></head><body>");

		if (items!= null) {
			out.print("당신이 선택한 항목입니다.");
			out.print("<hr>");
			for(String item :items) {
				out.print(item + " ");
			}
			
			/*
			 * for (int i = 0; i < items.length; i++) { out.print(items[i] + " "); }
			 */
		} else {
			out.print("선택한 항목이 없습니다.");
		}

		out.print("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();

	}

}
