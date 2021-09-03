package org.gof.structural.proxy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Server {

	private Map<Handler, List<Interceptor>> chains;

	public Server() {
		chains = new HashMap<>();
	}

	public void addHandler(Handler handler) {
		if (!chains.containsKey(handler))
			chains.put(handler, new LinkedList<>());
	}

	public void putInterceptorToHandler(Interceptor interceptor, Handler handler) {
		addHandler(handler);
		chains.get(handler).add(interceptor);
	}

	public void start() {
		for (Handler handler : chains.keySet()) {
			List<Interceptor> chain = chains.get(handler);
			// 对每个 handler 执行在其上的拦截器
			if (chain.size() > 0) {
				Stack<Interceptor> stack = new Stack<>();
				boolean sign = true;
				for (Interceptor interceptor : chain) {
					if (interceptor.preHandle() == false) {
						sign = false;
						break;
					}
					stack.push(interceptor);
				}
				// 如果有一个拦截器验证不通过，就不执行
				if (sign == true) {
					handler.handle();
					for (Interceptor interceptor : stack)
						interceptor.postHandle();
				}
			} else
				handler.handle();
		}
	}

}
