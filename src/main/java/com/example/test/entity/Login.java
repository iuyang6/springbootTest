package com.example.test.entity;

import java.util.Date;

public class Login {
	
	private int id;
	private String username;
	private String password;
	private byte role;
	private Date cTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte getRole() {
		return role;
	}
	public void setRole(byte role) {
		this.role = role;
	}
	public Date getcTime() {
		return cTime;
	}
	public void setcTime(Date cTime) {
		this.cTime = cTime;
	}
	


}
