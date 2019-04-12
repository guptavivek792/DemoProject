package com.healogics.iheal.bean;

import java.util.Date;

import com.healogics.iheal.utility.IHealRequest;

public class CalendarVisitListGetBean extends IHealRequest {

	private Long	userId;

	private Date	eventDateTime;

	private Long	facilityId;

	private Long	locationId;

	private Long	serviceLineId;

	private String	visitStartDate;

	private String	visitEndDate;

	private Long	visitStatus;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getEventDateTime() {
		return eventDateTime;
	}

	public void setEventDateTime(Date eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public Long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Long getServiceLineId() {
		return serviceLineId;
	}

	public void setServiceLineId(Long serviceLineId) {
		this.serviceLineId = serviceLineId;
	}

	public Long getVisitStatus() {
		return visitStatus;
	}

	public void setVisitStatus(Long visitStatus) {
		this.visitStatus = visitStatus;
	}

	public String getVisitStartDate() {
		return visitStartDate;
	}

	public void setVisitStartDate(String visitStartDate) {
		this.visitStartDate = visitStartDate;
	}

	public String getVisitEndDate() {
		return visitEndDate;
	}

	public void setVisitEndDate(String visitEndDate) {
		this.visitEndDate = visitEndDate;
	}

}
