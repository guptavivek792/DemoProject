package com.healogics.iheal.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.CalendarVisitListGetBean;
import com.healogics.iheal.bean.SuperBillResponseBean;
import com.healogics.iheal.bean.SuperBillSaveBean;
import com.healogics.iheal.bean.VisitListGetBean;
import com.healogics.iheal.bean.VisitStartBean;
import com.healogics.iheal.bean.VisitStartResponseBean;
import com.healogics.iheal.bean.Visits;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealVisitServices {

	private final ObjectMapper mapper = new ObjectMapper();

	public Visits calendarVisitListGet(CalendarVisitListGetBean calendarVisitListGetBean) {

		try {
			String input = this.mapper.writeValueAsString(calendarVisitListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.calendarVisitListGet, input);
			Visits authResponse = (Visits) IHealResponseConverter.jsonResponseToClass(response, Visits.class);
			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public VisitStartResponseBean visitStart(VisitStartBean visitStartBean) {
		try {
			String input = this.mapper.writeValueAsString(visitStartBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.visitStart, input);
			VisitStartResponseBean authResponse = (VisitStartResponseBean) IHealResponseConverter
					.jsonResponseToClass(response, VisitStartResponseBean.class);
			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public Visits visitListGet(VisitListGetBean visitListGetBean) {
		try {
			String input = this.mapper.writeValueAsString(visitListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.visitListGet, input);
			Visits authResponse = (Visits) IHealResponseConverter.jsonResponseToClass(response, Visits.class);
			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}

	}

	public VisitStartResponseBean visitEnd(VisitListGetBean visitListGetBean) {
		try {
			String input = this.mapper.writeValueAsString(visitListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.visitEnd, input);
			VisitStartResponseBean authResponse = (VisitStartResponseBean) IHealResponseConverter
					.jsonResponseToClass(response, VisitStartResponseBean.class);
			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public SuperBillResponseBean superBillSave(SuperBillSaveBean superBillSaveBean) {
		try {
			String input = this.mapper.writeValueAsString(superBillSaveBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.superBillSave, input);
			SuperBillResponseBean responseBean = (SuperBillResponseBean) IHealResponseConverter
					.jsonResponseToClass(response, SuperBillResponseBean.class);
			return responseBean;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

}
