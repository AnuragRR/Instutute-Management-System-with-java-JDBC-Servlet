package com.pathshala.institute_management.service;

/**
 * 
 * @author anurag
 *
 */

import com.pathshala.institute_management.dao.InstituteDao;
import com.pathshala.institute_management.dto.Teachers;

public class TeachersService {
	InstituteDao instituteDao = new InstituteDao();

	/*
	 * Insert teacher method
	 */
	public Teachers saveTeachersService(Teachers teachers) {
		return instituteDao.saveTeachers(teachers);
	}
}
