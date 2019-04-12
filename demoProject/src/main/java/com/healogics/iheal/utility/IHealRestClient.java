package com.healogics.iheal.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.body.RequestBodyEntity;

public final class IHealRestClient {

	private static final Log	LOGGER	= LogFactory.getLog(IHealRestClient.class);

	public static String		IHEAL_IP;

	public static String		HOST_NAME;

	public static String		PRIVATE_KEY;

	public static Boolean		isLocalDevEnv;

	private IHealRestClient() {
		throw new IllegalStateException("IHealRestClient class");
	}

	public static String post(String endPoint, String input) throws UnirestException {

		if (isLocalDevEnv) {
			return local(endPoint, input);
		} else {
			return build(endPoint, input);
		}
	}

	/* This is for aws environment */

	private static String build(String endPoint, String input) throws UnirestException {

		LOGGER.info("**endPoint* :- " + endPoint + ", *input**:- " + input);

		RequestBodyEntity rawResponse = Unirest.post(IHEAL_IP + endPoint).header("Content-Type", "application/json")
				.header("HOST", HOST_NAME).body(input);

		HttpResponse<String> response = rawResponse.asString();
		String data = response.getBody().toString();
		LOGGER.info("**response**:- " + data);
		return data;
	}

	/* This is for other then aws environment */

	private static RestTemplate	restTemplate	= new RestTemplate();

	public static String		local_dev_url;

	public static String local(String endPoint, String input) {

		MultiValueMap<String, String> headers = populateHeaders();
		HttpEntity<String> restRequest = new HttpEntity<>(input, headers);
		ResponseEntity<String> restResponse = restTemplate.postForEntity(local_dev_url + endPoint, restRequest, String.class);

		/* Workaround */
		String response = restResponse.getBody();
		response = response.substring(1, response.length() - 1);
		response = response.replace("\\", "");
		return response;
	}

	private static HttpHeaders populateHeaders() {

		HttpHeaders headers = new HttpHeaders();

		headers.setContentType(MediaType.APPLICATION_JSON);

		return headers;
	}

}
