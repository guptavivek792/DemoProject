package com.healogics.iheal.bean;

import java.io.Serializable;

public class DocumentGroupInputBean extends AuthenticateBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long facilityId;
	
	private String eventDateTime;
	
	private Long userId;
	
	private String masterToken;
	
	public Long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public String getEventDateTime() {
		return eventDateTime;
	}
	
	public void setEventDateTime(String eventDateTime) {
		this.eventDateTime = eventDateTime;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMasterToken() {
		return masterToken;
	}
	
	public void setMasterToken(String masterToken) {
		this.masterToken = masterToken;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DocumentCategoryInputBean [facilityId=");
		builder.append(facilityId);
		builder.append(", eventDateTime=");
		builder.append(eventDateTime);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", masterToken=");
		builder.append(masterToken);
		builder.append("]");
		return builder.toString();
	}
}
