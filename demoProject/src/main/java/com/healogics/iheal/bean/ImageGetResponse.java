package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealResponse;

public class ImageGetResponse extends IHealResponse {

	private String	imageStream;

	private String	imageMimeType;

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

}
