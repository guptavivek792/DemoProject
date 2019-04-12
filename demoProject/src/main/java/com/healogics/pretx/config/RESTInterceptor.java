package com.healogics.pretx.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.common.Response.ErrorResponse;
import com.healogics.pretx.domain.Token;
import com.healogics.pretx.service.AuthorizationService;
import com.healogics.pretx.utility.CommonHeader;
import com.healogics.pretx.utility.PreTxUtills;

public class RESTInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private CommonHeader			commonHeader;

	@Autowired
	private AuthorizationService	authorizationService;

	private ObjectMapper			mapper				= new ObjectMapper();

	static List<String>				whiteList			= new ArrayList<>();

	static List<String>				iHealEndPoints		= new ArrayList<>();

	static List<String>				testingEndPoints	= new ArrayList<>();

	private final Log				logger				= LogFactory.getLog(RESTInterceptor.class);

	static {
		whiteList.add("api/auth/login");
		whiteList.add("api/user/showForm");
		whiteList.add("api/request/saveRequest");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		logger.debug("RESTInterceptor called");

		final String ctxPath = request.getContextPath();
		final String reqURI = request.getRequestURI().substring(ctxPath.length() + 1);

		ThreadContext.put("reqPath", reqURI);
		this.commonHeader.setRequestId(UUID.randomUUID());
		ThreadContext.put("requestId", this.commonHeader.getRequestId().toString());

		if (!whiteList.contains(reqURI)) {

			String token = request.getHeader("token");

			if (token == null || token.isEmpty()) {
				sendInvalidAuthKeyMsg(response);
				return false;
			}

			Map<String, String> data = PreTxUtills.parseDataFromToken(token);

			Long userId = Long.parseLong(data.get("userId"));
			String authKey = data.get("authKey");
			Short userType = Short.parseShort(data.get("userType"));

			if (!this.isAuthKeyValid(userId, authKey)) {

				sendInvalidAuthKeyMsg(response);
				return false;
			}

			this.updateCommonHeader(userId, authKey, userType);

		}

		return super.preHandle(request, response, handler);

	}

	private boolean isAuthKeyValid(Long userId, String authKey) {

		boolean isTokenValid = false;

		Token token = this.authorizationService.getByUserIdAndAuthKey(userId, authKey);

		String dbTokenString = token.getToken();

		if (authKey.equals(dbTokenString)) {

			isTokenValid = true;
		}

		return isTokenValid;
	}

	private void updateCommonHeader(Long userId, String authKey, Short userType) {

		this.commonHeader.setRequestId(UUID.randomUUID());
		this.commonHeader.setUserId(userId);
		this.commonHeader.setUserType(userType);
	}

	private void sendInvalidAuthKeyMsg(HttpServletResponse httpResponse) throws IOException {

		ErrorResponse errorResponse = new ErrorResponse(ErrorCode.INVALID_CREDENTIALS);
		httpResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
		httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		httpResponse.getWriter().write(mapper.writeValueAsString(errorResponse));
	}

}
