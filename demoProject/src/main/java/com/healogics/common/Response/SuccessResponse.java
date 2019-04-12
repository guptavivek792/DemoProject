package com.healogics.common.Response;

public class SuccessResponse extends Response {

	public SuccessResponse() {

		this.setStatus("success");
		this.setMessage("Service executed successfully");
	}

	public SuccessResponse(String message) {

		this.setStatus("success");
		this.setMessage(message);
	}

	public SuccessResponse(Object data) {

		this.setStatus("success");
		this.setMessage("Service executed successfully");
		this.setData(data);
	}

	public SuccessResponse(String message, Object data) {

		this.setMessage(message);
		this.setData(data);
	}

}
