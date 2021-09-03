package org.gof.structural.decorator;

/**
 * 数据源接口
 * 
 * @author TungWang
 */
public interface DataSource {

	// 写数据
	void writeData(String data);

	// 读数据
	String readData();

}
