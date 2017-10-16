package com.shivohm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	
	private String name;
	private String emailid;
	private String confirmemailid;
	private String password;
	private String confirmpassword;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getConfirmemailid() {
		return confirmemailid;
	}
	public void setConfirmemailid(String confirmemailid) {
		this.confirmemailid = confirmemailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	

}