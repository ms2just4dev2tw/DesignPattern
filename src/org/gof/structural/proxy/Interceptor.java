package org.gof.structural.proxy;

/**
 * 
 * @author TungWang
 */
public interface Interceptor {

	boolean preHandle();

	void postHandle();

}
