package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealRequest;

public class VisitStartBean extends IHealRequest {

	private Long	userId;

	private String	eventDateTime;

	private Long	facilityId;

	private Long	patientId;

	private Long	visitTypeCode;

	private Long	locationId;

	private Long	serviceLineId;

	private Long	providerId;

	private Long	provider2Id;

	private Long	clinicianId;

	private Long	clinician2Id;

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

	public Long getVisitTypeCode() {
		return visitTypeCode;
	}

	public void setVisitTypeCode(Long visitTypeCode) {
		this.visitTypeCode = visitTypeCode;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Long getServiceLineId() {
		return serviceLineId;
	}

	public void setServiceLineId(Long serviceLineId) {
		this.serviceLineId = serviceLineId;
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

}
