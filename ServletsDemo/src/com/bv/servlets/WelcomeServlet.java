package com.bv.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
//@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String username = request.getParameter("username");
		out.print("<h1>Login Successful!!!</h1>");
		
		out.print("Hello "+username);
		
		ServletConfig config=getServletConfig();
		String paramName = config.getInitParameter("x");
		out.print("<p>Config Param: </p> "+paramName);
		out.print("<a href = 'ThirdServlet'>Third Servlet</a>");
		
		ServletContext context = getServletContext();
		String ctx = context.getInitParameter("contextParameter");
		out.print("Context param :"+ctx);
		out.print("<a href = 'ThirdServlet'>Third Servlet</a>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
