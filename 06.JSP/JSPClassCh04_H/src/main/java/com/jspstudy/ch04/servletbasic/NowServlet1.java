package com.jspstudy.ch04.servletbasic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class NowServlet1 extends HttpServlet {
@Override
    public void doGet(HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException {	
		response.setContentType("text/html; charset=utf-8");		
		PrintWriter out=response.getWriter();
		Calendar cal= Calendar.getInstance();		
		out.println("<h2>서블릿작성</h2>");
		out.println("hi servlet");
		out.close();
	}
}
