package org.gof.behavioral.chain;

/**
 * 检查请求数量限制
 * 
 * @author TungWang
 */
public class ThrottlingMiddleware extends Middleware {

	// 请求计数
	private int resCount;
	// 每分钟请求限制
	private int resPerMinute;
	// 之前的一个时间点
	private long preTime;

	public ThrottlingMiddleware(int resPerMinute) {
		this.resPerMinute = resPerMinute;
		this.preTime = System.currentTimeMillis();
	}

	@Override
	public boolean check(String email, String password) {
		// 如果已经过去一分钟，重置计数
		if (System.currentTimeMillis() > preTime + 60_000) {
			resCount = 0;
			preTime = System.currentTimeMillis();
		}

		resCount++;
		// 如果当前的请求计数超过每分钟请求限制
		if (resCount > resPerMinute) {
			System.out.println("Request limit exceeded!");
			return false;
		}
		return checkNext(email, password);
	}

}
