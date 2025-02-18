package com.app.dto;

import java.util.Date;

public class UserResponse {
	
	private String gmsg;
	private Date timestamp;
	public String getGmsg() {
		return gmsg;
	}
	public void setGmsg(String gmsg) {
		this.gmsg = gmsg;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public UserResponse(String gmsg, Date timestamp) {
		super();
		this.gmsg = gmsg;
		this.timestamp = timestamp;
	}
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
