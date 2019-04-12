package com.healogics.pretx.bean;

import java.io.Serializable;

public class TestResultResponseBean implements Serializable {

	private static final long	serialVersionUID	= 1L;

	private Long				documentEntityId;

	private Long				versionId;

	private String				documentType;

	private Long				facilityId;

	private Long				patientId;

	private String				visitDateTime;

	private String				addedDateTime;

	private Long				visitId;

	private String				groupName;

	private String				testDescription;

	private String				testType;

	private String				testDate;

	private String				completed;

	private String				fileId;

	private String				notes;

	private String				url;

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

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getTestDescription() {
		return testDescription;
	}

	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getTestDate() {
		return testDate;
	}

	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestResultResponseBean [documentEntityId=");
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
		builder.append(", groupName=");
		builder.append(groupName);
		builder.append(", testDescription=");
		builder.append(testDescription);
		builder.append(", testType=");
		builder.append(testType);
		builder.append(", testDate=");
		builder.append(testDate);
		builder.append(", completed=");
		builder.append(completed);
		builder.append(", fileId=");
		builder.append(fileId);
		builder.append(", notes=");
		builder.append(notes);
		builder.append(", url=");
		builder.append(url);
		builder.append("]");
		return builder.toString();
	}

}
