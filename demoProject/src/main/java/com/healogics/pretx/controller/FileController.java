/**
 * 
 */
package com.healogics.pretx.controller;

import java.io.IOException;
import java.util.Base64;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.tika.mime.MimeType;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.healogics.iheal.bean.FileInputBean;
import com.healogics.pretx.bean.DocumentResponseBean;
import com.healogics.pretx.service.FileService;
import com.healogics.pretx.utility.PreTxUtills;

@Controller
public class FileController {

	@Autowired
	private FileService fileService;

	@RequestMapping(value = "Document/{facilityId}/{patientId}/{documentEntityId}/{type}/{fileName}", method = RequestMethod.GET)
	public void document(HttpServletResponse res, @PathVariable(value = "facilityId") Long facilityId,
			@PathVariable(value = "patientId") Long patientId,
			@PathVariable(value = "documentEntityId") Long documentId, @PathVariable(value = "type") String type,
			@PathVariable(value = "fileName") String fileName) throws IOException, MimeTypeException {

		FileInputBean bean = new FileInputBean();
		bean.setPatientId(patientId);
		bean.setFacilityId(facilityId);
		bean.setType(type);
		bean.setDocumentEntityId(documentId);

		DocumentResponseBean fileResponse = this.fileService.getFile(facilityId, patientId, documentId, type);
		byte[] fileByteArray = fileResponse.getImageStream();
		String mimeType = fileResponse.getImageMimeType();

		res.setContentType(mimeType);
		res.setHeader("Expires", "0");
		res.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
		res.setHeader("Pragma", "public");

		if (fileName == null || fileName.isEmpty()) {
			fileName = "Document";
		}

		MimeType mime = MimeTypes.getDefaultMimeTypes().forName(mimeType);

		res.setContentLength(fileByteArray.length);
		res.addHeader("content-disposition", "inline;filename=\"" + fileName.trim() + mime.getExtension() + "\"");

		FileCopyUtils.copy(fileByteArray, res.getOutputStream());

	}

	@GetMapping(value = "getDocument/{url}/{fileName}")
	public void getDocument(HttpServletResponse res, @PathVariable(value = "url") String url,
			@PathVariable(value = "fileName") String fileName) throws IOException, MimeTypeException {

		Map<String, String> map = PreTxUtills.decrypt(new String(Base64.getDecoder().decode(url.getBytes())));
		
		FileInputBean bean = new FileInputBean();
		bean.setPatientId(Long.parseLong(map.get("patientId")));
		bean.setFacilityId(Long.parseLong(map.get("facilityId")));
		bean.setType(map.get("type"));
		bean.setDocumentEntityId(Long.parseLong(map.get("documentEntityId")));

		DocumentResponseBean fileResponse = this.fileService.getFile(bean.getFacilityId(), bean.getPatientId(), bean.getDocumentEntityId(), bean.getType());
		byte[] fileByteArray = fileResponse.getImageStream();
		String mimeType = fileResponse.getImageMimeType();

		res.setContentType(mimeType);
		res.setHeader("Expires", "0");
		res.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
		res.setHeader("Pragma", "public");

		if (fileName == null || fileName.isEmpty()) {
			fileName = "Document";
		}

		MimeType mime = MimeTypes.getDefaultMimeTypes().forName(mimeType);

		res.setContentLength(fileByteArray.length);
		res.addHeader("content-disposition", "inline;filename=\"" + fileName.trim() + mime.getExtension() + "\"");

		FileCopyUtils.copy(fileByteArray, res.getOutputStream());

	}

}