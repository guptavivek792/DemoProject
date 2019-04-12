package com.healogics.pretx.bean;

import java.util.Date;

public class AddRequestBean {

	private Long	userId;

	private Long	iHealUserId;

	private Date	eventDateTime;

	private Long	facilityId;

	private Long	patientId;

	private Long	visitId;

	private String	masterToken;

	private Short	userType;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getiHealUserId() {
		return iHealUserId;
	}

	public void setiHealUserId(Long iHealUserId) {
		this.iHealUserId = iHealUserId;
	}

	public Date getEventDateTime() {
		return eventDateTime;
	}

	public void setEventDateTime(Date eventDateTime) {
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

	public String getMasterToken() {
		return masterToken;
	}

	public void setMasterToken(String masterToken) {
		this.masterToken = masterToken;
	}

	public Short getUserType() {
		return userType;
	}

	public void setUserType(Short userType) {
		this.userType = userType;
	}

}
