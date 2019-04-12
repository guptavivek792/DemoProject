package com.healogics.iheal.bean;

import java.io.Serializable;

public class PatientSearchInputBean extends AuthenticateBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long  userId;
	
	private Long facilityId;
	
	private Integer pageIndex;
	
	private Integer maxPageSize;
	
	private String  matchPhrase;
	
	private Integer  matchField;
	
	private String  masterToken;
	
	

	public Long getFacilityId() {
		return facilityId;
	}

	
	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	
	public Integer getPageIndex() {
		return pageIndex;
	}
	
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	
	public Integer getMaxPageSize() {
		return maxPageSize;
	}

	public void setMaxPageSize(Integer maxPageSize) {
		this.maxPageSize = maxPageSize;
	}

	public String getMatchPhrase() {
		return matchPhrase;
	}

	public void setMatchPhrase(String matchPhrase) {
		this.matchPhrase = matchPhrase;
	}

	public Integer getMatchField() {
		return matchField;
	}

	public void setMatchField(Integer matchField) {
		this.matchField = matchField;
	}

	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getMasterToken() {
		return masterToken;
	}
	
	public void setMasterToken(String masterToken) {
		this.masterToken = masterToken;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientSearchInputBean [userId=");
		builder.append(userId);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", pageIndex=");
		builder.append(pageIndex);
		builder.append(", maxPageSize=");
		builder.append(maxPageSize);
		builder.append(", matchPhrase=");
		builder.append(matchPhrase);
		builder.append(", matchField=");
		builder.append(matchField);
		builder.append(", masterToken=");
		builder.append(masterToken);
		builder.append("]");
		return builder.toString();
	}
	
}
