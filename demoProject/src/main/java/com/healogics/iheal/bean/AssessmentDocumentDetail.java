package com.healogics.iheal.bean;

import java.util.Date;

public class AssessmentDocumentDetail {

	private Long	documentEntityId;

	private Long	versionId;

	private String	documentType;

	private Long	facilityId;

	private Long	patientId;

	private Long	visitId;

	private Date	visitDateTime;

	private Date	addedDateTime;

	private Long	providerId;

	private Long	provider2Id;

	private Long	clinicianId;

	private Long	clinician2Id;

	public Long getDocumentEntityId() {
		return documentEntityId;
	}

	public void setDocumentEntityId(Long documentEntityId) {
		this.documentEntityId = documentEntityId;
	}

	public Long getVersionId() {
		return versionId;
	}

	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
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

	public Date getVisitDateTime() {
		return visitDateTime;
	}

	public void setVisitDateTime(Date visitDateTime) {
		this.visitDateTime = visitDateTime;
	}

	public Date getAddedDateTime() {
		return addedDateTime;
	}

	public void setAddedDateTime(Date addedDateTime) {
		this.addedDateTime = addedDateTime;
	}

	public Long getProviderId() {
		return providerId;
	}

	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}

	public Long getProvider2Id() {
		return provider2Id;
	}

	public void setProvider2Id(Long provider2Id) {
		this.provider2Id = provider2Id;
	}

	public Long getClinicianId() {
		return clinicianId;
	}

	public void setClinicianId(Long clinicianId) {
		this.clinicianId = clinicianId;
	}

	public Long getClinician2Id() {
		return clinician2Id;
	}

	public void setClinician2Id(Long clinician2Id) {
		this.clinician2Id = clinician2Id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AssDocument [documentEntityId=");
		builder.append(documentEntityId);
		builder.append(", versionId=");
		builder.append(versionId);
		builder.append(", documentType=");
		builder.append(documentType);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append(", visitId=");
		builder.append(visitId);
		builder.append(", visitDateTime=");
		builder.append(visitDateTime);
		builder.append(", addedDateTime=");
		builder.append(addedDateTime);
		builder.append(", providerId=");
		builder.append(providerId);
		builder.append(", provider2Id=");
		builder.append(provider2Id);
		builder.append(", clinicianId=");
		builder.append(clinicianId);
		builder.append(", clinician2Id=");
		builder.append(clinician2Id);
		builder.append("]");
		return builder.toString();
	}

}
