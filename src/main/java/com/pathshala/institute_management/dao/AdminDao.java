package com.pathshala.institute_management.dao;
/**
 * 
 * @author anurag
 *
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pathshala.institute_management.connection.InstituteConnection;
import com.pathshala.institute_management.dto.Admins;

public class AdminDao {
Connection connection = InstituteConnection.getInstituteConnection();
/*
 * Admin Login with id
 */
public Admins adminLogin(String amail) {
	String adminSelectQuery = "select * from admin where amail = ?";
	
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(adminSelectQuery);
		
		preparedStatement.setString(1, amail);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			Admins admins =  new Admins();
			
			admins.setId(resultSet.getInt("aid"));
			admins.setEmail(resultSet.getString("amail"));
			admins.setPassword(resultSet.getString("apass"));
			
			return admins;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return null;
}
}
