package com.healogics.pretx.bean;

public class RequestCountBean {

	private long	total;
	
	private long	newCount;
	
	private long	approved;

	private long	declined;
	
	private long	pending;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
	
	public void addTotal(long count) {
		this.total = total + count;
	}

	public long getApproved() {
		return approved;
	}
	
	public void setApproved(long approved) {
		this.approved = approved;
	}
	
	public long getDeclined() {
		return declined;
	}
	
	public void setDeclined(long declined) {
		this.declined = declined;
	}

	public long getPending() {
		return pending;
	}
	
	public void setPending(long pending) {
		this.pending = pending;
	}

	
	public long getNewCount() {
		return newCount;
	}

	
	public void setNewCount(long newCount) {
		this.newCount = newCount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestCountBean [total=");
		builder.append(total);
		builder.append(", newCount=");
		builder.append(newCount);
		builder.append(", approved=");
		builder.append(approved);
		builder.append(", declined=");
		builder.append(declined);
		builder.append(", pending=");
		builder.append(pending);
		builder.append(", getTotal()=");
		builder.append(getTotal());
		builder.append(", getApproved()=");
		builder.append(getApproved());
		builder.append(", getDeclined()=");
		builder.append(getDeclined());
		builder.append(", getPending()=");
		builder.append(getPending());
		builder.append(", getNewCount()=");
		builder.append(getNewCount());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
