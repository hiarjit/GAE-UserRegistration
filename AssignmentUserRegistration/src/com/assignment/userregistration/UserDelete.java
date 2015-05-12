package com.assignment.userregistration;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.userregistration.dao.UserDetailDAO;

public class UserDelete extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String id = req.getParameter("userId");
	    UserDetailDAO.INSTANCE.remove(Long.parseLong(id));
	    resp.getWriter().println("User deleted successfully.");
	    resp.sendRedirect("/display.html");
	}
}
