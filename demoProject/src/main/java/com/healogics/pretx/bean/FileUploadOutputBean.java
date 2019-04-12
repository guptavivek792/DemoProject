package com.healogics.pretx.bean;

import java.io.Serializable;

public class FileUploadOutputBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String scanId;
	
	private String externalScanId;
	
	private String scanExtension;

	
	public String getScanId() {
		return scanId;
	}

	
	public void setScanId(String scanId) {
		this.scanId = scanId;
	}

	
	public String getExternalScanId() {
		return externalScanId;
	}

	
	public void setExternalScanId(String externalScanId) {
		this.externalScanId = externalScanId;
	}

	
	public String getScanExtension() {
		return scanExtension;
	}

	
	public void setScanExtension(String scanExtension) {
		this.scanExtension = scanExtension;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileUploadResponseBean [scanId=");
		builder.append(scanId);
		builder.append(", externalScanId=");
		builder.append(externalScanId);
		builder.append(", scanExtension=");
		builder.append(scanExtension);
		builder.append("]");
		return builder.toString();
	}
	
	
}
