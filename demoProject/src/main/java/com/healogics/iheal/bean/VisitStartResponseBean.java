package com.healogics.iheal.bean;

import java.util.List;

import com.healogics.iheal.utility.IHealResponse;

public class VisitStartResponseBean extends IHealResponse {

	private Visits visit;

	public Visits getVisit() {
		return visit;
	}

	public void setVisit(Visits visit) {
		this.visit = visit;
	}

	List<Visits> visits;

	public List<Visits> getVisits() {
		return visits;
	}

	public void setVisits(List<Visits> visits) {
		this.visits = visits;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VisitStartResponseBean [visit=");
		builder.append(visit);
		builder.append(", errorCode=");
		builder.append(errorCode);
		builder.append(", errorMessage=");
		builder.append(errorMessage);
		builder.append(", errors=");
		builder.append(errors);
		builder.append(", warnings=");
		builder.append(warnings);
		builder.append(", requestId=");
		builder.append(requestId);
		builder.append(", getVisit()=");
		builder.append(getVisit());
		builder.append(", getErrorCode()=");
		builder.append(getErrorCode());
		builder.append(", getErrorMessage()=");
		builder.append(getErrorMessage());
		builder.append(", getErrors()=");
		builder.append(getErrors());
		builder.append(", getWarnings()=");
		builder.append(getWarnings());
		builder.append(", getRequestId()=");
		builder.append(getRequestId());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}

}
