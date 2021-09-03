package org.gof.structural.bridge;

/**
 * 设备的通用接口
 * <p>
 * 桥接模式的实现部分，一般是跟各个平台框架的实现相关
 * 
 * @author TungWang
 */
public interface Device {

	/**
	 * @return 设备是否处于开启状态
	 */
	boolean isEnabled();

	/**
	 *  打开设备
	 */
	void enable();

	/**
	 *  关闭设备
	 */
	void disable();

	/**
	 * @return 当前的音量大小
	 */
	int getVolume();

	/**
	 *  设置音量
	 *  
	 * @param percent 音量大小
	 */
	void setVolume(int percent);

	/**
	 * @return 当前的频道
	 */
	int getChannel();

	/**
	 *  设置频道
	 *  
	 * @param channel 频道数
	 */
	void setChannel(int channel);

	/**
	 *  打印状态
	 */
	void printStatus();

}
