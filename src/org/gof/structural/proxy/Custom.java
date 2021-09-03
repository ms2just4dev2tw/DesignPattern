package org.gof.structural.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * 客户端调用者
 * 
 * @author TungWang
 */
public class Custom {

	private Server server;

	public Custom() {
		server = new Server();
		initServer();
	}

	private void initServer() {
		Handler login = new LoginHandler();
		server.addHandler(login);
		//
		RoleInterceptor role = new RoleInterceptor();
		AccountInterceptor account = new AccountInterceptor();
		//
		Interceptor proxy = getRoleInterceptorProxy(role);
		//
		if (proxy == null)
			proxy = role;
		//
		server.putInterceptorToHandler(proxy, login);
		server.putInterceptorToHandler(account, login);
	}

	private Interceptor getRoleInterceptorProxy(RoleInterceptor role) {
		try {
			//
			ClassLoader loader = Interceptor.class.getClassLoader();
			Class<?>[] interfaces = { Interceptor.class };
			//
			String name = "org.gof.structural.proxy.RoleInterceptorProxy";
			Class<?> proxyClass = Class.forName(name);
			Constructor<?> proxyCon = proxyClass.getConstructor(Interceptor.class);
			InvocationHandler proxy = (InvocationHandler) proxyCon.newInstance(role);

			Object obj = Proxy.newProxyInstance(loader, interfaces, proxy);
			Class<?> objClass = obj.getClass();
			System.out.println(objClass.getName());
			System.out.println(objClass.getModule().getName());
			System.out.println(proxy.getClass().getModule().getName());
			System.out.println(Interceptor.class.getModule().getName());
			return (Interceptor) obj;
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void startServer() {
		server.start();
	}

}
