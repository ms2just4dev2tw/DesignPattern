package org.gof.structural.bridge;

/**
 * 收音机
 *  
 * @author TungWang
 */
public class Radio implements Device {

	// 收音机的状态，默认关闭
	private boolean on = false;
	// 音量
	private int volume = 30;
	// 频道
	private int channel = 1;

	@Override
	public boolean isEnabled() {
		return on;
	}

	@Override
	public void enable() {
		on = true;
	}

	@Override
	public void disable() {
		on = false;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
			this.volume = 100;
		} else if (volume < 0) {
			this.volume = 0;
		} else {
			this.volume = volume;
		}
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void printStatus() {
		System.out.println("------------------------------------");
		System.out.println("| I'm radio.");
		System.out.println("| I'm " + (on ? "enabled" : "disabled"));
		System.out.println("| Current volume is " + volume + "%");
		System.out.println("| Current channel is " + channel);
		System.out.println("------------------------------------\n");
	}

}
