package com.healogics.pretx.config;

import java.sql.Timestamp;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.healogics.pretx.utility.DateTimeUtil;

public class AppListener implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private ServletContext	servletContext;

	@Resource(name = "systemProperties")
	private Properties		properties;

	private static String	restUrl;

	private static int		idealTimeout;

	public static String getRestUrl() {

		return AppListener.restUrl;
	}

	public static int getIdealTimeout() {
		return idealTimeout;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		String staticUrl = this.properties.getProperty("staticUrl");
		this.servletContext.setAttribute("staticurl", staticUrl);

		String restUrl = this.properties.getProperty("restUrl");
		this.servletContext.setAttribute("resturl", restUrl);
		AppListener.restUrl = restUrl;

		int idealTimeout = Integer.parseInt(this.properties.getProperty("idealTimeout"));
		this.servletContext.setAttribute("idealTimeout", idealTimeout);
		AppListener.idealTimeout = idealTimeout;

		this.servletContext.setAttribute("serverUpTime", new Date().getTime());

		System.setProperty("java.awt.headless", "true");
	}

}
