package com.healogics.iheal.bean;

import java.util.Date;
import java.util.List;

import com.healogics.iheal.utility.IHealResponse;

public class User extends IHealResponse {

	private Long				userId;

	private String				userName;

	private String				firstName;

	private String				lastName;

	private String				middleName;

	private String				address1;

	private String				address2;

	private String				city;

	private String				state;

	private String				zip;

	private String				phone;

	private String				email;

	private List<String>		roles;

	private Boolean				termsAndConditions;

	private Boolean				passwordChange;

	private Date				lastLogonTime;

	private Number				employedByCode;

	private String				PositionDescription;

	private String				EmployedByDescription;

	private Long				PositionCode;

	private List<Facility>	facilities;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public Boolean getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(Boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public Boolean getPasswordChange() {
		return passwordChange;
	}

	public void setPasswordChange(Boolean passwordChange) {
		this.passwordChange = passwordChange;
	}

	public List<Facility> getFacilities() {
		return facilities;
	}

	public void setFacilities(List<Facility> facilities) {
		this.facilities = facilities;
	}

	public Date getLastLogonTime() {
		return lastLogonTime;
	}

	public void setLastLogonTime(Date lastLogonTime) {
		this.lastLogonTime = lastLogonTime;
	}

	public String getPositionDescription() {
		return PositionDescription;
	}

	public Number getEmployedByCode() {
		return employedByCode;
	}

	public void setEmployedByCode(Number employedByCode) {
		this.employedByCode = employedByCode;
	}

	public void setPositionDescription(String positionDescription) {
		PositionDescription = positionDescription;
	}

	public String getEmployedByDescription() {
		return EmployedByDescription;
	}

	public void setEmployedByDescription(String employedByDescription) {
		EmployedByDescription = employedByDescription;
	}

	public Long getPositionCode() {
		return PositionCode;
	}

	public void setPositionCode(Long positionCode) {
		PositionCode = positionCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", middleName=");
		builder.append(middleName);
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
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", email=");
		builder.append(email);
		builder.append(", roles=");
		builder.append(roles);
		builder.append(", termsAndConditions=");
		builder.append(termsAndConditions);
		builder.append(", passwordChange=");
		builder.append(passwordChange);
		builder.append(", lastLogonTime=");
		builder.append(lastLogonTime);
		builder.append(", employedByCode=");
		builder.append(employedByCode);
		builder.append(", PositionDescription=");
		builder.append(PositionDescription);
		builder.append(", EmployedByDescription=");
		builder.append(EmployedByDescription);
		builder.append(", PositionCode=");
		builder.append(PositionCode);
		builder.append(", facilities=");
		builder.append(facilities);
		builder.append("]");
		return builder.toString();
	}

}
