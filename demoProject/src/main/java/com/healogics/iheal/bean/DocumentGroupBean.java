package com.healogics.iheal.bean;

import java.io.Serializable;

public class DocumentGroupBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long groupId;
	
	private String name;
	
	private String description;
	
	private Boolean clinicalSummary;
	
	private Boolean dmeOrder;

	
	public Long getGroupId() {
		return groupId;
	}

	
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}

	
	public Boolean getClinicalSummary() {
		return clinicalSummary;
	}

	
	public void setClinicalSummary(Boolean clinicalSummary) {
		this.clinicalSummary = clinicalSummary;
	}

	
	public Boolean getDmeOrder() {
		return dmeOrder;
	}

	
	public void setDmeOrder(Boolean dmeOrder) {
		this.dmeOrder = dmeOrder;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DocumentCategoryOutputBean [groupId=");
		builder.append(groupId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", clinicalSummary=");
		builder.append(clinicalSummary);
		builder.append(", dmeOrder=");
		builder.append(dmeOrder);
		builder.append("]");
		return builder.toString();
	}
	
}
