/**g
 * 
 */
package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author sanumalla
 *
 */

public class AddServlet extends HttpServlet{
	
//	@Override
//	public void doPost(HttpServletRequest req, HttpServletResponse res) {
//		
//	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int result = a + b;
		System.out.println("result is "+ result);
		Cookie cookie = new Cookie("result", result+"");
		res.addCookie(cookie);
//		PrintWriter out = res.getWriter();

//		out.println("result is "+result);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
//		res.sendRedirect("sq?num1="+a+"&num2="+b);
		res.sendRedirect("sq");
//		res.setContentType(getServletInfo());
	}
	
}
