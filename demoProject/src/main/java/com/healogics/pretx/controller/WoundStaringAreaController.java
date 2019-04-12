package com.healogics.pretx.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.healogics.common.Response.Response;
import com.healogics.common.Response.SuccessResponse;
import com.healogics.iheal.bean.Measurement;
import com.healogics.pretx.bean.WoundStartAreaReqBean;
import com.healogics.pretx.service.WoundService;

@Controller
public class WoundStaringAreaController {

	@Autowired
	private WoundService woundService;

	private static final Log			LOGGER	= LogFactory.getLog(WoundStaringAreaController.class);
	
	@PostMapping(value = "woundStaringArea")
	public @ResponseBody Response woundStaringArea(@RequestBody WoundStartAreaReqBean getBean) {
		
		LOGGER.info("woundStaringArea   -> input  : " + getBean);
		
		Measurement measurment = this.woundService.getWoundStartingArea(getBean);
		return new SuccessResponse(measurment);
	}

}