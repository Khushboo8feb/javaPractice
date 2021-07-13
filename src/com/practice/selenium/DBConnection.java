package com.practice.selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		
		try {
			//step 1: Register the mysql driver class
			Class.forName("com.mysql.jdbc.Driver");
			//Step 2: Create the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename","root","root");
			//step 3: Create statement
			Statement statement = con.createStatement();
			//Step 4: ExecuteQuery
			ResultSet rs = statement.executeQuery("select * from employeeTable");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				//Step 5: Close the connection
				con.close();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
