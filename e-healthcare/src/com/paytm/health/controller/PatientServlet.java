package com.paytm.health.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paytm.health.dao.PatientDao;
import com.paytm.health.model.Patient;

@WebServlet("/patientregister")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PatientDao patdao = new PatientDao();
    public PatientServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/patientregister.jsp");
		disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");

		Patient pat = new Patient();
		pat.setId(id);
		pat.setFirstname(firstname);
		pat.setLastname(lastname);
		pat.setUsername(username);
		pat.setPassword(password);
		pat.setPhone(phone);
		pat.setEmail(email);
		pat.setJobrole();
		
		try {
			patdao.registerPatient(pat);
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/patientdetails.jsp");
		disp.forward(request, response);

	}
}