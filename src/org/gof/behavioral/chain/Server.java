package org.gof.behavioral.chain;

import java.util.HashMap;
import java.util.Map;

/**
 * Server class.
 */
public class Server {

	private Middleware chain;
	private Map<String, String> users;

	public Server() {
		users = new HashMap<>();
	}

	/**
	 * 设置验证链
	 * 
	 * @param chain 验证链
	 */
	public void setChain(Middleware chain) {
		this.chain = chain;
	}

	/**
	 * @param email 邮箱
	 * @param password 密码
	 * @return 用户登录的结果
	 */
	public boolean logIn(String email, String password) {
		if (chain.check(email, password)) {
			System.out.println("Authorization have been successful!");
			// 做一些其他的事情
			return true;
		}
		return false;
	}

	public void register(String email, String password) {
		users.put(email, password);
	}

	public boolean hasEmail(String email) {
		return users.containsKey(email);
	}

	public boolean matchPassword(String email, String password) {
		return users.get(email).equals(password);
	}

}
