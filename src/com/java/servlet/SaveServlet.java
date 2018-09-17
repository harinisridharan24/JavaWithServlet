package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("patientName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zipcode = request.getParameter("zipcode");
		String insurance = request.getParameter("insurance");
		String mobileNo = request.getParameter("mobileNo");
		
		Address address = new Address();
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setZipcode(zipcode);
		
		Patient patient = new Patient();
		patient.setName(name);
		patient.setPassword(password);
		patient.setEmail(email);
		patient.setInsurance(insurance);
		patient.setMobile_no(mobileNo);
		
		int status = PatientDao.save(patient, address);
		if(status > 0) {
			request.setAttribute("result", "saved");
			request.getRequestDispatcher("Confirm.jsp").include(request, response);
		}
		else {
			request.setAttribute("result", "not");
			request.getRequestDispatcher("Confirm.jsp").include(request, response);
		}
		out.close();
	}
}
