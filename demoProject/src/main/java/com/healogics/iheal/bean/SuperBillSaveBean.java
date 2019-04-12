package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealRequest;

public class SuperBillSaveBean extends IHealRequest {

	private Long					userId;

	private String					eventDateTime;

	private Long					facilityId;

	private Long					patientId;

	private Long					visitId;

	private SuperBillDocumentBean	superbillDocument;

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

	public Long getVisitId() {
		return visitId;
	}

	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}

	public SuperBillDocumentBean getSuperbillDocument() {
		return superbillDocument;
	}

	public void setSuperbillDocument(SuperBillDocumentBean superbillDocument) {
		this.superbillDocument = superbillDocument;
	}

}
