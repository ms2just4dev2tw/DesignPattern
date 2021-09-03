package org.gof.creational;

import java.util.Date;

import org.gof.creational.builder.Person;
import org.gof.creational.builder.Person.Builder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBuilder {

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
	void testBuilder() {
		Person person = new Builder("John", "男", new Date()).email("123@xxx.com").build();
		System.out.println(person);
	}

}
