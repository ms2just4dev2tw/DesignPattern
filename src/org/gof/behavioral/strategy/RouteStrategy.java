package org.gof.behavioral.strategy;

/**
 * 路线策略
 * 
 * @author TungWang
 */
public interface RouteStrategy {

	Route buildRoute(Point start, Point end);

}
