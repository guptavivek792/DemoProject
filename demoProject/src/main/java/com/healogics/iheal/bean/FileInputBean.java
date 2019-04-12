package com.healogics.iheal.bean;

import java.io.Serializable;

import com.healogics.iheal.utility.IHealRequest;

public class FileInputBean extends IHealRequest implements Serializable{


	private static final long serialVersionUID = 1L;

	private Long userId;
	
	private String eventDateTime;
	
	private Long facilityId;
	
	private Long patientId;
		
	private Long documentEntityId;
	
	private String type;
	
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getEventDateTime() {
		return eventDateTime;
	}
	
	public void setEventDateTime(String eventDateTime) {
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
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileGetInputBean [userId=");
		builder.append(userId);
		builder.append(", eventDateTime=");
		builder.append(eventDateTime);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append(", documentEntityId=");
		builder.append(documentEntityId);
		builder.append(", type=");
		builder.append(type);		
		builder.append("]");
		return builder.toString();
	}
	
}
