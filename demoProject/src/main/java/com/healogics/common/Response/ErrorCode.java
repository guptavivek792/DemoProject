package com.healogics.common.Response;

public enum ErrorCode {

	// @formatter:off
	UNKNOWN_ERROR(0, "Unknown error"),
	CREDENTIALS_CANNOT_NULL(1, "Username or password can not be null"),
	INVALID_CREDENTIALS(2, "Invalid credentials"),
	DUPLICATE_USERNAME(3, "Duplicate userName"),
	NOT_PRETX_USER(4, "You are not a PreTx user"),
	PATIENT_ALREADY_REGISTERED(5, "This patient is already enrolled"),
	CREDENTIALS_CANNOT_NULL_PIN(6, "Username or pin can not be null"),
	NOT_FOUND(7, "Resource not found");
	// @formatter:on

	private final int		code;

	private final String	description;

	private ErrorCode(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("Error #").append(code).append(": ").append(description).toString();
	}

}
