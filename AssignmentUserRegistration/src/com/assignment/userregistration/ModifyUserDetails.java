package com.assignment.userregistration;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.userregistration.dao.UserDetailDAO;

public class ModifyUserDetails extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");

		String userName = req.getParameter("txtName");
		String phoneNo = req.getParameter("txtPhoneNo");
		String email = req.getParameter("txtEmail");
		String address = req.getParameter("txtAddress");

		String id = req.getParameter("txtUserId");
		
		if (id == null || id.equals("")) {
			resp.getWriter().println("User Id not found.");
			resp.getWriter().close();
		}
		//delete the existing user
		UserDetailDAO.INSTANCE.remove(Long.parseLong(id));

		//add the modified user as new user
		UserDetailDAO.INSTANCE.add(userName, phoneNo, email, address);
	    resp.getWriter().println("User Details modified successfully.");
		resp.sendRedirect("/display.html");
	}
}
