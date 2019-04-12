package com.healogics.iheal.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {

	private Long documentEntityId;

	public Long getDocumentEntityId() {
		return documentEntityId;
	}

	public void setDocumentEntityId(Long documentEntityId) {
		this.documentEntityId = documentEntityId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Document [documentEntityId=");
		builder.append(documentEntityId);
		builder.append("]");
		return builder.toString();
	}

}
