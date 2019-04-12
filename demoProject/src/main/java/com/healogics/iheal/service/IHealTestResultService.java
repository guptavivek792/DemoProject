package com.healogics.iheal.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.TestResultInputBean;
import com.healogics.iheal.bean.TestResultListResponseBean;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealTestResultService {

	private final ObjectMapper mapper = new ObjectMapper();

	public TestResultListResponseBean testResultList(TestResultInputBean inputBean) {
		try {
			String input = this.mapper.writeValueAsString(inputBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.testResultList, input);
			TestResultListResponseBean responseBean = (TestResultListResponseBean) IHealResponseConverter
					.jsonResponseToClass(response, TestResultListResponseBean.class);
			return responseBean;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

}
