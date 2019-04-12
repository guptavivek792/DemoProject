package com.healogics.iheal.bean;

import java.io.Serializable;

public class FileResponseBean implements Serializable {

	private static final long	serialVersionUID	= 1L;

	private String				imageStream;

	private String				imageMimeType;

	public String getImageStream() {
		return imageStream;
	}

	public void setImageStream(String imageStream) {
		this.imageStream = imageStream;
	}

	public String getImageMimeType() {
		return imageMimeType;
	}

	public void setImageMimeType(String imageMimeType) {
		this.imageMimeType = imageMimeType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileLoadResponseBean [imageStream=");
		builder.append(imageStream);
		builder.append(", imageMimeType=");
		builder.append(imageMimeType);
		builder.append("]");
		return builder.toString();
	}

}
