package com.healogics.iheal.bean;

import java.io.Serializable;

import com.healogics.iheal.utility.IHealRequest;

public class ProblemLoadInput extends IHealRequest implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long userId;
	
	private Long facilityId;
	
	private Long documentEntityId;
	
	private Long patientId;
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public Long getDocumentEntityId() {
		return documentEntityId;
	}
	
	public void setDocumentEntityId(Long documentEntityId) {
		this.documentEntityId = documentEntityId;
	}
	
	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProblemLoadInput [userId=");
		builder.append(userId);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", documentEntityId=");
		builder.append(documentEntityId);
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append("]");
		return builder.toString();
	}
}
