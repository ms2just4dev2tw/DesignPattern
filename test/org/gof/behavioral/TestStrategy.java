package org.gof.behavioral;

import org.gof.behavioral.strategy.Navigator;
import org.gof.behavioral.strategy.Point;
import org.gof.behavioral.strategy.PublicTransportStrategy;
import org.gof.behavioral.strategy.RoadStrategy;
import org.gof.behavioral.strategy.WalkingStrategy;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStrategy {

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
		Point start = new Point(112.27, 65.34), end = new Point(63.43, 23.12);
		Navigator navigator = new Navigator();

		navigator.setStrategy(new RoadStrategy());
		System.out.println(navigator.getRoute(start, end));

		navigator.setStrategy(new WalkingStrategy());
		System.out.println(navigator.getRoute(start, end));

		navigator.setStrategy(new PublicTransportStrategy());
		System.out.println(navigator.getRoute(start, end));
	}

}
