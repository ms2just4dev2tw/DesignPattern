package org.gof.structural;

import org.gof.structural.adapter.BoxWithRoundHole;
import org.gof.structural.adapter.RoundWood;
import org.gof.structural.adapter.SquareWood;
import org.gof.structural.adapter.SquareWoodAdapter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAdapter {

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
		BoxWithRoundHole box = new BoxWithRoundHole(7);

		RoundWood wood1 = new RoundWood(6);
		SquareWood wood2 = new SquareWood(10);
		SquareWoodAdapter adapter = new SquareWoodAdapter(wood2);

		displayResult(box, wood1);
		displayResult(box, adapter);
	}

	private void displayResult(BoxWithRoundHole box, RoundWood wood) {
		boolean result = box.fits(wood);
		if (result == true)
			System.out.println("半径: " + wood.getRadius() + "的木块" + "能放入盒子");
		else
			System.out.println("半径: " + wood.getRadius() + "的木块" + "不能放入盒子");
	}

}
