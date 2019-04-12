package com.healogics.iheal.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.PatientSearchInputBean;
import com.healogics.iheal.bean.PatientSearchResponseBean;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealPatientSearchService {
	
	private final ObjectMapper mapper = new ObjectMapper();
	
	
	public PatientSearchResponseBean patientSearch(PatientSearchInputBean patientSearchInput) {
		try {
			String input = this.mapper.writeValueAsString(patientSearchInput);
			String response = IHealRestClient.post(IHealAPIEndPoints.patientSearch, input);
			PatientSearchResponseBean authResponse = (PatientSearchResponseBean) IHealResponseConverter.jsonResponseToClass(response, PatientSearchResponseBean.class);
			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}
}
