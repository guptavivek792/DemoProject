package com.healogics.iheal.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.AuthenticateBean;
import com.healogics.iheal.bean.AuthenticateByTokenBean;
import com.healogics.iheal.bean.AuthenticateByTokenResponseBean;
import com.healogics.iheal.bean.AuthenticateInstanceBean;
import com.healogics.iheal.bean.AuthenticateResponseBean;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealAuthenticationServices {

	private final ObjectMapper mapper = new ObjectMapper();

	public AuthenticateResponseBean authenticate(AuthenticateBean authenticateBean) {
		try {
			String input = this.mapper.writeValueAsString(authenticateBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.authenticate, input);
			AuthenticateResponseBean authResponse = (AuthenticateResponseBean) IHealResponseConverter
					.jsonResponseToClass(response, AuthenticateResponseBean.class);
			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public AuthenticateInstanceBean authenticateInstance(AuthenticateBean authenticateBean) {
		try {
			String input = this.mapper.writeValueAsString(authenticateBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.authenticateInstance, input);
			AuthenticateInstanceBean authResponse = (AuthenticateInstanceBean) IHealResponseConverter.jsonResponseToClass(response,
					AuthenticateInstanceBean.class);
			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}

	public AuthenticateByTokenResponseBean authenticateByToken(AuthenticateByTokenBean authenticateByTokenBean) {
		try {
			String input = this.mapper.writeValueAsString(authenticateByTokenBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.authenticateByToken, input);

			AuthenticateByTokenResponseBean authResponse = (AuthenticateByTokenResponseBean) IHealResponseConverter
					.jsonResponseToClass(response, AuthenticateByTokenResponseBean.class);

			return authResponse;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}
}
