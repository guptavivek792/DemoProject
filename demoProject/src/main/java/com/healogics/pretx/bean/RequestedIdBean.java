package com.healogics.pretx.bean;

import java.util.List;

public class RequestedIdBean {

	private Long	id;

	private String	column;

	private char	order;
	
	private int		offset;
	
	List<Short> status;

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

}
