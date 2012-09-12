package com.sanajon.domain;

public class User {

	private long id;
	private String name;
	private String password;
	private boolean disabled; 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public boolean getDisabled() {
		return disabled;
	}
	
	
}
