package org.gof.behavioral;

import java.util.Calendar;

import org.gof.behavioral.template.Product;
import org.gof.behavioral.template.Repository;
import org.gof.behavioral.template.Yogurt;
import org.gof.behavioral.template.YogurtRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTemplate {

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
		Repository repo = initReposity();
		for (Product product = repo.outbound(); product != null; product = repo.outbound()) {
			System.out.println(product);
		}
	}

	private Repository initReposity() {
		Calendar manufacture1 = Calendar.getInstance();
		manufacture1.add(Calendar.YEAR, -2);
		Calendar expiration1 = Calendar.getInstance();
		expiration1.add(Calendar.YEAR, -1);
		Yogurt yg1 = new Yogurt(manufacture1.getTime(), expiration1.getTime());

		Calendar manufacture2 = Calendar.getInstance();
		manufacture2.add(Calendar.YEAR, -1);
		Calendar expiration2 = Calendar.getInstance();
		expiration2.add(Calendar.YEAR, 1);
		Yogurt yg2 = new Yogurt(manufacture2.getTime(), expiration2.getTime());

		Repository repo = new YogurtRepository();
		repo.enter(yg1);
		repo.enter(yg2);

		return repo;
	}

}
