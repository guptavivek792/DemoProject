package com.healogics.pretx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.healogics.common.Response.ErrorCode;
import com.healogics.pretx.bean.LoginRequestBean;
import com.healogics.pretx.bean.LoginResponseBean;
import com.healogics.pretx.exception.PreTxException;
import com.healogics.pretx.service.AuthorizationService;
import com.healogics.pretx.utility.Constants;
import com.healogics.pretx.utility.JsonUtil;
import com.healogics.pretx.utility.RestClient;

@Controller
public class AuthController {

	@Autowired
	private AuthorizationService authorizationService;

	@RequestMapping(value = "login")
	public String login(HttpServletRequest request, RedirectAttributes attributes) {

		if ((String) request.getParameter("code") != null) {
			int errorCode = Integer.parseInt((String) request.getParameter("code"));

			request.setAttribute("isError", true);

			if (errorCode == 1) {
				request.setAttribute("errorMessage", "error.nullcredential");
			} else if (errorCode == 2) {
				request.setAttribute("errorMessage", "error.invalidcredential");
			} else if (errorCode == 4) {
				request.setAttribute("errorMessage", "error.notPreTxUser");
			} else if (errorCode == 5) {
				request.setAttribute("errorMessage", "error.patientAlreadyReg");
			} else {
				request.removeAttribute("isError");
			}
		} else {
			HttpSession session = request.getSession(false);
			// Check if user have valid session
			if (session != null && session.getAttribute(Constants.SESSION_TOKEN) != null) {

				int type = Integer.parseInt(session.getAttribute("userType").toString());

				if (Constants.USER_ROLE_NURSE == type || Constants.USER_ROLE_PHYSICIAN == type) {
					return "redirect:dashboard";
				}
			}
		}
		return "login";
	}

	@PostMapping(value = "authenticate")
	public String authenticateUser(HttpServletRequest request, HttpSession session, RedirectAttributes attributes)
			throws JsonProcessingException {

		JsonNode node = JsonNodeFactory.instance.objectNode().put("userName", request.getParameter("userName"))
				.put("password", request.getParameter("password"));

		LoginRequestBean loginRequest = new ObjectMapper().treeToValue(node, LoginRequestBean.class);

		String userName = loginRequest.getUserName();
		String password = loginRequest.getPassword();

		if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)
				|| !StringUtils.hasLength(StringUtils.trimWhitespace(userName))
				|| !StringUtils.hasLength(StringUtils.trimWhitespace(password))) {
			throw new PreTxException(ErrorCode.CREDENTIALS_CANNOT_NULL);
		}

		LoginResponseBean loginResponseBean = this.authorizationService.iHealStaffLogin(loginRequest);

		if (loginResponseBean == null) {
			throw new PreTxException(ErrorCode.INVALID_CREDENTIALS);
		}

		session.setAttribute(Constants.SESSION_USERID, loginResponseBean.getUserId());
		session.setAttribute(Constants.SESSION_FIRST_NAME, loginResponseBean.getFirstName());
		session.setAttribute(Constants.SESSION_LAST_NAME, loginResponseBean.getLastName());
		session.setAttribute(Constants.SESSION_TOKEN, loginResponseBean.getToken());
		session.setAttribute(Constants.SESSION_USER_TYPE, loginResponseBean.getUserType());

		return "redirect:dashboard";
	}

	@RequestMapping(value = "logout")
	public String logout(HttpSession session) {
		
		String token = (String) session.getAttribute(Constants.SESSION_TOKEN);
		this.authorizationService.deleteMasterToken(token);
		
		if (session != null) {
			session.invalidate();
		}
		return "redirect:login";
	}

	@GetMapping(value = "launchLogin")
	public String iHealAuthenticateUser(HttpServletRequest request, HttpSession session,
			RedirectAttributes attributes) {

		String iHealAccessToken = request.getParameter("iHealAccessToken");
		String iHealUserID = request.getParameter("iHealUserID");
		ObjectNode node = JsonNodeFactory.instance.objectNode().put("iHealAccessToken", iHealAccessToken)
				.put("iHealUserId", iHealUserID);
		String response = RestClient.connectRest("/auth/staffLoginByToken", node.toString(), session);

		ObjectNode responseObj = JsonUtil.StringToObjectNode(response);

		if (responseObj.get("status").asText().equalsIgnoreCase("error")) { // If login service failed
			return "redirect:login?code=" + responseObj.get("errorCode").asInt();
		}

		JsonNode loginData = responseObj.get("data");
		session.setAttribute(Constants.SESSION_USERID, loginData.get(Constants.SESSION_USERID).asLong());
		session.setAttribute(Constants.SESSION_FIRST_NAME, loginData.get(Constants.SESSION_FIRST_NAME).asText());
		session.setAttribute(Constants.SESSION_LAST_NAME, loginData.get(Constants.SESSION_LAST_NAME).asText(""));
		session.setAttribute(Constants.SESSION_TOKEN, loginData.get(Constants.SESSION_TOKEN).asText());
		session.setAttribute(Constants.SESSION_USER_TYPE, loginData.get(Constants.SESSION_USER_TYPE).asInt());

		if (loginData.get("userType").asInt() == (Constants.USER_ROLE_NURSE)
				|| loginData.get("userType").asInt() == (Constants.USER_ROLE_PHYSICIAN))
			return "redirect:dashboard";
		else
			return "redirect:login";
	}
}
