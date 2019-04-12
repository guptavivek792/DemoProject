package com.healogics.iheal.bean;

import java.util.Date;

import com.healogics.iheal.utility.IHealRequest;

public class UserFacilityListGetBean extends IHealRequest {

	private Long	userId;

	private Date	eventDateTime;

	private String	externalSystems;

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

	public String getExternalSystems() {
		return externalSystems;
	}

	public void setExternalSystems(String externalSystems) {
		this.externalSystems = externalSystems;
	}

}
