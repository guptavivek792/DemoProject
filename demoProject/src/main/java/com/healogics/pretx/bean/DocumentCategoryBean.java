package com.healogics.pretx.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DocumentCategoryBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long			facilityId;

	private LocalDateTime	eventDateTime;

	public Long getFacilityId() {
		return facilityId;
	}
	
	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public LocalDateTime getEventDateTime() {
		return eventDateTime;
	}

	public void setEventDateTime(LocalDateTime eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestResultBean [facilityId=");
		builder.append(facilityId);
		builder.append(", eventDateTime=");
		builder.append(eventDateTime);
		builder.append("]");
		return builder.toString();
	}
}
