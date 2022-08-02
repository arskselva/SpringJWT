package com.app.training.SpJWT.Model;

import java.io.Serializable;

public class JwtResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3415004284143165362L;
	
	private String jwtToken;
	
	public JwtResponse(String jwtToken) {
		super();
		this.jwtToken = jwtToken;
	}

	public String getjwtToken() {
		return jwtToken;
	}

	public void setjwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	
}
