package org.gof.behavioral.observer;

import java.io.File;

/**
 * 通用观察者接口
 * 
 * @author TungWang
 */
public interface EventListener {

	void update(EventEnum event, File file);

}
