package com.healogics.iheal.bean;

import java.util.Date;

public class UserProfileGetBean {

	private String	privateKey;

	private String	masterToken;

	private Long	userId;

	private Date	eventDateTime;

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getMasterToken() {
		return masterToken;
	}

	public void setMasterToken(String masterToken) {
		this.masterToken = masterToken;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getEventDateTime() {
		return eventDateTime;
	}

	public void setEventDateTime(Date eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

}
