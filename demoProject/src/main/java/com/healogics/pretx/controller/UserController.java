/**
 * 
 */
package com.healogics.pretx.controller;

import java.util.Base64;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.JsonNode;
import com.healogics.common.Response.Response;
import com.healogics.common.Response.SuccessResponse;
import com.healogics.iheal.bean.WoundMeasurement;
import com.healogics.pretx.bean.ICD10CodesBean;
import com.healogics.pretx.bean.ICD10CodesInput;
import com.healogics.pretx.bean.UserBean;
import com.healogics.pretx.enumeration.UserType;
import com.healogics.pretx.service.DocumentService;
import com.healogics.pretx.service.RequestService;
import com.healogics.pretx.service.UserService;
import com.healogics.pretx.utility.Constants;
import com.healogics.pretx.utility.PreTxUtills;

/**
 * @author Vivek Patidar
 *
 */
@Controller
public class UserController {

	@Autowired
	private DocumentService		documentService;

	@Autowired
	private UserService			userService;

	@Autowired
	private RequestService		requestService;

	private static final Log	LOGGER	= LogFactory.getLog(UserController.class);

	@PostMapping(value = "getIcdCode")
	public @ResponseBody Response getIcd10Codes(@RequestBody ICD10CodesInput codesInput) {
		LOGGER.info("getIcdCode   -> input  : " + codesInput);
		List<ICD10CodesBean> response = this.documentService.getIcdCodes(codesInput);
		return new SuccessResponse(response);
	}

	@RequestMapping(value = "dashboard")
	public String dashboard(HttpSession session, Model model) {

		short userType = (short) session.getAttribute(Constants.SESSION_USER_TYPE);

		if (userType == UserType.PROVIDER.value() || userType == UserType.OTHERS.value()) {
			model.addAttribute("dashboardType", "facility");
		} else {
			model.addAttribute("dashboardType", "hbo");
		}

		return "dashboard";

	}

	@PostMapping(value = "getUsersByType")
	public @ResponseBody Response getUsersByType() {
		LOGGER.info("getUsersByType   ->   : ");
		List<UserBean> response = this.userService.getUsersByType(UserType.PROVIDER.value());
		return new SuccessResponse(response);
	}

	@GetMapping("getPatientDetail")
	public @ResponseBody Response getPatientDetail(@RequestParam(value = "token", required = false) String token,
			@RequestParam(value = "requestId", required = false) Long requestId) {

		if (token != null && !token.isEmpty()) {
			Map<String, String> map = PreTxUtills
					.decryptLaunch(new String(Base64.getDecoder().decode(token.getBytes())));

			JsonNode jsonNode = this.userService.getPatientDetail(Long.parseLong(map.get("facilityId")),
					Long.parseLong(map.get("patientId")), Long.parseLong(map.get("userId")),
					Long.parseLong(map.get("visitId")));
			return new SuccessResponse(jsonNode);
		} else {

			return new SuccessResponse(this.requestService.getPatientDetailByRequestId(requestId));
		}
	}

	@GetMapping("getPatientWounds")
	public @ResponseBody Response getPatientWounds(@RequestParam(value = "token", required = false) String token,
			@RequestParam(value = "requestId", required = false) Long requestId) {

		if (token != null && !token.isEmpty()) {
			Map<String, String> map = PreTxUtills
					.decryptLaunch(new String(Base64.getDecoder().decode(token.getBytes())));

			List<WoundMeasurement> list = this.userService.getWoundDetail(Long.parseLong(map.get("facilityId")),
					Long.parseLong(map.get("patientId")), Long.parseLong(map.get("userId")));
			return new SuccessResponse(list);

		} else {

			return new SuccessResponse(this.requestService.getWoundDetailByRequestId(requestId));
		}
	}
}
