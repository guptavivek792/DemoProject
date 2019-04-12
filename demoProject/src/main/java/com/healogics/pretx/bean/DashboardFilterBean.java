package com.healogics.pretx.bean;

import java.time.LocalDate;
import java.util.List;

public class DashboardFilterBean {

	private Long	id;

	private String	column;

	private char	order;
	
	private int		offset;
	
	private List<Long> hspIds;
	
	private LocalDate fromDate;
	
	private LocalDate toDate;
	
	List<Short> status;
	
	private Long	facilityId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public char getOrder() {
		return order;
	}

	public void setOrder(char order) {
		this.order = order;
	}

	public int getOffset() {
		return offset;
	}
	
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	public List<Short> getStatus() {
		return status;
	}
	
	public void setStatus(List<Short> status) {
		this.status = status;
	}
	
	public List<Long> getHspIds() {
		return hspIds;
	}
	
	public void setHspIds(List<Long> hspIds) {
		this.hspIds = hspIds;
	}
	
	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	
	public LocalDate getToDate() {
		return toDate;
	}
	
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	
	public Long getFacilityId() {
		return facilityId;
	}
	
	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DashboardFilterBean [id=");
		builder.append(id);
		builder.append(", column=");
		builder.append(column);
		builder.append(", order=");
		builder.append(order);
		builder.append(", offset=");
		builder.append(offset);
		builder.append(", hspIds=");
		builder.append(hspIds);
		builder.append(", fromDate=");
		builder.append(fromDate);
		builder.append(", toDate=");
		builder.append(toDate);
		builder.append(", status=");
		builder.append(status);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append("]");
		return builder.toString();
	}
}
