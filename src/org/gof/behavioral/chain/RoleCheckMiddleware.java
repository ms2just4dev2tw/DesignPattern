package org.gof.behavioral.chain;

/**
 * 检查用户角色
 * 
 * @author TungWang
 */
public class RoleCheckMiddleware extends Middleware {

	@Override
	public boolean check(String email, String password) {
		if (email.equals("admin@example.com")) {
			System.out.println("Hello, admin!");
			return true;
		}
		System.out.println("Hello, user!");
		return checkNext(email, password);
	}

}
