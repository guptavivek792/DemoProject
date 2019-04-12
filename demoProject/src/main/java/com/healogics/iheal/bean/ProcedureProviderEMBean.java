package com.healogics.iheal.bean;

public class ProcedureProviderEMBean {

	private String	code;

	private String	description;

	private String	codeSystem			= "CPT4";

	private String	procedureFacility	= "false";

	private String	procedureProvider	= "true";

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

	public String getProcedureFacility() {
		return procedureFacility;
	}

	public void setProcedureFacility(String procedureFacility) {
		this.procedureFacility = procedureFacility;
	}

	public String getProcedureProvider() {
		return procedureProvider;
	}

	public void setProcedureProvider(String procedureProvider) {
		this.procedureProvider = procedureProvider;
	}

}
