package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealResponse;

public class SuperBillResponseBean extends IHealResponse {

	private SuperBillDocumentBean superbill;

	public SuperBillDocumentBean getSuperbill() {
		return superbill;
	}

	public void setSuperbill(SuperBillDocumentBean superbill) {
		this.superbill = superbill;
	}

}
