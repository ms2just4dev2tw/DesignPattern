package org.gof.structural.bridge;

/**
 * 高级远程控制器
 * 
 * @author TungWang
 */
public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
		super.device = device;
	}

	/**
	 *  静音
	 */
	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}

}
