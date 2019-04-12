package com.healogics.iheal.bean;

import java.util.Map;

import com.healogics.iheal.utility.IHealResponse;

public class AuthenticateByTokenResponseBean extends IHealResponse {

	private String				masterToken;

	private User				user;

	private Map<String, Long>	plainTexts;

	public String getMasterToken() {
		return masterToken;
	}

	public void setMasterToken(String masterToken) {
		this.masterToken = masterToken;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<String, Long> getPlainTexts() {
		return plainTexts;
	}

	public void setPlainTexts(Map<String, Long> plainTexts) {
		this.plainTexts = plainTexts;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthenticateByTokenResponseBean [masterToken=");
		builder.append(masterToken);
		builder.append(", user=");
		builder.append(user);
		builder.append(", plainTexts=");
		builder.append(plainTexts);
		builder.append(", errorCode=");
		builder.append(errorCode);
		builder.append(", errorMessage=");
		builder.append(errorMessage);
		builder.append(", errors=");
		builder.append(errors);
		builder.append(", warnings=");
		builder.append(warnings);
		builder.append(", requestId=");
		builder.append(requestId);
		builder.append("]");
		return builder.toString();
	}

}
