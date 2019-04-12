package com.healogics.iheal.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.ProblemListInput;
import com.healogics.iheal.bean.ProblemLoadInput;
import com.healogics.iheal.bean.ProblemsListResponse;
import com.healogics.iheal.bean.ProblemsLoadResponse;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealDocumentService {
	
	private final ObjectMapper mapper = new ObjectMapper();
	
	public ProblemsListResponse problemList(ProblemListInput problemListInput) {
		try {
			String input = this.mapper.writeValueAsString(problemListInput);
			String response = IHealRestClient.post(IHealAPIEndPoints.ProblemListListGet, input);
			ProblemsListResponse authResponse = (ProblemsListResponse) IHealResponseConverter.jsonResponseToClass(response, ProblemsListResponse.class);
			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}
	
	public ProblemsLoadResponse problemLoad(ProblemLoadInput problemListLoadInput) {
		try {
			String input = this.mapper.writeValueAsString(problemListLoadInput);
			String response = IHealRestClient.post(IHealAPIEndPoints.ProblemListLoad, input);
			ProblemsLoadResponse authResponse = (ProblemsLoadResponse) IHealResponseConverter.jsonResponseToClass(response, ProblemsLoadResponse.class);
			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}
}
