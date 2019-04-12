package com.healogics.iheal.bean;

import java.util.List;

public class Facility {

	private Long			facilityId;

	private String			facilityBluebookId;

	private String			facilityName;

	private String			configuration;

	private String			timeZone;

	private List<CodeValue>	locations;

	private List<CodeValue>	serviceLines;

	public Long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacilityBluebookId() {
		return facilityBluebookId;
	}

	public void setFacilityBluebookId(String facilityBluebookId) {
		this.facilityBluebookId = facilityBluebookId;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public List<CodeValue> getLocations() {
		return locations;
	}

	public void setLocations(List<CodeValue> locations) {
		this.locations = locations;
	}

	public List<CodeValue> getServiceLines() {
		return serviceLines;
	}

	public void setServiceLines(List<CodeValue> serviceLines) {
		this.serviceLines = serviceLines;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Facilities [facilityId=");
		builder.append(facilityId);
		builder.append(", facilityBluebookId=");
		builder.append(facilityBluebookId);
		builder.append(", facilityName=");
		builder.append(facilityName);
		builder.append(", configuration=");
		builder.append(configuration);
		builder.append(", timeZone=");
		builder.append(timeZone);
		builder.append(", locations=");
		builder.append(locations);
		builder.append(", serviceLines=");
		builder.append(serviceLines);
		builder.append("]");
		return builder.toString();
	}

}
