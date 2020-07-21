package com.paytm.health.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.paytm.health.dao.EmployeeDao;
import com.paytm.health.model.Employee;

@WebServlet("/employeeregister")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao empdao = new EmployeeDao();
	
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
		disp.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String jobrole = request.getParameter("jobrole");
		String dept = request.getParameter("dept");

		Employee emp = new Employee();
		emp.setId(id);
		emp.setFirstname(firstname);
		emp.setLastname(lastname);
		emp.setUsername(username);
		emp.setPassword(password);
		emp.setPhone(phone);
		emp.setEmail(email);
		emp.setJobrole(jobrole);
		emp.setDept(dept);
		
		try {
			empdao.registerEmployee(emp);
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		disp.forward(request, response);
	}
}
