package com.app.training.SpJWT.Model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5926468583005150707L;

	private String userName;

	private String userPassword;

	// need default constructor for JSON Parsing
	public JwtRequest() {

	}

	public JwtRequest(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
