package com.healogics.iheal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.CalendarVisitListGetBean;
import com.healogics.iheal.bean.FacilitiesBean;
import com.healogics.iheal.bean.PatientLoad;
import com.healogics.iheal.bean.PatientLoadBean;
import com.healogics.iheal.bean.User;
import com.healogics.iheal.bean.UserFacilityListGetBean;
import com.healogics.iheal.bean.UserProfileGetBean;
import com.healogics.iheal.bean.VisitStartResponseBean;
import com.healogics.iheal.bean.Visits;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealUserServices {

	private final ObjectMapper mapper = new ObjectMapper();

	public FacilitiesBean userFacilityListGet(UserFacilityListGetBean userFacilityListGetBean) {
		try {
			String input = this.mapper.writeValueAsString(userFacilityListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.userFacilityListGet, input);
			FacilitiesBean facilitiesResponse = (FacilitiesBean) IHealResponseConverter.jsonResponseToClass(response,
					FacilitiesBean.class);
			return facilitiesResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public User userProfileGet(UserProfileGetBean userProfileGetBean) {
		try {
			String input = this.mapper.writeValueAsString(userProfileGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.userProfileGet, input);
			User user = (User) IHealResponseConverter.jsonResponseToClass(response, User.class);
			return user;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}

	}

	public PatientLoad patientLoad(PatientLoadBean patientLoadBean) {
		try {
			String input = this.mapper.writeValueAsString(patientLoadBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.patientLoad, input);
			PatientLoad patientLoad = (PatientLoad) IHealResponseConverter.jsonResponseToClass(response,
					PatientLoad.class);
			return patientLoad;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}

	}

	public List<Visits> calendarVisitListGet(CalendarVisitListGetBean calendarVisitListGetBean) {
		try {
			String input = this.mapper.writeValueAsString(calendarVisitListGetBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.calendarVisitListGet, input);
			VisitStartResponseBean visitRespBean = (VisitStartResponseBean) IHealResponseConverter
					.jsonResponseToClass(response, VisitStartResponseBean.class);
			return visitRespBean.getVisits();

		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}

	}

}
