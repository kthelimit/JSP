package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		String op = req.getParameter("op");
		double result = 0;
		switch (req.getParameter("op")) {
			case "+" -> result = n1 + n2;
			case "-" -> result = n1 - n2;
			case "*" -> result = n1 * n2;
			case "/" -> {if(n2!=0) {result = (double)n1 / n2;}}
		}
		PrintWriter out = res.getWriter();
		out.append("<!DOCTYPE html><html><head><title>계산기 서블릿</title></head><body>")
		.append("<hr>");
		if(op.equals("/") && n2==0) {
			out.append("0으로 나눌 수 없습니다.");
		}
		else {
		out.append("계산 결과 : " + result);
		}
		out.append("</body></html>");
	}

}
