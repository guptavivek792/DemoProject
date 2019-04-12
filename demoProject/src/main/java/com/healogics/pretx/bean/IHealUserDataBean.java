package com.healogics.pretx.bean;

public class IHealUserDataBean {

	private String	masterToken;

	private Long	iHealUserId;

	public String getMasterToken() {
		return masterToken;
	}

	public void setMasterToken(String masterToken) {
		this.masterToken = masterToken;
	}

	public Long getiHealUserId() {
		return iHealUserId;
	}

	public void setiHealUserId(Long iHealUserId) {
		this.iHealUserId = iHealUserId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IHealUserDataBean [masterToken=");
		builder.append(masterToken);
		builder.append(", iHealUserId=");
		builder.append(iHealUserId);
		builder.append("]");
		return builder.toString();
	}

}
