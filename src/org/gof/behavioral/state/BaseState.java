package org.gof.behavioral.state;

/**
 * 一个中间层的抽象对象，包含一些可复用的对象和方法
 * 
 * @author TungWang
 */
public abstract class BaseState implements State {

	// 上下文对象
	protected Player player;

	public BaseState(Player player) {
		this.player = player;
	}

	@Override
	public abstract String lock();

	@Override
	public abstract String unlock();

	@Override
	public abstract String next();

	@Override
	public abstract String previous();

}
