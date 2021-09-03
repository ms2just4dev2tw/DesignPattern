package org.gof.behavioral.observer;

public enum EventEnum {
	// 打开文件
	OPEN_FILE("打开文件"),
	// 保存文件
	SAVE_FILE("保存文件");

	private String label;

	private EventEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}

}
