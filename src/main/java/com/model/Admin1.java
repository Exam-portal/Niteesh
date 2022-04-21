package com.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Table(name="Admin")
@Entity
public class Admin1 {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name="name")
	private String name;
	private String address;
    private String mail;
    private String login;
	private String password;
	
	private String update;
	
	 private String create;
	 
	 private String report;
	 
	public int getId() {
		return id;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getUpdate() {
		return update;
	}
	public void setUpdate(String update) {
		this.update = update;
	}
	public String getCreate() {
		return create;
	}
	public void setCreate(String create) {
		this.create = create;
	}
	public String getReport() {
		return report;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setReport(String report) {
		this.report = report;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", address=" + address + ", mail=" + mail + ", login=" + login
				+ ", password=" + password + ", update=" + update + ", create=" + create + ", report=" + report + "]";
	}
	
	 
	

}
