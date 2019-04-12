package com.healogics.iheal.bean;

import java.util.Date;

import com.healogics.iheal.utility.IHealRequest;

public class PatientLoadBean extends IHealRequest {

	private Long	userId;

	private Date	eventDateTime;

	private Long	facilityId;

	private Long	patientId;

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

	public Long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

}
