package com.healogics.pretx.bean;

import java.io.Serializable;

import com.healogics.iheal.bean.AuthenticateBean;

public class ICD10CodesInput extends AuthenticateBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long userId;
	
	private Long facilityId;
	
	private Long patientId;

	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ICD10CodesInput [userId=");
		builder.append(userId);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append("]");
		return builder.toString();
	}

}
