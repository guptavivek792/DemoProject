package com.healogics.pretx.bean;

import java.util.List;

import com.healogics.pretx.enumeration.ReviewStatus;

public class ReportBean {

	private String				note;

	private String				comment;

	private List<DocumentBean>	documents;

	private int					reviewStatus	= ReviewStatus.NONE.value();

	private boolean				isResubmited	= Boolean.FALSE;

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<DocumentBean> getDocuments() {
		return documents;
	}

	public void setDocuments(List<DocumentBean> documents) {
		this.documents = documents;
	}

	public int getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(int reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public boolean isResubmited() {
		return isResubmited;
	}

	public void setResubmited(boolean isResubmited) {
		this.isResubmited = isResubmited;
	}

}
