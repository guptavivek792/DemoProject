package com.healogics.iheal.bean;

import java.io.Serializable;
import java.util.Date;

public class Patient implements Serializable {

	private static final long	serialVersionUID	= 1L;

	private Long				patientId;

	private String				patientFirstName;

	private String				patientMiddleName;

	private String				patientLastName;

	private String				patientNumber;

	private Date				patientDOB;

	private String				patientSex;

	private String				address1;

	private String				address2;

	private String				city;

	private String				state;

	private String				zip;

	private String				email;

	private String				phone1;

	private Long				providerWoundCareId;

	private Long				locationId;

	private Long				serviceLineId;

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

	public String getPatientMiddleName() {
		return patientMiddleName;
	}

	public void setPatientMiddleName(String patientMiddleName) {
		this.patientMiddleName = patientMiddleName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public Date getPatientDOB() {
		return patientDOB;
	}

	public void setPatientDOB(Date patientDOB) {
		this.patientDOB = patientDOB;
	}

	public String getPatientSex() {
		return patientSex;
	}

	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getProviderWoundCareId() {
		return providerWoundCareId;
	}

	public void setProviderWoundCareId(Long providerWoundCareId) {
		this.providerWoundCareId = providerWoundCareId;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
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

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Patient [patientId=");
		builder.append(patientId);
		builder.append(", patientFirstName=");
		builder.append(patientFirstName);
		builder.append(", patientMiddleName=");
		builder.append(patientMiddleName);
		builder.append(", patientLastName=");
		builder.append(patientLastName);
		builder.append(", patientNumber=");
		builder.append(patientNumber);
		builder.append(", patientDOB=");
		builder.append(patientDOB);
		builder.append(", patientSex=");
		builder.append(patientSex);
		builder.append(", address1=");
		builder.append(address1);
		builder.append(", address2=");
		builder.append(address2);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", zip=");
		builder.append(zip);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phone1=");
		builder.append(phone1);
		builder.append(", providerWoundCareId=");
		builder.append(providerWoundCareId);
		builder.append(", locationId=");
		builder.append(locationId);
		builder.append(", serviceLineId=");
		builder.append(serviceLineId);
		builder.append("]");
		return builder.toString();
	}

}
