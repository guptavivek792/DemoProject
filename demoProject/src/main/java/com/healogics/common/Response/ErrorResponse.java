package com.healogics.common.Response;

public class ErrorResponse extends Response {

	private int errorCode;

	public ErrorResponse(String message) {
		this.setStatus("error");
		this.setMessage(message);
	}

	public ErrorResponse(ErrorCode errorCode) {
		this.setStatus("error");
		this.errorCode = errorCode.getCode();
		this.setMessage(errorCode.getDescription());
	}

	public ErrorResponse(ErrorCode errorCode, Object object) {
		this.setStatus("error");
		this.errorCode = errorCode.getCode();
		this.setMessage(errorCode.getDescription());
		this.setData(object);
	}

	public int getErrorCode() {
		return errorCode;
	}

}
