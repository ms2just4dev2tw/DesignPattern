package org.gof.behavioral.strategy;

/**
 * 车行策略
 * 
 * @author TungWang
 */
public class RoadStrategy extends BaseRouteStrategy {

	@Override
	public void beforeLoadMap() {
		System.out.println("车行策略已经导入地图数据");
	}

	@Override
	public void loadMap() {

	}

	@Override
	public void beforeCompute() {
		System.out.println("车行策略已经开始计算路线");
	}

	@Override
	public Route compute(Point start, Point end) {
		return new Route(start, end);
	}

}
