package org.gof.structural;

import org.gof.structural.decorator.CompressionDecorator;
import org.gof.structural.decorator.DataSource;
import org.gof.structural.decorator.EncryptionDecorator;
import org.gof.structural.decorator.SimpleDataSource;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDecorator {

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
		String salaryRecords = "Name,Salary\r\nJohn Smith,100000\r\nSteven Jobs,912000";
		DataSource sds = new SimpleDataSource();
		DataSource ed = new EncryptionDecorator(sds);
		DataSource dd = new CompressionDecorator(ed);

		System.out.println("- 简单数据源 ----------------");
		sds.writeData(salaryRecords);
		System.out.println(sds.readData());
		System.out.println("- 简单数据源的加密装饰--------------");
		ed.writeData(salaryRecords);
		System.out.println(sds.readData());
		System.out.println("- 简单数据源的加密装饰的压缩装饰--------------");
		dd.writeData(salaryRecords);
		System.out.println(sds.readData());
	}

}
