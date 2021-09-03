package org.gof.behavioral.strategy;

/**
 * 
 * @author TungWang
 */
public abstract class BaseRouteStrategy implements RouteStrategy {

	public BaseRouteStrategy() {
	}

	@Override
	public final Route buildRoute(Point start, Point end) {
		beforeLoadMap();
		loadMap();
		beforeCompute();
		return compute(start, end);
	}

	public void beforeLoadMap() {
	}

	public abstract void loadMap();

	public void beforeCompute() {
	}

	public abstract Route compute(Point start, Point end);

}
