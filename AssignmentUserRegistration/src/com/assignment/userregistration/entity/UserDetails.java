package com.assignment.userregistration.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<UserDetail> userDetails = new ArrayList<UserDetail>();
	
	public UserDetails() {

	}

	public UserDetails(List<UserDetail> userDetails) {
		this.userDetails = userDetails;
	}
	
	public List<UserDetail> getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(List<UserDetail> userDetails) {
		this.userDetails = userDetails;
	}

}
