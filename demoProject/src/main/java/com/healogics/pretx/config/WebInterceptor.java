package com.healogics.pretx.config;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.healogics.pretx.utility.CommonHeader;
import com.healogics.pretx.utility.Constants;

public class WebInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private CommonHeader	commonHeader;

	private final Log		logger		= LogFactory.getLog(WebInterceptor.class);

	static List<String>		whiteList	= new ArrayList<>();

	static {
		whiteList.add(Constants.LOGIN_URL);
		whiteList.add("file" + Constants.URL_SEPARATOR + "download");
		whiteList.add("authenticate");
		whiteList.add("launch");
		whiteList.add("test");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		logger.debug("WebInterceptor called");
		final String ctxPath = request.getContextPath();
		final String reqURI = request.getRequestURI().substring(ctxPath.length() + 1);

		this.commonHeader.setRequestId(UUID.randomUUID());

		ThreadContext.put("reqPath", reqURI);
		ThreadContext.put("requestId", this.commonHeader.getRequestId().toString());

		if (whiteList.contains(reqURI)) {
			return super.preHandle(request, response, handler);
		} else if ((null != request.getSession(false))) { // User is logged in

			HttpSession session = request.getSession(false);

			this.commonHeader.setUserId((Long) session.getAttribute(Constants.SESSION_USERID));
			this.commonHeader.setUserType((short) session.getAttribute(Constants.SESSION_USER_TYPE));
			return super.preHandle(request, response, handler);
		} else {
			response.setHeader("REQUEST_STATUS", "401");
			response.setStatus(401);
			request.getRequestDispatcher("login?code=7").forward(request, response);

			return false;
		}

	}

}
