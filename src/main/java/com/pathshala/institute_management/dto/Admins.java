package com.pathshala.institute_management.dto;

/**
 * 
 * @author anurag
 *
 */
public class Admins {
	private int id;
	private String email;
	private String password;

	public Admins() {
		super();
	}

	public Admins(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
