/**
 * 
 */
package com.healogics.pretx.controller;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.healogics.common.Response.ErrorCode;
import com.healogics.common.Response.Response;
import com.healogics.common.Response.SuccessResponse;
import com.healogics.iheal.bean.AuthenticateBean;
import com.healogics.iheal.bean.AuthenticateInstanceBean;
import com.healogics.iheal.service.IHealAuthenticationServices;
import com.healogics.pretx.bean.AddRequestBean;
import com.healogics.pretx.bean.CoversheetBean;
import com.healogics.pretx.bean.DashboardFilterBean;
import com.healogics.pretx.bean.PatientRegisterationBean;
import com.healogics.pretx.bean.RejectRequestBean;
import com.healogics.pretx.bean.RequestBean;
import com.healogics.pretx.bean.RequestCountBean;
import com.healogics.pretx.domain.Facility;
import com.healogics.pretx.enumeration.UserType;
import com.healogics.pretx.exception.PreTxException;
import com.healogics.pretx.service.AuthorizationService;
import com.healogics.pretx.service.RequestService;
import com.healogics.pretx.service.UserService;
import com.healogics.pretx.service.impl.AuthorizationServiceImpl;
import com.healogics.pretx.utility.Constants;
import com.healogics.pretx.utility.PreTxUtills;

/**
 * @author Abhinav Sahu
 *
 */
@Controller
public class RequestController {

	private static final Log			LOGGER	= LogFactory.getLog(AuthorizationServiceImpl.class);

	@Autowired
	private RequestService				requestService;

	@Autowired
	private IHealAuthenticationServices	iHealAuthenticationServices;

	@Autowired
	private AuthorizationService		authorizationService;

	@Autowired
	private UserService					userService;

	private Map<String, String> extractDataFromRequest(HttpServletRequest request) {

		Map<String, String> res = new HashMap<>();
		Map<String, String[]> nodeMap = request.getParameterMap();

		for (Map.Entry<String, String[]> entry : nodeMap.entrySet()) {
			LOGGER.debug("Item : " + entry.getKey() + " value : " + entry.getValue()[0]);
			res.put(entry.getKey().toLowerCase(), entry.getValue()[0]);
		}

		LOGGER.debug(res);
		return res;
	}

