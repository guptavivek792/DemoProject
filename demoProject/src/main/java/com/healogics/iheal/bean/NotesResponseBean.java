package com.healogics.iheal.bean;

import com.healogics.iheal.utility.IHealResponse;

public class NotesResponseBean extends IHealResponse {

	private NoteDocumentBean note;

	public NoteDocumentBean getNote() {
		return note;
	}

	public void setNote(NoteDocumentBean note) {
		this.note = note;
	}

}
