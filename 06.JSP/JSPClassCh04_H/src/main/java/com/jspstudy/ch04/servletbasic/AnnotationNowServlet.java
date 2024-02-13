package com.jspstudy.ch04.servletbasic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/now")
public class AnnotationNowServlet extends HttpServlet {
	@Override
    
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out= response.getWriter();
		Calendar cal = Calendar.getInstance();
		
		out.println("<h2>서블릿애노테이션 등록하기</h1>");
		out.println("hello Servlet Annotation");
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
