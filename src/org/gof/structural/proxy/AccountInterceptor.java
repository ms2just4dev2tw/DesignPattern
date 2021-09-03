package org.gof.structural.proxy;

public class AccountInterceptor implements Interceptor {

	@Override
	public boolean preHandle() {
		System.out.println("验证角色的密钥是否正确");
		return true;
	}

	@Override
	public void postHandle() {
		System.out.println("将角色加入登陆等待队列中");
	}

}
