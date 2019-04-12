package com.healogics.pretx.bean;

import com.fasterxml.jackson.databind.JsonNode;

public class RequestBean {

	private Long				id;

	private Long				patientId;

	private Long				caseCategoryId;

	private Long				facilityId;

	private Long				hspId;

	private RequestDetailBean	detail;

	private Short				submitType;

	private Long				visitId;

	private String				evaluationText;

	private String				caseCategoryName;

	private JsonNode			patientDetail;

	private JsonNode			submitedBy;

	private JsonNode			facilityDetail;

	private String				overallReview;

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public Long getCaseCategoryId() {
		return caseCategoryId;
	}

	public void setCaseCategoryId(Long caseCategoryId) {
		this.caseCategoryId = caseCategoryId;
	}

	public Long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public Long getHspId() {
		return hspId;
	}

	public void setHspId(Long hspId) {
		this.hspId = hspId;
	}

	public RequestDetailBean getDetail() {
		return detail;
	}

	public void setDetail(RequestDetailBean detail) {
		this.detail = detail;
	}

	public Short getSubmitType() {
		return submitType;
	}

	public void setSubmitType(Short submitType) {
		this.submitType = submitType;
	}

	public Long getVisitId() {
		return visitId;
	}

	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}

	public String getEvaluationText() {
		return evaluationText;
	}

	public void setEvaluationText(String evaluationText) {
		this.evaluationText = evaluationText;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCaseCategoryName() {
		return caseCategoryName;
	}

	public void setCaseCategoryName(String caseCategoryName) {
		this.caseCategoryName = caseCategoryName;
	}

	public JsonNode getPatientDetail() {
		return patientDetail;
	}

	public void setPatientDetail(JsonNode patientDetail) {
		this.patientDetail = patientDetail;
	}

	public JsonNode getSubmitedBy() {
		return submitedBy;
	}

	public void setSubmitedBy(JsonNode submitedBy) {
		this.submitedBy = submitedBy;
	}

	public JsonNode getFacilityDetail() {
		return facilityDetail;
	}

	public void setFacilityDetail(JsonNode facilityDetail) {
		this.facilityDetail = facilityDetail;
	}

	public String getOverallReview() {
		return overallReview;
	}

	public void setOverallReview(String overallReview) {
		this.overallReview = overallReview;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestBean [id=");
		builder.append(id);
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append(", caseCategoryId=");
		builder.append(caseCategoryId);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", hspId=");
		builder.append(hspId);
		builder.append(", detail=");
		builder.append(detail);
		builder.append(", submitType=");
		builder.append(submitType);
		builder.append(", visitId=");
		builder.append(visitId);
		builder.append(", evaluationText=");
		builder.append(evaluationText);
		builder.append(", caseCategoryName=");
		builder.append(caseCategoryName);
		builder.append(", patientDetail=");
		builder.append(patientDetail);
		builder.append(", submitedBy=");
		builder.append(submitedBy);
		builder.append(", facilityDetail=");
		builder.append(facilityDetail);
		builder.append("]");
		return builder.toString();
	}

}
