package com.healogics.iheal.bean;

import java.io.Serializable;
import java.util.List;

public class PatientSearchResponseBean implements Serializable{

	private static final long serialVersionUID = 1L;


	private List<PatientSearchOutputBean> patients;
	
	private Integer recordCount;
	
	private Integer pageIndex;
	
	private Integer maxPageSize;

	public List<PatientSearchOutputBean> getPatients() {
		return patients;
	}
	
	public void setPatients(List<PatientSearchOutputBean> patients) {
		this.patients = patients;
	}

	
	public Integer getRecordCount() {
		return recordCount;
	}

	
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientSearchResponseBean [patients=");
		builder.append(patients);
		builder.append(", recordCount=");
		builder.append(recordCount);
		builder.append(", pageIndex=");
		builder.append(pageIndex);
		builder.append(", maxPageSize=");
		builder.append(maxPageSize);
		builder.append("]");
		return builder.toString();
	}

	
}
