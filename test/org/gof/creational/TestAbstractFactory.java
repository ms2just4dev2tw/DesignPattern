package org.gof.creational;

import org.gof.creational.abstractfactory.ElectronicFactory;
import org.gof.creational.abstractfactory.Phone;
import org.gof.creational.factory.HuaWeiFactory;
import org.gof.creational.factory.MiFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

class TestAbstractFactory {

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

	@RepeatedTest(3)
	void testMiFactory() {
		ElectronicFactory factory = new MiFactory();
		Phone phone = factory.getPhone();
		phone.info();
	}

	@RepeatedTest(3)
	void testHuaWeiFactory() {
		ElectronicFactory factory = new HuaWeiFactory();
		Phone phone = factory.getPhone();
		phone.info();
	}

}
