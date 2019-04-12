package com.healogics.iheal.bean;

public class Wound {

	private String		woundNumber;

	private Long		alternateWoundNumber;

	private Long		statusCode;

	private String		statusDescription;

	private Long		LocationCode;

	private String		locationDescription;

	private Long		primaryEtiologyCode;

	private String		primaryEtiologyDescription;

	private Long		secondaryEtiologyCode;

	private String		secondaryEtiologyDescriptions;

	private Document	document;

	private Long		documentEntityId;

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public String getWoundNumber() {
		return woundNumber;
	}

	public void setWoundNumber(String woundNumber) {
		this.woundNumber = woundNumber;
	}

	public Long getAlternateWoundNumber() {
		return alternateWoundNumber;
	}

	public void setAlternateWoundNumber(Long alternateWoundNumber) {
		this.alternateWoundNumber = alternateWoundNumber;
	}

	public Long getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public Long getLocationCode() {
		return LocationCode;
	}

	public void setLocationCode(Long locationCode) {
		LocationCode = locationCode;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public Long getPrimaryEtiologyCode() {
		return primaryEtiologyCode;
	}

	public void setPrimaryEtiologyCode(Long primaryEtiologyCode) {
		this.primaryEtiologyCode = primaryEtiologyCode;
	}

	public String getPrimaryEtiologyDescription() {
		return primaryEtiologyDescription;
	}

	public void setPrimaryEtiologyDescription(String primaryEtiologyDescription) {
		this.primaryEtiologyDescription = primaryEtiologyDescription;
	}

	public Long getSecondaryEtiologyCode() {
		return secondaryEtiologyCode;
	}

	public void setSecondaryEtiologyCode(Long secondaryEtiologyCode) {
		this.secondaryEtiologyCode = secondaryEtiologyCode;
	}

	public String getSecondaryEtiologyDescriptions() {
		return secondaryEtiologyDescriptions;
	}

	public void setSecondaryEtiologyDescriptions(String secondaryEtiologyDescriptions) {
		this.secondaryEtiologyDescriptions = secondaryEtiologyDescriptions;
	}

	public Long getDocumentEntityId() {
		return documentEntityId;
	}

	public void setDocumentEntityId(Long documentEntityId) {
		this.documentEntityId = documentEntityId;
	}

}
