package com.pathshala.institute_management.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author anurag
 *
 */
public class InstituteConnection {
	/*
	 * Connection Method
	 */
	public static Connection getInstituteConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/institute";
			String user = "root";
			String pass=  "root";
			return DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
