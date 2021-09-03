package org.gof.structural.adapter;

// 带有一个圆孔的盒子
public class BoxWithRoundHole {

	// 圆孔的半径
	private double radius;

	public BoxWithRoundHole(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	// 判断一个圆形木块是否能放入盒子
	public boolean fits(RoundWood wood) {
		return getRadius() >= wood.getRadius();
	}

}
