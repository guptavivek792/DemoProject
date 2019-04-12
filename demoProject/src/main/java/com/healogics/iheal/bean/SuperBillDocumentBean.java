package com.healogics.iheal.bean;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

public class SuperBillDocumentBean {

	private int						newPatientCode	= 0;				// constant for Established patient.

	private ProcedureProviderEMBean	procedureProviderEM;

	private List<JsonNode>			procedures		= new ArrayList<>();

	private List<JsonNode>			codeDiagnosis	= new ArrayList<>();

	public int getNewPatientCode() {
		return newPatientCode;
	}

	public void setNewPatientCode(int newPatientCode) {
		this.newPatientCode = newPatientCode;
	}

	public ProcedureProviderEMBean getProcedureProviderEM() {
		return procedureProviderEM;
	}

	public void setProcedureProviderEM(ProcedureProviderEMBean procedureProviderEM) {
		this.procedureProviderEM = procedureProviderEM;
	}

	public List<JsonNode> getProcedures() {
		return procedures;
	}

	public void setProcedures(List<JsonNode> procedures) {
		this.procedures = procedures;
	}

	public List<JsonNode> getCodeDiagnosis() {
		return codeDiagnosis;
	}

	public void setCodeDiagnosis(List<JsonNode> codeDiagnosis) {
		this.codeDiagnosis = codeDiagnosis;
	}

}
