package com.healogics.iheal.bean;

import java.io.Serializable;

public class PatientSearchOutputBean implements Serializable {

	private static final long	serialVersionUID	= 1L;

	private Long				patientId;

	private String				patientFirstName;

	private String				patientLastName;

	private String				patientNumber;

	private String				patientDOB;

	private String				patientSex;

	private Integer				weekInTreatment;

	private String				addmissionDate;

	private String				preRegistrationDate;

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public String getPatientDOB() {
		return patientDOB;
	}

	public void setPatientDOB(String patientDOB) {
		this.patientDOB = patientDOB;
	}

	public String getPatientSex() {
		return patientSex;
	}

	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public Integer getWeekInTreatment() {
		return weekInTreatment;
	}

	public void setWeekInTreatment(Integer weekInTreatment) {
		this.weekInTreatment = weekInTreatment;
	}

	public String getAddmissionDate() {
		return addmissionDate;
	}

	public void setAddmissionDate(String addmissionDate) {
		this.addmissionDate = addmissionDate;
	}

	public String getPreRegistrationDate() {
		return preRegistrationDate;
	}

	public void setPreRegistrationDate(String preRegistrationDate) {
		this.preRegistrationDate = preRegistrationDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientSearchOutputBean [patientId=").append(patientId).append(", patientFirstName=")
				.append(patientFirstName).append(", patientLastName=").append(patientLastName)
				.append(", patientNumber=").append(patientNumber).append(", patientDOB=").append(patientDOB)
				.append(", patientSex=").append(patientSex).append(", weekInTreatment=").append(weekInTreatment)
				.append(", addmissionDate=").append(addmissionDate).append(", preRegistrationDate=")
				.append(preRegistrationDate).append(", getPatientId()=").append(getPatientId())
				.append(", getPatientFirstName()=").append(getPatientFirstName()).append(", getPatientLastName()=")
				.append(getPatientLastName()).append(", getPatientNumber()=").append(getPatientNumber())
				.append(", getPatientDOB()=").append(getPatientDOB()).append(", getPatientSex()=")
				.append(getPatientSex()).append(", getWeekInTreatment()=").append(getWeekInTreatment())
				.append(", getAddmissionDate()=").append(getAddmissionDate()).append(", getPreRegistrationDate()=")
				.append(getPreRegistrationDate()).append(", getClass()=").append(getClass()).append(", hashCode()=")
				.append(hashCode()).append(", toString()=").append(super.toString()).append("]");
		return builder.toString();
	}

}
