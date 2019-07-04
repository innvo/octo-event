package com.innvo.web.rest.vm;

import java.util.Date;

public class AuthenticationModel {
	
	private String subject;
	private String authorities;
	private Long validity;
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAuthorities() {
		return authorities;
	}
	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
	public Long getValidity() {
		return validity;
	}
	public void setValidity(Long validity) {
		this.validity = validity;
	}
	
	

}
