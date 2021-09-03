package org.gof.behavioral;

import org.gof.behavioral.state.Player;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestState {

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
		Player player = new Player();
		System.out.println(player.getState().lock());
		System.out.println(player.getState().unlock());
		System.out.println(player.getState().unlock());
		System.out.println(player.getState().next());
		System.out.println(player.getState().previous());
		System.out.println(player.getState().lock());
	}

}
