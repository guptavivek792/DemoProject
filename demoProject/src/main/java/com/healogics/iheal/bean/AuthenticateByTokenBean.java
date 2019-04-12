package com.healogics.iheal.bean;

import java.util.Map;

import com.healogics.iheal.utility.IHealRestClient;

public class AuthenticateByTokenBean {

	private String				privateKey	= IHealRestClient.PRIVATE_KEY;

	private String				authenticateToken;

	private String				userId;

	private Map<String, String>	cipherTexts;

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getAuthenticateToken() {
		return authenticateToken;
	}

	public void setAuthenticateToken(String authenticateToken) {
		this.authenticateToken = authenticateToken;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Map<String, String> getCipherTexts() {
		return cipherTexts;
	}

	public void setCipherTexts(Map<String, String> cipherTexts) {
		this.cipherTexts = cipherTexts;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthenticateByTokenBean [privateKey=");
		builder.append(privateKey);
		builder.append(", authenticateToken=");
		builder.append(authenticateToken);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", cipherTexts=");
		builder.append(cipherTexts);
		builder.append("]");
		return builder.toString();
	}

}
