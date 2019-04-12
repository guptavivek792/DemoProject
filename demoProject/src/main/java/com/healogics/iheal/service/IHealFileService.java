package com.healogics.iheal.service;


import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.healogics.common.Response.ErrorCode;
import com.healogics.iheal.bean.FileInputBean;
import com.healogics.iheal.bean.FileResponseBean;
import com.healogics.iheal.bean.FileUploadBean;
import com.healogics.iheal.constants.IHealAPIEndPoints;
import com.healogics.iheal.utility.IHealResponseConverter;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.bean.FileUploadResponseBean;
import com.healogics.pretx.exception.IHealAPIException;

@Service
public class IHealFileService {
	
	private final ObjectMapper mapper = new ObjectMapper();
	
	public FileUploadResponseBean saveFile(FileUploadBean fileUploadBean) {
		try {
			String input = this.mapper.writeValueAsString(fileUploadBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.CustomScanUpload, input);			
			FileUploadResponseBean responseBean =(FileUploadResponseBean) IHealResponseConverter.jsonResponseToClass(response, FileUploadResponseBean.class);
			return responseBean;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}
	
	public FileResponseBean getFile(FileInputBean fileGetInputBean) {
		try {
			String input = this.mapper.writeValueAsString(fileGetInputBean);
			String response = IHealRestClient.post(IHealAPIEndPoints.fileGet, input);			
			FileResponseBean responseBean =(FileResponseBean) IHealResponseConverter.jsonResponseToClass(response, FileResponseBean.class);
			return responseBean;
		} catch (Exception e) {
			throw new IHealAPIException(ErrorCode.UNKNOWN_ERROR, e);
		}
	}
	
}
