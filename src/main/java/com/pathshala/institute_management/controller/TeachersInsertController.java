package com.pathshala.institute_management.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pathshala.institute_management.dto.Teachers;
import com.pathshala.institute_management.service.TeachersService;

/**
 * 
 * @author anurag
 *
 */
@SuppressWarnings("serial")
@WebServlet("/tForm")
public class TeachersInsertController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		TeachersService teachersService = new TeachersService();

		PrintWriter printWriter = resp.getWriter();

		String tname = req.getParameter("tfName");
		String temail = req.getParameter("tfEmail");
		String tpass = req.getParameter("tfPass");

		Teachers teachers = new Teachers(tname, temail, tpass);
		Teachers teachers2 = teachersService.saveTeachersService(teachers);

		if (teachers2 != null) {
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
