package com.pathshala.institute_management.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pathshala.institute_management.dto.Students;
import com.pathshala.institute_management.service.StudentsService;

/**
 * 
 * @author anurag
 *
 */
@SuppressWarnings("serial")
@WebServlet("/sForm")
public class StudentsInsertController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentsService studentsService = new StudentsService();

		PrintWriter printWriter = resp.getWriter();

		String sname = req.getParameter("sfName");
		String semail = req.getParameter("sfEmail");
		String spass = req.getParameter("sfPass");

		Students students = new Students(sname, semail, spass);

		Students students2 = studentsService.saveStudentsService(students);

		if (students2 != null) {
			printWriter.write("<html><body>");
			printWriter.write("<h3 style='color:green'>SUCCESS</h3>");
			printWriter.write("</body></html>");
		} else {
			printWriter.write("<html><body>");
			printWriter.write("<h3 style='color:red'>Please-Check-Your-Code</h3>");
			printWriter.write("</body></html>");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("AdminDashboard.jsp");
		dispatcher.include(req, resp);
	}
}
