/**
 * 
 */
package com.healogics.pretx.controller;

import java.io.UnsupportedEncodingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.healogics.common.Response.Response;
import com.healogics.common.Response.SuccessResponse;
import com.healogics.pretx.bean.TestResultBean;
import com.healogics.pretx.service.DocumentService;

/**
 * @author Vivek Patidar
 *
 */
@Controller
public class DocumentController {

	@Autowired
	private DocumentService		documentService;

	private static final Log	LOGGER	= LogFactory.getLog(DocumentController.class);

	@PostMapping(value = "documentList")
	public @ResponseBody Response resultsListGet(@RequestBody TestResultBean input) throws UnsupportedEncodingException {
		LOGGER.info("documentList  -> input   : " + input);

		return new SuccessResponse(this.documentService.resultsList(input));
	}

}
