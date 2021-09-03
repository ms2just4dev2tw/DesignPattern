package org.gof.structural;

import org.gof.structural.composite.Box;
import org.gof.structural.composite.Charger;
import org.gof.structural.composite.Headset;
import org.gof.structural.composite.Laptop;
import org.gof.structural.composite.MobilePhone;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestComposite {

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
		Box box = buildBox();
		System.out.println(box.getPrice());
	}

	private Box buildBox() {
		Box officeSuite = new Box();
		Box mobileSuite = new Box();
		Box phoneSuite = new Box();

		phoneSuite.addProduct(new MobilePhone());
		phoneSuite.addProduct(new Headset());
		mobileSuite.addProduct(phoneSuite);
		mobileSuite.addProduct(new Charger());
		officeSuite.addProduct(mobileSuite);
		officeSuite.addProduct(new Laptop());

		return officeSuite;
	}

}
