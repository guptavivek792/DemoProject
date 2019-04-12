package com.healogics.iheal.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.ImageGetResponse;
import com.healogics.iheal.bean.WoundAssessmentImageUploadResponse;
import com.healogics.iheal.bean.WoundAssessmentListGetBean;
import com.healogics.iheal.bean.WoundAssessmentListGetResponse;
import com.healogics.iheal.bean.WoundAssessmentLoadResponse;
import com.healogics.iheal.bean.WoundListGetBean;
import com.healogics.iheal.bean.WoundListGetResponse;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealWoundServices {

	private final ObjectMapper mapper = new ObjectMapper();

	public WoundListGetResponse woundListGet(WoundListGetBean woundListGetBean) {

		try {
			String input = this.mapper.writeValueAsString(woundListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.woundListGet, input);
			WoundListGetResponse woundListGet = (WoundListGetResponse) IHealResponseConverter
					.jsonResponseToClass(response, WoundListGetResponse.class);
			return woundListGet;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public WoundAssessmentListGetResponse woundListGet(WoundAssessmentListGetBean woundAssessmentListGetBean) {
		try {
			String input = this.mapper.writeValueAsString(woundAssessmentListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.woundAssessmentListGet, input);

			WoundAssessmentListGetResponse woundAssessmentListGetResponse = (WoundAssessmentListGetResponse) IHealResponseConverter
					.jsonResponseToClass(response, WoundAssessmentListGetResponse.class);
			return woundAssessmentListGetResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public WoundAssessmentLoadResponse woundAssessmentLoad(WoundAssessmentListGetBean woundAssessmentListGetBean) {
		try {
			String input = this.mapper.writeValueAsString(woundAssessmentListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.woundAssessmentLoad, input);
			WoundAssessmentLoadResponse woundAssessmentLoadResponse = (WoundAssessmentLoadResponse) IHealResponseConverter
					.jsonResponseToClass(response, WoundAssessmentLoadResponse.class);
			return woundAssessmentLoadResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public WoundAssessmentImageUploadResponse woundAssessmentImageUpload(
			WoundAssessmentListGetBean woundAssessmentListGetBean) {
		try {
			String input = this.mapper.writeValueAsString(woundAssessmentListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.woundAssessmentImageUpload, input);
			WoundAssessmentImageUploadResponse woundAssessmentListGetResponse = (WoundAssessmentImageUploadResponse) IHealResponseConverter
					.jsonResponseToClass(response, WoundAssessmentImageUploadResponse.class);
			return woundAssessmentListGetResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public ImageGetResponse imageGet(WoundAssessmentListGetBean woundAssessmentListGetBean) {
		try {
			String input = this.mapper.writeValueAsString(woundAssessmentListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.imageGet, input);
			ImageGetResponse imageGetResponse = (ImageGetResponse) IHealResponseConverter.jsonResponseToClass(response,
					ImageGetResponse.class);
			return imageGetResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public WoundListGetResponse woundListGetV2(WoundListGetBean woundListGetBean) {

		try {
			String input = this.mapper.writeValueAsString(woundListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.woundListGetV2, input);

			return (WoundListGetResponse) IHealResponseConverter.jsonResponseToClass(response,
					WoundListGetResponse.class);

		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

}
