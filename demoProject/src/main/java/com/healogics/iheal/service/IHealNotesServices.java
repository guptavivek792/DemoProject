package com.healogics.iheal.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.NotesRequestBean;
import com.healogics.iheal.bean.NotesResponseBean;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealNotesServices {

	private final ObjectMapper mapper = new ObjectMapper();

	public NotesResponseBean saveProgressNotes(NotesRequestBean notesRequestBean) {

		try {
			String input = this.mapper.writeValueAsString(notesRequestBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.progressNoteSave, input);
			NotesResponseBean beanResponse = (NotesResponseBean) IHealResponseConverter.jsonResponseToClass(response,
					NotesResponseBean.class);
			return beanResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}

	}

}
