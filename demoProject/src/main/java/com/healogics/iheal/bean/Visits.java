package com.healogics.iheal.bean;

import java.util.Date;

import com.fasterxml.jackson.databind.JsonNode;

public class Visits {

	private Long		visitId;

	private Date		visitDateTime;

	private Long		visitTypeCode;

	private String		visitTypeDescription;

	private Long		visitStatus;

	private Long		locationId;

	private String		locationDescription;

	private Long		serviceLineId;

	private String		serviceLineDescription;

	private Long		providerId;

	private String		providerFirstName;

	private String		providerLastName;

	private Long		provider2Id;

	private String		provider2FirstName;

	private String		provider2LastName;

	private Long		clinicianId;

	private String		clinicianFirstName;

	private String		clinicianLastName;

	private Long		clinician2Id;

	private String		clinician2FirstName;

	private String		clinician2LastName;
	// patientmini object

	private JsonNode	patient;

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

	public Long getVisitTypeCode() {
		return visitTypeCode;
	}

	public void setVisitTypeCode(Long visitTypeCode) {
		this.visitTypeCode = visitTypeCode;
	}

	public String getVisitTypeDescription() {
		return visitTypeDescription;
	}

	public void setVisitTypeDescription(String visitTypeDescription) {
		this.visitTypeDescription = visitTypeDescription;
	}

	public Long getVisitStatus() {
		return visitStatus;
	}

	public void setVisitStatus(Long visitStatus) {
		this.visitStatus = visitStatus;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public Long getServiceLineId() {
		return serviceLineId;
	}

	public void setServiceLineId(Long serviceLineId) {
		this.serviceLineId = serviceLineId;
	}

	public String getServiceLineDescription() {
		return serviceLineDescription;
	}

	public void setServiceLineDescription(String serviceLineDescription) {
		this.serviceLineDescription = serviceLineDescription;
	}

	public Long getProviderId() {
		return providerId;
	}

	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}

	public String getProviderFirstName() {
		return providerFirstName;
	}

	public void setProviderFirstName(String providerFirstName) {
		this.providerFirstName = providerFirstName;
	}

	public String getProviderLastName() {
		return providerLastName;
	}

	public void setProviderLastName(String providerLastName) {
		this.providerLastName = providerLastName;
	}

	public Long getProvider2Id() {
		return provider2Id;
	}

	public void setProvider2Id(Long provider2Id) {
		this.provider2Id = provider2Id;
	}

	public String getProvider2FirstName() {
		return provider2FirstName;
	}

	public void setProvider2FirstName(String provider2FirstName) {
		this.provider2FirstName = provider2FirstName;
	}

	public String getProvider2LastName() {
		return provider2LastName;
	}

	public void setProvider2LastName(String provider2LastName) {
		this.provider2LastName = provider2LastName;
	}

	public Long getClinicianId() {
		return clinicianId;
	}

	public void setClinicianId(Long clinicianId) {
		this.clinicianId = clinicianId;
	}

	public String getClinicianFirstName() {
		return clinicianFirstName;
	}

	public void setClinicianFirstName(String clinicianFirstName) {
		this.clinicianFirstName = clinicianFirstName;
	}

	public String getClinicianLastName() {
		return clinicianLastName;
	}

	public void setClinicianLastName(String clinicianLastName) {
		this.clinicianLastName = clinicianLastName;
	}

	public Long getClinician2Id() {
		return clinician2Id;
	}

	public void setClinician2Id(Long clinician2Id) {
		this.clinician2Id = clinician2Id;
	}

	public String getClinician2FirstName() {
		return clinician2FirstName;
	}

	public void setClinician2FirstName(String clinician2FirstName) {
		this.clinician2FirstName = clinician2FirstName;
	}

	public String getClinician2LastName() {
		return clinician2LastName;
	}

	public void setClinician2LastName(String clinician2LastName) {
		this.clinician2LastName = clinician2LastName;
	}

	public JsonNode getPatient() {
		return patient;
	}

	public void setPatient(JsonNode patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Visits [visitId=");
		builder.append(visitId);
		builder.append(", visitDateTime=");
		builder.append(visitDateTime);
		builder.append(", visitTypeCode=");
		builder.append(visitTypeCode);
		builder.append(", visitTypeDescription=");
		builder.append(visitTypeDescription);
		builder.append(", visitStatus=");
		builder.append(visitStatus);
		builder.append(", locationId=");
		builder.append(locationId);
		builder.append(", locationDescription=");
		builder.append(locationDescription);
		builder.append(", serviceLineId=");
		builder.append(serviceLineId);
		builder.append(", serviceLineDescription=");
		builder.append(serviceLineDescription);
		builder.append(", providerId=");
		builder.append(providerId);
		builder.append(", providerFirstName=");
		builder.append(providerFirstName);
		builder.append(", providerLastName=");
		builder.append(providerLastName);
		builder.append(", provider2Id=");
		builder.append(provider2Id);
		builder.append(", provider2FirstName=");
		builder.append(provider2FirstName);
		builder.append(", provider2LastName=");
		builder.append(provider2LastName);
		builder.append(", clinicianId=");
		builder.append(clinicianId);
		builder.append(", clinicianFirstName=");
		builder.append(clinicianFirstName);
		builder.append(", clinicianLastName=");
		builder.append(clinicianLastName);
		builder.append(", clinician2Id=");
		builder.append(clinician2Id);
		builder.append(", clinician2FirstName=");
		builder.append(clinician2FirstName);
		builder.append(", clinician2LastName=");
		builder.append(clinician2LastName);
		builder.append(", patient=");
		builder.append(patient);
		builder.append("]");
		return builder.toString();
	}

}
