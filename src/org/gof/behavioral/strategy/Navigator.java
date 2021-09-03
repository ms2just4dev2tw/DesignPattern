package org.gof.behavioral.strategy;

public class Navigator {

	private RouteStrategy strategy;

	public Navigator() {
	}

	public Navigator(RouteStrategy strategy) {
		this.strategy = strategy;
	}

	public Route getRoute(Point start, Point end) {
		return strategy.buildRoute(start, end);
	}

	public RouteStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(RouteStrategy strategy) {
		this.strategy = strategy;
	}

}
