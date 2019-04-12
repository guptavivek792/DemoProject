package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealRestClient;

public class AuthenticateBean {

	private String	privateKey	= IHealRestClient.PRIVATE_KEY;

	private String	userName;

	private String	password;

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
