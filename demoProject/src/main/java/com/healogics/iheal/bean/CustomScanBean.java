package com.healogics.iheal.bean;

import java.io.Serializable;

public class CustomScanBean implements Serializable {

	private static final long	serialVersionUID	= 1L;

	private Long				scanId;

	private String				title;

	private String				externalScanId;

	private String				scanExtension;

	private DocumentGroupBean	group;

	private DocumentBean		document;

	public Long getScanId() {
		return scanId;
	}

	public void setScanId(Long scanId) {
		this.scanId = scanId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public DocumentGroupBean getGroup() {
		return group;
	}

	public void setGroup(DocumentGroupBean group) {
		this.group = group;
	}

	public DocumentBean getDocument() {
		return document;
	}

	public void setDocument(DocumentBean document) {
		this.document = document;
	}

}
