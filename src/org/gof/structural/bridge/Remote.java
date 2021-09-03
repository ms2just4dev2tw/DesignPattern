package org.gof.structural.bridge;

/**
 * 远程控制器的通用接口
 * <p>
 * 桥接模式的抽象部分，直接同客户端进行交互
 * <p>
 * 它的实现子类会内置实现部分的一个具体的实现者
 * 
 * @author TungWang
 */
public interface Remote {

	/**
	 *  电源开关
	 */
	void power();

	/**
	 *  调高音量
	 */
	void volumeDown();

	/**
	 *  调低音量
	 */
	void volumeUp();

	/**
	 *  频道变小
	 */
	void channelDown();

	/**
	 *  频道变大
	 */
	void channelUp();

}
