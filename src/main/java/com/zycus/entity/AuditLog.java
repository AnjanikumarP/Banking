package com.zycus.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuditLog {
	
	@Id
	private long id;
	private Date date;
	private String message;
	private String account;
	private String loggedUser;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getLoggedUser() {
		return loggedUser;
	}
	public void setLoggedUser(String loggedUser) {
		this.loggedUser = loggedUser;
	}
	
	
	

}
