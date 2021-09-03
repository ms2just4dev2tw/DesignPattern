package org.gof.behavioral.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 具体发布者， 由其他对象追踪
 * 
 * @author TungWang
 */
public class Editor implements Subject {

	private File currentFile;
	Map<EventEnum, List<EventListener>> container;

	public Editor() {
		container = new HashMap<>();
	}

	/**
	 * 编辑器打开文件
	 * 
	 * @param filePath 文件路径
	 */
	public void openFile(String filePath) {
		this.currentFile = new File(filePath);
		sendNotify(EventEnum.OPEN_FILE);
	}

	/**
	 * 编辑器保存文件
	 * 
	 * @throws Exception
	 */
	public void saveFile() throws Exception {
		if (this.currentFile != null) {
			sendNotify(EventEnum.SAVE_FILE);
		} else
			throw new Exception("Please open a file first.");
	}

	@Override
	public void attach(EventEnum event, EventListener listener) {
		List<EventListener> users = container.get(event);
		if (users == null) {
			users = new ArrayList<>();
			container.put(event, users);
		}
		users.add(listener);
	}

	@Override
	public void detach(EventEnum event, EventListener listener) {
		List<EventListener> users = container.get(event);
		users.remove(listener);
	}

	@Override
	public void sendNotify(EventEnum event) {
		List<EventListener> users = container.get(event);
		if (users != null)
			for (EventListener listener : users)
				listener.update(event, currentFile);
	}

}
