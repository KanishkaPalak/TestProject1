package com.paytm.health.dao;

import java.sql.*;
import java.sql.DriverManager;

import com.paytm.health.model.Employee;

public class EmployeeDao {

	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String insert_query = "insert into Employee values " + "(?,?,?,?,?,?,?,?,?);";
		int result = 0;
		
		Class.forName("com.mysql.jdbc.cj.Driver");
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database2","root","31081997kanishka,..");
		
				PreparedStatement pst = connection.prepareStatement(insert_query))
		{
			pst.setString(1, employee.getId());
			pst.setString(2, employee.getFirstname());
			pst.setString(3, employee.getLastname());
			pst.setString(4, employee.getUsername());
			pst.setString(5, employee.getPassword());
			pst.setString(6, employee.getPhone());
			pst.setString(7, employee.getEmail());
			pst.setString(8, employee.getJobrole());
			pst.setString(9, employee.getDept());
			
			System.out.println(pst);
			result = pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
			return result;	
				
	}
}
