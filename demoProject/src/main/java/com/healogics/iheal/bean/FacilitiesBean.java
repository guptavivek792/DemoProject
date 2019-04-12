package com.healogics.iheal.bean;

import java.util.List;

import com.healogics.iheal.utility.IHealResponse;

public class FacilitiesBean extends IHealResponse {

	private List<Facility> facilities;

	public List<Facility> getFacilities() {
		return facilities;
	}

	public void setFacilities(List<Facility> facilities) {
		this.facilities = facilities;
	}

}
