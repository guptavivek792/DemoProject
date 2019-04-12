package com.healogics.pretx.bean;

public class RejectRequestBean {

	private Long	requestId;

	private Integer	reasonType;	// 1- withdraw, 2 for decline

	private String	reason;

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public Integer getReasonType() {
		return reasonType;
	}

	public void setReasonType(Integer reasonType) {
		this.reasonType = reasonType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
