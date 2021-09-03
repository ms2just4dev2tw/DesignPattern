package org.gof.structural.proxy;

public class LoginHandler implements Handler {

	@Override
	public void handle() {
		System.out.println("用户登陆成功");
	}

}
