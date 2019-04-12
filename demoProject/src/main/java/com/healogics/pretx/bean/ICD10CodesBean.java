package com.healogics.pretx.bean;

import java.io.Serializable;

public class ICD10CodesBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String code;
	
	private String description;

	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ICDCodes [code=");
		builder.append(code);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
		
}
