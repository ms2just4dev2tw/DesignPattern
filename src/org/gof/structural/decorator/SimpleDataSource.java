package org.gof.structural.decorator;

/**
 * 一个简单数据源
 * 
 * @author TungWang
 */
public class SimpleDataSource implements DataSource {

	private String data;

	public SimpleDataSource() {
	}

	@Override
	public void writeData(String data) {
		this.data = data;
	}

	@Override
	public String readData() {
		return data;
	}

}
