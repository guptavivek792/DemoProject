package com.healogics.iheal.utility;

public class IHealRequest {

	private String	privateKey	= IHealRestClient.PRIVATE_KEY;

	private String	masterToken;

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getMasterToken() {
		return masterToken;
	}

	public void setMasterToken(String masterToken) {
		this.masterToken = masterToken;
	}

}
