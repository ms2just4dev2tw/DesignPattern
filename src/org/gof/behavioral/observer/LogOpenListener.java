package org.gof.behavioral.observer;

import java.io.File;

/**
 * 收到通知后在日志中记录一条消息
 * 
 * @author TungWang
 */
public class LogOpenListener implements EventListener {

	private File log;

	public LogOpenListener(String fileName) {
		this.log = new File(fileName);
	}

	@Override
	public void update(EventEnum event, File file) {
		System.out.println("Save to log " + log + ": Someone has performed " + event
				+ " operation with the following file: " + file.getName());
	}

}
