package org.gof.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyServer implements InvocationHandler {

	private Object target;

	public Object bind(Object target) {
		this.target = target;
		ClassLoader loader = target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, this);
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
