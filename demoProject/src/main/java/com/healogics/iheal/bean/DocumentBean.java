package com.healogics.iheal.bean;

import java.io.Serializable;

public class DocumentBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long	documentEntityId;

	private Long	versionId;

	private String	documentType;

	private Long	facilityId;
	
	private Long	patientId;

	private String	visitDateTime;
	
	private String	addedDateTime;
	
	private Long visitId;

	
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

	
	public String getVisitDateTime() {
		return visitDateTime;
	}

	
	public void setVisitDateTime(String visitDateTime) {
		this.visitDateTime = visitDateTime;
	}

	
	public String getAddedDateTime() {
		return addedDateTime;
	}

	
	public void setAddedDateTime(String addedDateTime) {
		this.addedDateTime = addedDateTime;
	}


	
	public Long getVisitId() {
		return visitId;
	}


	
	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestResultListOutputBean [documentEntityId=");
		builder.append(documentEntityId);
		builder.append(", versionId=");
		builder.append(versionId);
		builder.append(", documentType=");
		builder.append(documentType);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append(", visitDateTime=");
		builder.append(visitDateTime);
		builder.append(", addedDateTime=");
		builder.append(addedDateTime);
		builder.append(", visitId=");
		builder.append(visitId);
		builder.append("]");
		return builder.toString();
	}

}
