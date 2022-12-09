/**
 * 
 */
package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author sanumalla
 *
 */
public class SqServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		String result = "";
//		Object result = Arrays.stream(cookies).filter(e -> e.getName() == "result").getClass();
		for(Cookie c: cookies) {
			if(c.getName().equals("result")) {
				result = c.getValue();
			}
		}
		
		PrintWriter out = resp.getWriter();
//		int a = Integer.parseInt(req.getParameter("num1"));
//		int b = Integer.parseInt(req.getParameter("num2"));
//		out.println("product of "+a+"and "+b+" is "+a*b);
		out.println("addition is "+ (result.isEmpty() ? "nothing is there" : result));
	}
}
