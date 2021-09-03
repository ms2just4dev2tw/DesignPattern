package org.gof.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型工厂
 * 
 * @author TungWang
 */
public class BundledShapeCache {

	// 保存原型缓存
	private Map<String, Shape> cache = new HashMap<>();

	public BundledShapeCache() {
		// 圆形
		Circle circle = new Circle();
		circle.x = 5;
		circle.y = 7;
		circle.radius = 45;
		circle.color = "Green";

		// 长方形
		Rectangle rectangle = new Rectangle();
		rectangle.x = 6;
		rectangle.y = 9;
		rectangle.width = 8;
		rectangle.height = 10;
		rectangle.color = "Blue";

		// 初始化内置原型
		cache.put("circle", circle);
		cache.put("rectangle", rectangle);
	}

	public Shape put(String key, Shape shape) {
		cache.put(key, shape);
		return shape;
	}

	// 返回一个克隆对象
	public Shape get(String key) {
		return cache.get(key).clone();
	}

}