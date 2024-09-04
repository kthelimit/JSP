package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
	
		
		PrintWriter out = res.getWriter();
		out.print("<html><head><title></title></head><body>");
		
		String name = req.getParameter("name");
		out.print("이름 : <b>");
		out.print(name);
		
		String rrn = req.getParameter("rrn1")+"-"+req.getParameter("rrn2");
		out.print("</b><br>주민번호 : <b>");
		out.print(rrn);

		String id = req.getParameter("id");
		out.print("</b><br>아이디 : <b>");
		out.print(id);

		String pwd = req.getParameter("pwd");
		out.print("</b><br>비밀번호 : <b>");
		out.print(pwd);		
		
		String email= req.getParameter("email");
		if(req.getParameter("email_dns").trim()=="") {
			email+="@" + req.getParameter("emailaddr");
		}else {
			email+="@"+req.getParameter("email_dns");
		}
		out.print("</b><br>이메일 : <b>");
		out.print(email);
						
		String post = req.getParameter("post");
		out.print("</b><br>우편번호 : <b>");
		out.print(post);
				
		String address = req.getParameter("address1")+" "+req.getParameter("address2");
		out.print("</b><br>주소 : <b>");
		out.print(address);
				
		String phone = req.getParameter("phone");
		out.print("</b><br>핸드폰 번호 : <b>");
		out.print(phone);
				
		String job = req.getParameter("job");
		out.print("</b><br>직업 : <b>");
		out.print(job);
				
		String[] interests = req.getParameterValues("interest");
		out.print("</b><br>관심분야 : <b>");
		if (interests == null) {
			out.print("없음");
		} else {
			for (String interest : interests) {
				out.print(interest + " ");
			}
		}
		out.print("</b><br><br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		
		
	}

}
