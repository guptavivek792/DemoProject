package com.healogics.iheal.bean;

import java.io.Serializable;

public class TestResultListBean implements Serializable {

	private static final long		serialVersionUID	= 1L;

	private String					groupName;

	private String					testDescription;

	private String					testType;

	private String					testDate;

	private String					completed;

	private String					fileId;

	private String					notes;

	private DocumentBean	document;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getTestDescription() {
		return testDescription;
	}

	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getTestDate() {
		return testDate;
	}

	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public DocumentBean getDocument() {
		return document;
	}

	public void setDocument(DocumentBean document) {
		this.document = document;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestResultBean [groupName=");
		builder.append(groupName);
		builder.append(", testDescription=");
		builder.append(testDescription);
		builder.append(", testType=");
		builder.append(testType);
		builder.append(", testDate=");
		builder.append(testDate);
		builder.append(", completed=");
		builder.append(completed);
		builder.append(", fileId=");
		builder.append(fileId);
		builder.append(", notes=");
		builder.append(notes);
		builder.append("]");
		return builder.toString();
	}

}
