package com.assignment.userregistration;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.userregistration.dao.UserDetailDAO;

@SuppressWarnings("serial")
public class AssignmentUserRegistrationServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");

		String userName = req.getParameter("txtName");
		String phoneNo = req.getParameter("txtPhoneNo");
		String email = req.getParameter("txtEmail");
		String address = req.getParameter("txtAddress");

		UserDetailDAO.INSTANCE.add(userName, phoneNo, email, address);
		resp.sendRedirect("/display.html");
	}
}
