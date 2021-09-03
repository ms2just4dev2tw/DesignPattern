package org.gof.behavioral.chain;

/**
 * 基础验证接口
 * 
 * @author TungWang
 */
public abstract class Middleware {

	/**
	 * 下一个验证
	 */
	private Middleware next;

	/**
	 * 链接下一个验证
	 * 
	 * @param next 下一个验证
	 * @return 下一个验证
	 */
	public Middleware linkWith(Middleware next) {
		this.next = next;
		return next;
	}

	/**
	 * 验证当前的用户信息
	 * 
	 * @param email 邮箱
	 * @param password 密码
	 * @return 验证的结果
	 */
	public abstract boolean check(String email, String password);

	/**
	 * 执行下一个验证中间件的验证
	 * 
	 * @param email 邮箱
	 * @param password 密码
	 * @return 下一个验证中间件的验证结果
	 */
	protected boolean checkNext(String email, String password) {
		if (next == null)
			return true;
		return next.check(email, password);
	}

}
