package com.healogics.iheal.bean;

public class AssessmentDocument {

	private String		evaluationText;

	private AssessmentDocumentDetail	document;

	public String getEvaluationText() {
		return evaluationText;
	}

	public void setEvaluationText(String evaluationText) {
		this.evaluationText = evaluationText;
	}

	public AssessmentDocumentDetail getDocument() {
		return document;
	}

	public void setDocument(AssessmentDocumentDetail document) {
		this.document = document;
	}

}
