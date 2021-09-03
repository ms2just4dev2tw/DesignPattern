package org.gof.behavioral.strategy;

/**
 * 路线
 * @author TungWang
 */
public class Route {

	private Point start;
	private Point end;

	public Route(Point start, Point end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "起点" + start + "到" + "终点" + end + "的路线";
	}

}
