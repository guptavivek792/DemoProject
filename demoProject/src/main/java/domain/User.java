package com.healogics.pretx.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.databind.JsonNode;
import com.healogics.pretx.domain.datatype.JsonDataType;

@Entity
@DynamicInsert
@DynamicUpdate
@TypeDef(name = "jsontype", typeClass = JsonDataType.class)
@Table(schema = "public", name = "user")
public class User implements Serializable {

	private static final long	serialVersionUID	= 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long				id;

	private Long				healogicId;

	private String				firstName;

	private String				middleName;

	private String				lastName;

	private LocalDate			dob;

	private String				gender;

	private String				address1;

	private String				address2;

	private String				phone;

	private String				city;

	private String				state;

	private String				zip;

	private String				email;

	private Short				userType;

	private Long				createdBy;

	private Short				status;

	private LocalDateTime		createdOn;

	private Long				locationId;

	private Long				serviceLineId;
	
	private String	patientNumber;
	
	@Type(type = "jsontype")
	private JsonNode				role;

	public User() {
		super();
	}

	public User(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getHealogicId() {
		return healogicId;
	}

	public void setHealogicId(Long healogicId) {
		this.healogicId = healogicId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Short getUserType() {
		return userType;
	}

	public void setUserType(Short userType) {
		this.userType = userType;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
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
	
	public JsonNode getRole() {
		return role;
	}

	public void setRole(JsonNode role) {
		this.role = role;
	}
	
	public String getPatientNumber() {
		return patientNumber;
	}
	
	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

}
