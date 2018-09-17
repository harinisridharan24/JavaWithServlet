package com.java.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		int status = PatientDao.delete(id);
		if(status > 0) {
			request.setAttribute("result", "deleted");
			request.getRequestDispatcher("Confirm.jsp").include(request, response);
		}
		else {
			request.setAttribute("result", "not");
			request.getRequestDispatcher("Confirm.jsp").include(request, response);
		}
	}
}
