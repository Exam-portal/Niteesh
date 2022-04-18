package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotNull
	private String address;
	
	private String mail;
	
	private String Password;
	
	private String Login;
	
//	private String Login;
//	private String  Update;
//	private String  Create;
//	public String report;
	
	
public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	//	public String getLogin() {
//		return Login;
//	}
//	public void setLogin(String login) {
//		Login = login;
//	}
//	public String getUpdate() {
//		return Update;
//	}
//	public void setUpdate(String update) {
//		Update = update;
//	}
//	public String getCreate() {
//		return Create;
//	}
//	public void setCreate(String create) {
//		Create = create;
//	}
//	public String getReport() {
//		return report;
//	}
//	public void setReport(String report) {
//		this.report = report;
//	}
	public int getId() {
		return id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", address=" + address + ", mail=" + mail + ", Password="
				+ Password + ", Login=" + Login + "]";
	}
	
	
	

}
