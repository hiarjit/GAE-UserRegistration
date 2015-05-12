package com.assignment.userregistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.userregistration.dao.UserDetailDAO;
import com.assignment.userregistration.entity.UserDetail;
import com.assignment.userregistration.entity.UserDetails;
import com.google.gson.Gson;

public class GetUserDetails extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
	    List<UserDetail> lstUsers = UserDetailDAO.INSTANCE.listUsers();
	    
	    UserDetails userDetails = new UserDetails(lstUsers);
	    Gson gson = new Gson();
	    String jsonString =	gson.toJson(userDetails);
	    
	    PrintWriter out = resp.getWriter();
	    out.write(jsonString);
	    out.flush();
	    out.close();
	} 

}
