package org.gof.behavioral.observer;

import java.io.File;

/**
 * 收到通知后发送邮件
 * 
 * @author TungWang
 */
public class EmailNotificationListener implements EventListener {

	private String email;

	public EmailNotificationListener(String email) {
		this.email = email;
	}

	@Override
	public void update(EventEnum event, File file) {
		System.out.println("Email to " + email + ": Someone has performed " + event
				+ " operation with the following file: " + file.getName());
	}

}
