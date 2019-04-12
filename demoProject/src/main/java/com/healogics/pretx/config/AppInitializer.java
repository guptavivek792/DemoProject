package com.healogics.pretx.config;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.healogics.common.Response.ErrorCode;
import com.healogics.pretx.exception.PreTxException;

/**
 * @author Vivek Patidar
 */

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { SpringConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] { new HiddenHttpMethodFilter() };
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		super.onStartup(servletContext);
		servletContext.addListener(new SessionListener());
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		boolean done = registration.setInitParameter("throwExceptionIfNoHandlerFound", "true"); // -> true
		if (!done)
			throw new PreTxException(ErrorCode.NOT_FOUND);
	}

}