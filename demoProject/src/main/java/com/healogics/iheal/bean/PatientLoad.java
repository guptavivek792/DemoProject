package com.healogics.iheal.bean;

import java.io.Serializable;

import com.healogics.iheal.utility.IHealResponse;

public class PatientLoad extends IHealResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientLoad [patient=");
		builder.append(patient);
		builder.append(", errorCode=");
		builder.append(errorCode);
		builder.append(", errorMessage=");
		builder.append(errorMessage);
		builder.append(", errors=");
		builder.append(errors);
		builder.append(", warnings=");
		builder.append(warnings);
		builder.append(", requestId=");
		builder.append(requestId);
		builder.append("]");
		return builder.toString();
	}

}
