package com.healogics.iheal.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.CustomScanResponseBean;
import com.healogics.iheal.bean.DocumentGroupInputBean;
import com.healogics.iheal.bean.DocumentGroupResponseBean;
import com.healogics.iheal.bean.TestResultInputBean;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealCustomScanService {

	private final ObjectMapper mapper = new ObjectMapper();

	public DocumentGroupResponseBean getDocumentCategory(DocumentGroupInputBean documentCategoryInputBean) {
		try {
			String input = this.mapper.writeValueAsString(documentCategoryInputBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.getDocumentCategory, input);
			DocumentGroupResponseBean authResponse = (DocumentGroupResponseBean) IHealResponseConverter
					.jsonResponseToClass(response, DocumentGroupResponseBean.class);
			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public CustomScanResponseBean getDocumentList(TestResultInputBean inputBean) {
		try {
			String input = this.mapper.writeValueAsString(inputBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.customScanList, input);
			CustomScanResponseBean res = (CustomScanResponseBean) IHealResponseConverter.jsonResponseToClass(response,
					CustomScanResponseBean.class);
			return res;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

}
