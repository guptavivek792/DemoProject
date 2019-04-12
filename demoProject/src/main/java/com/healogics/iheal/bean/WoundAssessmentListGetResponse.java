package com.healogics.iheal.bean;

import java.util.List;

import com.healogics.iheal.utility.IHealResponse;

public class WoundAssessmentListGetResponse extends IHealResponse {

	private Wound			wound;

	private List<Document>	assessments;

	public Wound getWound() {
		return wound;
	}

	public void setWound(Wound wound) {
		this.wound = wound;
	}

	public List<Document> getAssessments() {
		return assessments;
	}

	public void setAssessments(List<Document> assessments) {
		this.assessments = assessments;
	}

}
