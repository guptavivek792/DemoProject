package com.healogics.iheal.bean;

import java.util.List;

import com.healogics.iheal.utility.IHealResponse;

public class WoundListGetResponse extends IHealResponse {

	private List<WoundMeasurement> woundMeasurements;

	public List<WoundMeasurement> getWoundMeasurements() {
		return woundMeasurements;
	}

	public void setWoundMeasurements(List<WoundMeasurement> woundMeasurements) {
		this.woundMeasurements = woundMeasurements;
	}

}
