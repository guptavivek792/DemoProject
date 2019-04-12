package com.healogics.iheal.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.HBOPreTxInputBean;
import com.healogics.iheal.bean.HBOPreTxResponse;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealHBOService {

	private final ObjectMapper objectMapper = new ObjectMapper();

	public HBOPreTxResponse saveHBOPreTreatmentAssmnt(HBOPreTxInputBean hboPreTreatmentAssessmentBean) {
		try {
			String input = this.objectMapper.writeValueAsString(hboPreTreatmentAssessmentBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.HBOPreTreatmentAssessmentSave, input);
			HBOPreTxResponse hboPreTreatResponse = (HBOPreTxResponse) IHealResponseConverter
					.jsonResponseToClass(response, HBOPreTxResponse.class);
			return hboPreTreatResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}

	}

}
