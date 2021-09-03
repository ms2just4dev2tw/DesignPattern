package org.gof.behavioral;

import org.gof.behavioral.observer.Editor;
import org.gof.behavioral.observer.EmailNotificationListener;
import org.gof.behavioral.observer.EventEnum;
import org.gof.behavioral.observer.LogOpenListener;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestObserver {

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
		Editor editor = new Editor();
		editor.attach(EventEnum.OPEN_FILE, new LogOpenListener("/path/to/log/file.txt"));
		editor.attach(EventEnum.OPEN_FILE, new EmailNotificationListener("admin@example.com"));

		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
