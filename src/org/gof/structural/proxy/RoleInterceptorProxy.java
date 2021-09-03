package org.gof.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RoleInterceptorProxy implements InvocationHandler {

	private Interceptor target;

	public RoleInterceptorProxy(Interceptor target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("调用目标方法之前");
		// 调用目标方法
		Object result = method.invoke(target, args);
		System.out.println("调用目标方法之后");
		return result;
	}

}
