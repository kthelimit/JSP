package mvcEX2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/pcontrol")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductService service;

	public ProductController() {
		service = new ProductService();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		String view = "";

		if (action == null) {
			getServletContext().getRequestDispatcher("/pcontrol?action=list").forward(request, response);
			// null일때 오류가 나기 때문에 처리를 해줘야한다.
		} else {
			switch (action) {
			case "list" -> view = list(request, response);
			case "info" -> view = info(request, response);
			}
			getServletContext().getRequestDispatcher("/mvcEx2/" + view).forward(request, response);

		}

	}

	private String info(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("p", service.find(request.getParameter("id")));
		return "productInfo.jsp";
	}

	private String list(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("products", service.findAll());
		return "productList.jsp";
	}

}
