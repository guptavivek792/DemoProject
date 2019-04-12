package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealRequest;

public class WoundAssessmentListGetBean extends IHealRequest {

	private Long	userId;

	private String	eventDateTime;

	private Long	facilityId;

	private Long	patientId;

	private Long	woundDocumentEntityId;

	private Long	woundAssessmentDocumentEntityId;

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

	public Long getWoundDocumentEntityId() {
		return woundDocumentEntityId;
	}

	public void setWoundDocumentEntityId(Long woundDocumentEntityId) {
		this.woundDocumentEntityId = woundDocumentEntityId;
	}

	public Long getWoundAssessmentDocumentEntityId() {
		return woundAssessmentDocumentEntityId;
	}

	public void setWoundAssessmentDocumentEntityId(Long woundAssessmentDocumentEntityId) {
		this.woundAssessmentDocumentEntityId = woundAssessmentDocumentEntityId;
	}

}
