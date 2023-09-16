package com.pathshala.institute_management.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pathshala.institute_management.dao.AdminDao;
import com.pathshala.institute_management.dto.Admins;

/**
 * 
 * @author anurag
 *
 */
@WebServlet("/adminLogin")
@SuppressWarnings("serial")
public class AdminController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();

		AdminDao adminDao = new AdminDao();

		String adminMail = req.getParameter("aMail");

		String adminPassword = req.getParameter("aPass");

		Admins admins = adminDao.adminLogin(adminMail);

		if (admins != null) {
			if (admins.getPassword().equals(adminPassword)) {
				httpSession.setAttribute(adminMail, admins.getEmail());
//				httpSession.setMaxInactiveInterval(20000);

				if (httpSession.getAttribute(adminMail) != null) {
					RequestDispatcher dispatcher = req.getRequestDispatcher("AdminDashboard.jsp");
					dispatcher.forward(req, resp);
				} else {
					RequestDispatcher dispatcher = req.getRequestDispatcher("AdminLogIn.jsp");
					dispatcher.forward(req, resp);
				}
			} else {
				req.setAttribute("adminpasswordIncorrectMsg", "InvalidAdminPassword");
				RequestDispatcher dispatcher = req.getRequestDispatcher("AdminLogIn.jsp");
				dispatcher.forward(req, resp);
			}
		}else {
			req.setAttribute("adminnameIncorrectMsg", "InvalidAdminName");
			RequestDispatcher dispatcher = req.getRequestDispatcher("AdminLogIn.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
