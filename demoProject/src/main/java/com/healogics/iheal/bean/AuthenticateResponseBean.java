package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealResponse;

public class AuthenticateResponseBean extends IHealResponse {

	private String	masterToken;

	private User	user;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthenticateResponseBean [masterToken=");
		builder.append(masterToken);
		builder.append(", user=");
		builder.append(user);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}

}
