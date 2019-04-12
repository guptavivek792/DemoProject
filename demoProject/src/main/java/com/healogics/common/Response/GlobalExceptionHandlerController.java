package com.healogics.common.Response;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.healogics.pretx.exception.PreTxException;

@ControllerAdvice
public class GlobalExceptionHandlerController {

	@ExceptionHandler(PreTxException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleResourceNotFoundException() {

		return "notFoundJSPPage";
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public String handle(Exception ex) {
		return "redirect:/404";
	}

	@RequestMapping(value = { "/404" }, method = RequestMethod.GET)
	public String NotFoudPage() {
		return "404";

	}

}