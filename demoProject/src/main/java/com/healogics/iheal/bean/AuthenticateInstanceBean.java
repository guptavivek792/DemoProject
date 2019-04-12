package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealResponse;

public class AuthenticateInstanceBean extends IHealResponse {

	private String	instanceToken;

	private Long	userId;

	public String getInstanceToken() {
		return instanceToken;
	}

	public void setInstanceToken(String instanceToken) {
		this.instanceToken = instanceToken;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthenticateInstanceBean [instanceToken=");
		builder.append(instanceToken);
		builder.append(", userId=");
		builder.append(userId);
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
