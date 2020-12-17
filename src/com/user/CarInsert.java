package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CarInsert")
public class CarInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		String model = request.getParameter("model");
		String year = request.getParameter("prodyear");
		String priceperday = request.getParameter("price");
		
		boolean isTrue;
		isTrue = UserDBUtil.insertcar(type, model, year, priceperday);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("addedcar.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("notaddedcar.jsp");
			dis2.forward(request, response);
		}
		
	}

}
