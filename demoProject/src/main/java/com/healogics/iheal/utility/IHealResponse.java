package com.healogics.iheal.utility;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

public class IHealResponse {

	protected Long				errorCode;

	protected String			errorMessage;

	protected List<String>		errors;

	protected List<JsonNode>	warnings;

	protected String			requestId;

	public Long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public List<JsonNode> getWarnings() {
		return warnings;
	}

	public void setWarnings(List<JsonNode> warnings) {
		this.warnings = warnings;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IHealResponse [errorCode=");
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
