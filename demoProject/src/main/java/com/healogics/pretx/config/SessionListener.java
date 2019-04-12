package com.healogics.pretx.config;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("==== Session is created ====");
		event.getSession().setMaxInactiveInterval(AppListener.getIdealTimeout() * 60);// for 30 minutes, aka 30*60 seconds
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("==== Session is destroyed ====");
		
	}

}
