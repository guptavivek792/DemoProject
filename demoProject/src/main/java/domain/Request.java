package com.healogics.pretx.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(schema = "public", name = "request")
public class Request implements Serializable {

	private static final long	serialVersionUID	= 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long				id;

	@ManyToOne
	@JoinColumn(name = "hspId")
	private User				hsp;

	private LocalDateTime		createdOn;

	private Long				createdBy;

	private Short				status;						// use enum RequestStatus

	private LocalDateTime		statusDate;

	@ManyToOne
	@JoinColumn(name = "patientid")
	private User				user;

	@ManyToOne
	@JoinColumn(name = "facilityid")
	private Facility			facility;

	private LocalDateTime		submitedDate;

	@ManyToOne
	@JoinColumn(name = "categoryid")

	private CaseCategory		caseCategory;

	private Long				visitId;

	private Boolean				isDeleted			= false;

	private String				overallReview;
	
	@ManyToOne
	@JoinColumn(name = "reviewedby")
	private User				reviewedBy;

	public Request(Long id) {
		super();
		this.id = id;
	}

	public Request() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public CaseCategory getCaseCategory() {
		return caseCategory;
	}

	public void setCaseCategory(CaseCategory caseCategory) {
		this.caseCategory = caseCategory;
	}

	public Long getVisitId() {
		return visitId;
	}

	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}

	public User getHsp() {
		return hsp;
	}

	public void setHsp(User hsp) {
		this.hsp = hsp;
	}

	public LocalDateTime getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(LocalDateTime statusDate) {
		this.statusDate = statusDate;
	}

	public LocalDateTime getSubmitedDate() {
		return submitedDate;
	}

	public void setSubmitedDate(LocalDateTime submitedDate) {
		this.submitedDate = submitedDate;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getOverallReview() {
		return overallReview;
	}

	public void setOverallReview(String overallReview) {
		this.overallReview = overallReview;
	}
	
	public User getReviewedBy() {
		return reviewedBy;
	}
	
	public void setReviewedBy(User reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Request [id=");
		builder.append(id);
		builder.append(", hsp=");
		builder.append(hsp);
		builder.append(", createdOn=");
		builder.append(createdOn);
		builder.append(", createdBy=");
		builder.append(createdBy);
		builder.append(", status=");
		builder.append(status);
		builder.append(", statusDate=");
		builder.append(statusDate);
		builder.append(", user=");
		builder.append(user);
		builder.append(", facility=");
		builder.append(facility);
		builder.append(", submitedDate=");
		builder.append(submitedDate);
		builder.append(", caseCategory=");
		builder.append(caseCategory);
		builder.append(", visitId=");
		builder.append(visitId);
		builder.append(", isDeleted=");
		builder.append(isDeleted);
		builder.append(", overallReview=");
		builder.append(overallReview);
		builder.append(", reviewedBy=");
		builder.append(reviewedBy);
		builder.append("]");
		return builder.toString();
	}

}
