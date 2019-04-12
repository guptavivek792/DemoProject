package com.healogics.iheal.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.healogics.iheal.utility.IHealRequest;

public class TestResultInputBean extends IHealRequest implements Serializable {

	private static final long	serialVersionUID	= 1L;

	private Long				userId;

	private LocalDateTime		eventDateTime;

	private Long				facilityId;

	private Long				patientId;

	private Long				documentEntityId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public LocalDateTime getEventDateTime() {
		return eventDateTime;
	}

	public void setEventDateTime(LocalDateTime eventDateTime) {
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

	public Long getDocumentEntityId() {
		return documentEntityId;
	}

	public void setDocumentEntityId(Long documentEntityId) {
		this.documentEntityId = documentEntityId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestResultInputBean [userId=");
		builder.append(userId);
		builder.append(", eventDateTime=");
		builder.append(eventDateTime);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append(", documentEntityId=");
		builder.append(documentEntityId);
		builder.append(", getPrivateKey()=");
		builder.append(getPrivateKey());
		builder.append(", getMasterToken()=");
		builder.append(getMasterToken());
		builder.append("]");
		return builder.toString();
	}

}
