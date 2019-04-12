package com.healogics.iheal.bean;

import java.io.Serializable;

public class ICD10Codes implements Serializable{

	private static final long serialVersionUID = 1L;

	private String code;
	
	private String codeSystem;
	
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

	
	public String getCodeSystem() {
		return codeSystem;
	}

	
	public void setCodeSystem(String codeSystem) {
		this.codeSystem = codeSystem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ICD10Codes [code=");
		builder.append(code);
		builder.append(", codeSystem=");
		builder.append(codeSystem);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
}
