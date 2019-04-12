package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealRequest;

public class NotesRequestBean extends IHealRequest {

	private Long				userId;

	private String				eventDateTime;

	private Long				facilityId;

	private Long				patientId;

	private Long				visitId;

	private Long				woundDocumentEntityId;

	private NoteDocumentBean	noteDocument;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEventDateTime() {
		return eventDateTime;
	}

	public void setEventDateTime(String eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public Long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public Long getVisitId() {
		return visitId;
	}

	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}

	public Long getWoundDocumentEntityId() {
		return woundDocumentEntityId;
	}

	public void setWoundDocumentEntityId(Long woundDocumentEntityId) {
		this.woundDocumentEntityId = woundDocumentEntityId;
	}

	public NoteDocumentBean getNoteDocument() {
		return noteDocument;
	}

	public void setNoteDocument(NoteDocumentBean noteDocument) {
		this.noteDocument = noteDocument;
	}

}
