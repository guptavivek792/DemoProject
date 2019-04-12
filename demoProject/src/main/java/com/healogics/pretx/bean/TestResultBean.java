package com.healogics.pretx.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TestResultBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long			facilityId;

	private Long			patientId;

	private Long		documentEntityId;

	private LocalDateTime	eventDateTime;

	
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
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append(", documentEntityId=");
		builder.append(documentEntityId);
		builder.append(", eventDateTime=");
		builder.append(eventDateTime);
		builder.append("]");
		return builder.toString();
	}



}
