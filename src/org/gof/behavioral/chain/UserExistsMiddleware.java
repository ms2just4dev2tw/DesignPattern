package org.gof.behavioral.chain;

/**
 * 检查用户登录信息
 * 
 * @author TungWang
 */
public class UserExistsMiddleware extends Middleware {

	private Server server;

	public UserExistsMiddleware(Server server) {
		this.server = server;
	}

	@Override
	public boolean check(String email, String password) {
		if (!server.hasEmail(email)) {
			System.out.println("This email is not registered!");
			return false;
		}
		if (!server.matchPassword(email, password)) {
			System.out.println("Wrong password!");
			return false;
		}
		return checkNext(email, password);
	}

}
