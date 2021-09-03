package org.gof.creational;

import org.gof.creational.prototype.BundledShapeCache;
import org.gof.creational.prototype.Shape;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPrototype {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		BundledShapeCache cache = new BundledShapeCache();

		Shape circle1 = cache.get("circle");
		Shape rectangle1 = cache.get("rectangle");
		Shape rectangle2 = cache.get("rectangle");

		if (circle1 == rectangle1)
			System.out.println("circle1 与 rectangle1 在内存上是相同的");
		else
			System.out.println("circle1 与 rectangle1 在内存上是不同的");

		if (circle1.equals(rectangle1))
			System.out.println("circle1 与 rectangle1 在逻辑上是相同的");
		else
			System.out.println("circle1 与 rectangle1 在逻辑上是不同的");

		if (rectangle1 == rectangle2)
			System.out.println("rectangle1 与 rectangle2 在内存上是相同的");
		else
			System.out.println("rectangle1 与 rectangle2 在内存上是不同的");

		if (rectangle1.equals(rectangle2))
			System.out.println("rectangle1 与 rectangle2 在逻辑上是相同的");
		else
			System.out.println("rectangle1 与 rectangle2 在逻辑上是不同的");
	}

}
