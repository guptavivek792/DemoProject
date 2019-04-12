package com.healogics.pretx.bean;

import java.io.Serializable;

public class FileUploadResponseBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private FileUploadOutputBean scan;

	
	public FileUploadOutputBean getScan() {
		return scan;
	}

	
	public void setScan(FileUploadOutputBean scan) {
		this.scan = scan;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileUploadResponseBean [scan=");
		builder.append(scan);
		builder.append("]");
		return builder.toString();
	}
	
	
}
