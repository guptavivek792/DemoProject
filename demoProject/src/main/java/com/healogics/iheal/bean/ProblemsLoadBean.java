package com.healogics.iheal.bean;

import java.io.Serializable;
import java.util.List;

public class ProblemsLoadBean  implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer status;
	
	private List<ICD10Codes> diagnosis;

	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public List<ICD10Codes> getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(List<ICD10Codes> diagnosis) {
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProblemsBean [status=");
		builder.append(status);
		builder.append(", diagnosis=");
		builder.append(diagnosis);
		builder.append("]");
		return builder.toString();
	}
}
