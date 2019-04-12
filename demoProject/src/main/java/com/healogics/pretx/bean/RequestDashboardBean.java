package com.healogics.pretx.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RequestDashboardBean {

	private Long			id;

	private LocalDateTime	submitDate;

	private Long			hspId;

	private String			hspName;

	private Long			caseCategoryId;

	private String			caseCategory;

	private Long			patientId;

	private String			patientName;

	private String			patientGender;
	
	private String			patientNumber;
	
	private LocalDate	patientDob;

	private Long			facilityId;

	private String			facility;

	private String			blueBookCode;

	private Short			status;
	
	private LocalDateTime	statusDate;

	private Long			reviewerId;

	private String			reviewerName;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(LocalDateTime submitDate) {
		this.submitDate = submitDate;
	}

	public Long getHspId() {
		return hspId;
	}

	public void setHspId(Long hspId) {
		this.hspId = hspId;
	}

	public String getHspName() {
		return hspName;
	}

	public void setHspName(String hspName) {
		this.hspName = hspName;
	}

	public Long getCaseCategoryId() {
		return caseCategoryId;
	}

	public void setCaseCategoryId(Long caseCategoryId) {
		this.caseCategoryId = caseCategoryId;
	}

	public String getCaseCategory() {
		return caseCategory;
	}

	public void setCaseCategory(String caseCategory) {
		this.caseCategory = caseCategory;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public LocalDate getPatientDob() {
		return patientDob;
	}

	public void setPatientDob(LocalDate patientDob) {
		this.patientDob = patientDob;
	}

	public String getBlueBookCode() {
		return blueBookCode;
	}

	public void setBlueBookCode(String blueBookCode) {
		this.blueBookCode = blueBookCode;
	}
	
	public LocalDateTime getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(LocalDateTime statusDate) {
		this.statusDate = statusDate;
	}

	
	public String getPatientNumber() {
		return patientNumber;
	}
	
	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	
	public Long getReviewerId() {
		return reviewerId;
	}

	
	public void setReviewerId(Long reviewerId) {
		this.reviewerId = reviewerId;
	}

	
	public String getReviewerName() {
		return reviewerName;
	}

	
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestDashboardBean [id=");
		builder.append(id);
		builder.append(", submitDate=");
		builder.append(submitDate);
		builder.append(", hspId=");
		builder.append(hspId);
		builder.append(", hspName=");
		builder.append(hspName);
		builder.append(", caseCategoryId=");
		builder.append(caseCategoryId);
		builder.append(", caseCategory=");
		builder.append(caseCategory);
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append(", patientName=");
		builder.append(patientName);
		builder.append(", patientGender=");
		builder.append(patientGender);
		builder.append(", patientNumber=");
		builder.append(patientNumber);
		builder.append(", patientDob=");
		builder.append(patientDob);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", facility=");
		builder.append(facility);
		builder.append(", blueBookCode=");
		builder.append(blueBookCode);
		builder.append(", status=");
		builder.append(status);
		builder.append(", statusDate=");
		builder.append(statusDate);
		builder.append(", reviewerId=");
		builder.append(reviewerId);
		builder.append(", reviewerName=");
		builder.append(reviewerName);
		builder.append("]");
		return builder.toString();
	}
	
}
