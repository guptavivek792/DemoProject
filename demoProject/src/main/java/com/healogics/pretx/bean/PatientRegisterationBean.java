package com.healogics.pretx.bean;

public class PatientRegisterationBean {

	private String	iHealAccessToken;

	private String	iHealUserId;

	private String	patientId;

	private String	facilityId;

	private String	visitId;

	private String	action;

	public String getiHealAccessToken() {
		return iHealAccessToken;
	}

	public void setiHealAccessToken(String iHealAccessToken) {
		this.iHealAccessToken = iHealAccessToken;
	}

	public String getiHealUserId() {
		return iHealUserId;
	}

	public void setiHealUserId(String iHealUserId) {
		this.iHealUserId = iHealUserId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getVisitId() {
		return visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientRegisterationBean [iHealAccessToken=");
		builder.append(iHealAccessToken);
		builder.append(", iHealUserId=");
		builder.append(iHealUserId);
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", visitId=");
		builder.append(visitId);
		builder.append(", action=");
		builder.append(action);
		builder.append("]");
		return builder.toString();
	}

}