	@PostMapping(value = "saveRequest", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response saveRequestDetails(@RequestBody RequestBean input) {

		return new SuccessResponse(this.requestService.saveRequest(input));
	}

	@GetMapping(value = "launch")
	public String showForm(HttpServletRequest request, HttpSession session) {

		Map<String, String> reqParams = this.extractDataFromRequest(request);

		String iHealAccessToken = reqParams.get("ihealaccesstoken");
		String iHealUserID = reqParams.get("ihealuserid"); // WL1kg4s2+Wo=
		String patientID = reqParams.get("patientid"); // 2J+2fJDXIPI=
		String facilityId = reqParams.get("facilityid"); // lXgd1K3d3L4=
		String visitId = reqParams.get("visitid"); // lXgd1K3d3L4=
		String action = reqParams.get("action");

		PatientRegisterationBean bean = new PatientRegisterationBean();

		bean.setiHealUserId(iHealUserID);
		bean.setiHealAccessToken(iHealAccessToken);
		bean.setFacilityId(facilityId);
		bean.setPatientId(patientID);
		bean.setAction(action);
		bean.setVisitId(visitId);

		AddRequestBean addRequestBean = this.authorizationService.authenticateByInstanceToken(bean);

		session.setAttribute(Constants.SESSION_USERID, addRequestBean.getUserId());
		session.setAttribute(Constants.SESSION_USER_TYPE, addRequestBean.getUserType());

		String token = PreTxUtills.encryptLaunch(addRequestBean.getFacilityId(), addRequestBean.getPatientId(),
				addRequestBean.getiHealUserId(), addRequestBean.getVisitId());

		boolean hasActiveRequestForPatient = this.requestService
				.hasActiveRequestForPatient(addRequestBean.getPatientId());

		if (hasActiveRequestForPatient) {
			return "redirect:patientRequest?patientId=" + addRequestBean.getPatientId() + "&token="
					+ Base64.getEncoder().encodeToString(token.getBytes());
		} else {
			return "redirect:addRequest?token=" + Base64.getEncoder().encodeToString(token.getBytes());
		}
	}

	@GetMapping(value = "test")
	public String test(HttpSession session) {

		AuthenticateBean authenticateBean = new AuthenticateBean();
		authenticateBean.setUserName("aphys");
		authenticateBean.setPassword("Pass@123");

		AuthenticateInstanceBean authenticateInstanceBean = this.iHealAuthenticationServices
				.authenticateInstance(authenticateBean);

		PatientRegisterationBean bean = new PatientRegisterationBean();
		bean.setFacilityId("rpALtEm4sYY=");
		bean.setPatientId("ZDn2YzlU1dY=");
		bean.setiHealAccessToken(authenticateInstanceBean.getInstanceToken());
		bean.setVisitId("BhjW7+gPq7E044WcTItarQ==");
		bean.setiHealUserId("dj11N750u/E=");

		AddRequestBean addRequestBean = this.authorizationService.authenticateByInstanceToken(bean);

		session.setAttribute(Constants.SESSION_USERID, addRequestBean.getUserId());
		session.setAttribute(Constants.SESSION_USER_TYPE, addRequestBean.getUserType());

		String token = PreTxUtills.encryptLaunch(addRequestBean.getFacilityId(), addRequestBean.getPatientId(),
				addRequestBean.getiHealUserId(), addRequestBean.getVisitId());

		boolean hasActiveRequestForPatient = this.requestService
				.hasActiveRequestForPatient(addRequestBean.getPatientId());

		if (hasActiveRequestForPatient) {
			return "redirect:patientRequest?patientId=" + addRequestBean.getPatientId() + "&token="
					+ Base64.getEncoder().encodeToString(token.getBytes());
		} else {
			return "redirect:addRequest?token=" + Base64.getEncoder().encodeToString(token.getBytes());
		}

	}

	@GetMapping(value = "addRequest")
	public String addRequest(@RequestParam("token") String token, Model model) throws JsonProcessingException {

		Map<String, String> map = PreTxUtills.decryptLaunch(new String(Base64.getDecoder().decode(token.getBytes())));

		JsonNode responseJson = this.requestService.launch(Long.parseLong(map.get("userId")),
				Long.parseLong(map.get("visitId")));

		if (responseJson == null) {
			throw new PreTxException(ErrorCode.INVALID_CREDENTIALS);
		}

		model.addAttribute("requestJson", responseJson);
		return "addRequest";
	}

	@GetMapping(value = "getRequest")
	public @ResponseBody Response getRequest(@RequestParam("requestId") Long requestId) {

		return new SuccessResponse(this.requestService.getRequestById(requestId));

	}

	@GetMapping(value = "hboRequest")
	public String hboRequest(HttpServletRequest request, HttpSession session, @RequestParam("requestId") Long requestId,
			Model modal) {

		/*
		 * Map<String, Object> response =
		 * this.requestService.getRequestStatusById(requestId);
		 * 
		 * Short status = (Short) response.get("status"); boolean isAllowToEdit =
		 * (boolean) response.get("isAllowToEdit");
		 * 
		 * if (RequestStatus.DRAFT.value() == status) {
		 * 
		 * return "addRequest"; } else if (RequestStatus.NEW.value() == status ||
		 * RequestStatus.RESUBMITED.value() == status) {
		 * 
		 * modal.addAttribute("isAllowToEdit", isAllowToEdit);
		 * 
		 * return "hboReview"; } else if (RequestStatus.DECLINED.value() == status ||
		 * RequestStatus.RETURNED.value() == status) {
		 * 
		 * modal.addAttribute("isAllowToEdit", isAllowToEdit);
		 * 
		 * return "editRequest"; }
		 * 
		 * modal.addAttribute("isAllowToEdit", isAllowToEdit);
		 * 
		 * return "hboReview";
		 */

		Map<String, Object> viewMap = this.requestService.getViewAndPermission(requestId);

		String view = (String) viewMap.get("view");
		boolean editPermission = (boolean) viewMap.get("editPermission");

		modal.addAttribute("editPermission", editPermission);

		return view;

	}

	@PostMapping(value = "hboDashboard", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response hboDashboard(@RequestBody DashboardFilterBean filterBean, HttpSession session) {
		Map<String, Object> response = new HashMap<>();
		short userType = (short) session.getAttribute(Constants.SESSION_USER_TYPE);

		if (userType == UserType.PROVIDER.value() || userType == UserType.OTHERS.value())
			response = this.requestService.facilityDashboard(filterBean);
		else
			response = this.requestService.hboDashboard(filterBean);

		return new SuccessResponse(response);
	}

	@PostMapping(value = "hboPieChart", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response hboPieChart(@RequestBody DashboardFilterBean filterBean, HttpSession session) {
		RequestCountBean countBean = new RequestCountBean();

		short userType = (short) session.getAttribute(Constants.SESSION_USER_TYPE);

		if (userType == UserType.PROVIDER.value() || userType == UserType.OTHERS.value())
			countBean = this.requestService.facilityDashboardCount(filterBean);
		else
			countBean = this.requestService.hboDashboardCount(filterBean);

		return new SuccessResponse(countBean);
	}

	@PostMapping(value = "chartDetail", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response chartDetail(@RequestBody DashboardFilterBean filterBean, HttpSession session) {

		return new SuccessResponse(this.requestService.hboDashboard(filterBean));
	}

	@PostMapping(value = "patientDashboard", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response patientDashboard(@RequestBody DashboardFilterBean filterBean, HttpSession session) {
		Map<String, Object> response = new HashMap<>();

		response = this.requestService.patientDashboard(filterBean);

		return new SuccessResponse(response);
	}

	@GetMapping(value = "startReview")
	public @ResponseBody Response startReview(@RequestParam("requestId") Long requestId) {

		return new SuccessResponse(this.requestService.startReview(requestId));

	}

	@PostMapping(value = "rejectRequest")
	public @ResponseBody Response rejectRequest(@RequestBody RejectRequestBean bean) {

		return new SuccessResponse();

	}

	@PostMapping(value = "coversheetDashboard", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response coversheetDashboard(@RequestBody CoversheetBean coversheet, HttpSession session) {

		this.userService.coversheetFacility(coversheet);
		return new SuccessResponse();
	}

	@PostMapping(value = "getfacility", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response getfacility(@RequestBody Long facilityId) {
		System.out.println("facilityId================" + facilityId);
		Facility facility = this.userService.getFacility(facilityId);
		return new SuccessResponse(facility);
	}

}
