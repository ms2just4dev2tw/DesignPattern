package org.gof.behavioral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.gof.behavioral.chain.Middleware;
import org.gof.behavioral.chain.RoleCheckMiddleware;
import org.gof.behavioral.chain.Server;
import org.gof.behavioral.chain.ThrottlingMiddleware;
import org.gof.behavioral.chain.UserExistsMiddleware;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestChain {

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
	void test() throws IOException {
		Server server = init();
		boolean success;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("Enter email: ");
			String email = reader.readLine();
			System.out.print("Input password: ");
			String password = reader.readLine();
			success = server.logIn(email, password);
		} while (!success);
	}

	private Server init() {
		// 初始化服务器
		Server server = new Server();
		server.register("admin@example.com", "admin_pass");
		server.register("user@example.com", "user_pass");

		// 创建一个验证信息中间链
		Middleware chain = new ThrottlingMiddleware(2);
		chain.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());

		// 服务器添加验证链
		server.setChain(chain);
		return server;
	}

}
