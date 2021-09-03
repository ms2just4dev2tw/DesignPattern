package org.gof.behavioral;

import org.gof.behavioral.iterator.Container;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestIterator {

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
		Container<String> container = new Container<>();
		container.add("hello");
		container.add(",");
		container.add("world");
		container.add("!");

		for (String s : container)
			System.out.print(s);
		System.out.println();
	}

}
