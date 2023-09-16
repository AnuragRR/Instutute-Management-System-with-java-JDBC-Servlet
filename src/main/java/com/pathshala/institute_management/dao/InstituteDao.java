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
import java.util.ArrayList;
import java.util.List;

import com.pathshala.institute_management.connection.InstituteConnection;
import com.pathshala.institute_management.dto.Students;
import com.pathshala.institute_management.dto.Teachers;

public class InstituteDao {
	Connection connection = InstituteConnection.getInstituteConnection();

	/*
	 * Method for insert student details
	 */
	public Students saveStudents(Students students) {
		String insertStudentQuery = "insert into student (sname,smail,spass) values (?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertStudentQuery);

			preparedStatement.setString(1, students.getSname());
			preparedStatement.setString(2, students.getSemail());
			preparedStatement.setString(3, students.getSpass());

			preparedStatement.execute();

			return students;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * Method for Display All Students
	 */
	public List<Students> getAllStudents(){
		String displayStudentsQuery= "select * from student";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayStudentsQuery);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			List<Students> students = new ArrayList<Students>();
			
			while (resultSet.next()) {
				Students students2 = new Students(resultSet.getInt("sid"), resultSet.getString("sname"), resultSet.getString("smail"), resultSet.getString("spass"));
				students.add(students2);
			}
			return students;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/*
	 * Method for Display All Teachers
	 */
	public List<Teachers> getAllTeachers(){
		String displayTeachersQuery= "select * from teacher";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayTeachersQuery);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			List<Teachers> teachers = new ArrayList<Teachers>();
			
			while (resultSet.next()) {
				Teachers teachers2 = new Teachers(resultSet.getInt("tid"), resultSet.getString("tname"), resultSet.getString("tmail"), resultSet.getString("tpass"));
				teachers.add(teachers2);
			}
			return teachers;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	/*
	 * method for save teachers details
	 */
	public Teachers saveTeachers(Teachers teachers) {
		String insertTeacherQuery = "insert into teacher (tname,tmail,tpass) values (?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertTeacherQuery);

			preparedStatement.setString(1, teachers.getTname());
			preparedStatement.setString(2, teachers.getTemail());
			preparedStatement.setString(3, teachers.getTpass());

			preparedStatement.execute();

			return teachers;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * Method of teacher login bY id
	 */
	public Teachers teacherLogin(String tmail) {
		String teacherSelectQuery= "select * from teacher where tmail = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(teacherSelectQuery);
			
			preparedStatement.setString(1, tmail);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				Teachers teachers = new Teachers();
				
				teachers.setTid(resultSet.getInt("tid"));
				teachers.setTemail(resultSet.getString("tmail"));
				teachers.setTpass(resultSet.getString("tpass"));
				
				return teachers;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/*
	 * Method of student login bY id
	 */
	public Students studentLogin(String smail) {
		String studentSelectQuery= "select * from student where smail = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(studentSelectQuery);
			
			preparedStatement.setString(1, smail);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				Students students = new Students();
				
				students.setSid(resultSet.getInt("sid"));
				students.setSemail(resultSet.getString("smail"));
				students.setSemail(resultSet.getString("spass"));
				
				return students;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
