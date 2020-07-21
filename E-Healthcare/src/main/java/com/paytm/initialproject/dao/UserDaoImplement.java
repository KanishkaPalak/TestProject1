package com.paytm.initialproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDaoImplement implements UserDao {

	@Override
	public void showAllDoctors() {

		try	
		{
			String url = "jdbc:mysql://localhost:3306/database1";
			String uname = "root";
			String pass = "31081997kanishka,..";
			Connection con = (Connection) DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
			String userData = "";
			
			String query = "select id, uname, dept, phn, email from Users where urole=Doctor";
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				userData = rs.getInt("id") + " : " + rs.getString("name") + " : " + rs.getString("dept") + " : " + rs.getInt("phn") + " : " + rs.getString("email");
				System.out.println(userData);				
			}
			
			st.close();
			con.close();
		}	catch(Exception ex)
		{
			System.out.println("No doctors found! :(");
		}
				
	}

}
