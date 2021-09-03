package org.gof.structural;

import java.io.File;

import org.gof.structural.facade.VideoConversionFacade;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFacade {

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
		VideoConversionFacade converter = new VideoConversionFacade();
		// 将 ogg 文件转换成 mp4 文件
		File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
		System.out.println(mp4Video);
	}

}
