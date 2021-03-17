package com.bharath.patterns.greatest.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bharath.patterns.greatest.mvc.GreatestModel;

/**
 * Servlet implementation class GreatestController
 */
@WebServlet("/greatestController")
public class GreatestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.valueOf(request.getParameter("number1"));
		int num2 = Integer.valueOf(request.getParameter("number2"));
		
		GreatestModel greatestModel = new GreatestModel();
		int result = greatestModel.findGreatest(num1, num2);
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("greatestResult.jsp");
		dispatcher.forward(request, response);
	}

}
