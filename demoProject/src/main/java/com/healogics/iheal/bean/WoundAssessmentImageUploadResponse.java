package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealResponse;

public class WoundAssessmentImageUploadResponse extends IHealResponse {

	private Long errorCode;

	public Long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

}
