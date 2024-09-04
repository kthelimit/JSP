package com.edu.test;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	//FirstServlet은 디폴트 UID 값을 갖고 있어야함. 고유 ID임
	
	public void init() {
		System.out.println("init");
	}
	
	public void service(ServletRequest request, ServletResponse response) {
		System.out.println("service");
	}
}
