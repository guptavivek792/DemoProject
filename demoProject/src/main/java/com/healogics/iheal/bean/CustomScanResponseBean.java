package com.healogics.iheal.bean;

import java.io.Serializable;
import java.util.List;

public class CustomScanResponseBean implements Serializable {

	private static final long		serialVersionUID	= 1L;

	private List<CustomScanBean>	scans;

	public List<CustomScanBean> getScans() {
		return scans;
	}

	public void setScans(List<CustomScanBean> scans) {
		this.scans = scans;
	}

}
