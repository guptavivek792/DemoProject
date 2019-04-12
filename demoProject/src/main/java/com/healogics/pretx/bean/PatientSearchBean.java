package com.healogics.pretx.bean;

import java.io.Serializable;

import com.healogics.iheal.bean.AuthenticateBean;

public class PatientSearchBean extends AuthenticateBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long facilityId;
	
	private Integer pageIndex;
	
	private Integer maxPageSize;
	
	private String  matchPhrase;
	
	private Integer  matchField;
	
	
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

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientSearchInputBean [");
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
		builder.append("]");
		return builder.toString();
	}
	
}
