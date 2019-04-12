package com.healogics.pretx.bean;

import java.io.Serializable;

public class CustomScanBean implements Serializable {

	private static final long	serialVersionUID	= 1L;

	private Long				scanId;

	private String				title;

	private String				externalScanId;

	private String				scanExtension;

	private String				groupName;

	private Long				documentEntityId;

	private Long				versionId;

	private String				documentType;

	private Long				facilityId;

	private Long				patientId;

	private String				visitDateTime;

	private String				addedDateTime;

	private Long				visitId;

	private String				url;

	public Long getScanId() {
		return scanId;
	}

	public void setScanId(Long scanId) {
		this.scanId = scanId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExternalScanId() {
		return externalScanId;
	}

	public void setExternalScanId(String externalScanId) {
		this.externalScanId = externalScanId;
	}

	public String getScanExtension() {
		return scanExtension;
	}

	public void setScanExtension(String scanExtension) {
		this.scanExtension = scanExtension;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomScanBean [scanId=");
		builder.append(scanId);
		builder.append(", title=");
		builder.append(title);
		builder.append(", externalScanId=");
		builder.append(externalScanId);
		builder.append(", scanExtension=");
		builder.append(scanExtension);
		builder.append(", groupName=");
		builder.append(groupName);
		builder.append(", documentEntityId=");
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
		builder.append(", url=");
		builder.append(url);
		builder.append("]");
		return builder.toString();
	}

}
