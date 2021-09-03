package org.gof.creational.abstractfactory;

/**
 * 手机产品规范
 * 
 * @author TungWang
 */
public interface Phone {

	// 屏幕尺寸
	public double getSize();

	// 手机标识
	public String getId();

	// 设备标签
	default String getLabel() {
		return "Mobile Device";
	}

	// 打印设备信息
	default void info() {
		StringBuilder sb = new StringBuilder();
		sb.append("Area: ").append(getLabel()).append("\r\n");
		sb.append("Brand: ").append(getId()).append("\r\n");
		sb.append("Size: ").append(getSize()).append("\r\n");
		System.out.println(sb);
	}

}
