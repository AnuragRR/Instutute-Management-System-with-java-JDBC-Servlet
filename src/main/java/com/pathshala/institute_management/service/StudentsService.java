package com.pathshala.institute_management.service;

import com.pathshala.institute_management.dao.InstituteDao;
/**
 * 
 * @author anurag
 *
 */
import com.pathshala.institute_management.dto.Students;

public class StudentsService {
	InstituteDao instituteDao = new InstituteDao();

	/*
	 * insert student method
	 */
	public Students saveStudentsService(Students students) {
		return instituteDao.saveStudents(students);
	}
}
