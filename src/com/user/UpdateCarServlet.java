package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateCarServlet")
public class UpdateCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String up = request.getParameter("update");
		String del = request.getParameter("delete");
		String id = request.getParameter("carid");
		String type = request.getParameter("type");
		String model = request.getParameter("model");
		String productionyear = request.getParameter("prodyear");
		String rentingPriceperday = request.getParameter("rentingprice");
		
		if(del == null && up != null) {
			boolean isTrue;
			
			isTrue = UserDBUtil.updatecar(id, type, model, productionyear, rentingPriceperday);
			
			if(isTrue == true) {
				RequestDispatcher dis = request.getRequestDispatcher("carupdatedsuccess.jsp");
				dis.forward(request, response);
			}
			else {
				RequestDispatcher dis = request.getRequestDispatcher("carupdatedunsuccess.jsp");
				dis.forward(request, response);
			}
		}
		else if(del != null && up == null) {
			boolean isTrue;
			
			isTrue = UserDBUtil.deletecar(id);
			
			if(isTrue == true) {
				RequestDispatcher dis = request.getRequestDispatcher("cardeletedsuccess.jsp");
				dis.forward(request, response);
			}
			else {
				RequestDispatcher dis = request.getRequestDispatcher("cardeletedunsuccess.jsp");
				dis.forward(request, response);
			}
		}
		
	}

}
