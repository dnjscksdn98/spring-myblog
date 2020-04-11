package com.spring.myblog.dto;

import java.sql.Timestamp;

public class UserDto {
	private String id;
	private String pw;
	private String name;
	private String email;
	private Timestamp rdate;
	private String isAdmin;
	
	public UserDto() {
		
	}

	public UserDto(String id, String pw, String name, String email, Timestamp rdate, String isAdmin) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.rdate = rdate;
		this.isAdmin = isAdmin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getRdate() {
		return rdate;
	}

	public void setRdate(Timestamp rdate) {
		this.rdate = rdate;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
