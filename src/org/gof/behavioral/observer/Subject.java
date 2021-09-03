package org.gof.behavioral.observer;

/**
 * 监听器的目标
 * 
 * @author TungWang
 */
public interface Subject {

	/**
	 * 添加监听器
	 * 
	 * @param event 事件
	 * @param listener 监听器
	 */
	void attach(EventEnum event, EventListener listener);

	/**
	 * 删除监听器
	 * 
	 * @param event 事件
	 * @param listener 监听器
	 */
	void detach(EventEnum event, EventListener listener);

	/**
	 * @param event 通知的事件
	 */
	void sendNotify(EventEnum event);

}
