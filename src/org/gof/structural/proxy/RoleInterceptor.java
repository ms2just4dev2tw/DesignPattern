package org.gof.structural.proxy;

public class RoleInterceptor implements Interceptor {

	@Override
	public boolean preHandle() {
		System.out.println("判断登陆的角色是否存在");
		return true;
	}

	@Override
	public void postHandle() {
		System.out.println("将角色加入密钥验证等待队列中");
	}

}
