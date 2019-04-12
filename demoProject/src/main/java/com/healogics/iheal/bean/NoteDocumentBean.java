package com.healogics.iheal.bean;

import com.fasterxml.jackson.databind.JsonNode;

public class NoteDocumentBean {

	private String		assessmentIHealSection;

	private String		assessmentPhysicianSection;

	private String		diagnosisIHealSection;

	private String		objectiveIHealSection;

	private String		objectivePhysicianSection;

	private String		planIHealSection;

	private String		planPhysicianSection;

	private String		proceduresIHealSection;

	private String		proceduresPhysicianSection;

	private String		subjectiveIHealSection;

	private String		subjectivePhysicianSection;

	private JsonNode	document;

	private String		notes;

	public String getAssessmentIHealSection() {
		return assessmentIHealSection;
	}

	public void setAssessmentIHealSection(String assessmentIHealSection) {
		this.assessmentIHealSection = assessmentIHealSection;
	}

	public String getAssessmentPhysicianSection() {
		return assessmentPhysicianSection;
	}

	public void setAssessmentPhysicianSection(String assessmentPhysicianSection) {
		this.assessmentPhysicianSection = assessmentPhysicianSection;
	}

	public String getDiagnosisIHealSection() {
		return diagnosisIHealSection;
	}

	public void setDiagnosisIHealSection(String diagnosisIHealSection) {
		this.diagnosisIHealSection = diagnosisIHealSection;
	}

	public String getObjectiveIHealSection() {
		return objectiveIHealSection;
	}

	public void setObjectiveIHealSection(String objectiveIHealSection) {
		this.objectiveIHealSection = objectiveIHealSection;
	}

	public String getObjectivePhysicianSection() {
		return objectivePhysicianSection;
	}

	public void setObjectivePhysicianSection(String objectivePhysicianSection) {
		this.objectivePhysicianSection = objectivePhysicianSection;
	}

	public String getPlanIHealSection() {
		return planIHealSection;
	}

	public void setPlanIHealSection(String planIHealSection) {
		this.planIHealSection = planIHealSection;
	}

	public String getPlanPhysicianSection() {
		return planPhysicianSection;
	}

	public void setPlanPhysicianSection(String planPhysicianSection) {
		this.planPhysicianSection = planPhysicianSection;
	}

	public String getProceduresIHealSection() {
		return proceduresIHealSection;
	}

	public void setProceduresIHealSection(String proceduresIHealSection) {
		this.proceduresIHealSection = proceduresIHealSection;
	}

	public String getProceduresPhysicianSection() {
		return proceduresPhysicianSection;
	}

	public void setProceduresPhysicianSection(String proceduresPhysicianSection) {
		this.proceduresPhysicianSection = proceduresPhysicianSection;
	}

	public String getSubjectiveIHealSection() {
		return subjectiveIHealSection;
	}

	public void setSubjectiveIHealSection(String subjectiveIHealSection) {
		this.subjectiveIHealSection = subjectiveIHealSection;
	}

	public String getSubjectivePhysicianSection() {
		return subjectivePhysicianSection;
	}

	public void setSubjectivePhysicianSection(String subjectivePhysicianSection) {
		this.subjectivePhysicianSection = subjectivePhysicianSection;
	}

	public JsonNode getDocument() {
		return document;
	}

	public void setDocument(JsonNode document) {
		this.document = document;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
