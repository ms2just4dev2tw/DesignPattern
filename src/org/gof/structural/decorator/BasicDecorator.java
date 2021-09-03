package org.gof.structural.decorator;

/**
 * 基础装饰
 * 
 * @author TungWang
 */
public class BasicDecorator implements DataSource {

	private DataSource wrappee;

	BasicDecorator(DataSource source) {
		this.wrappee = source;
	}

	@Override
	public void writeData(String data) {
		wrappee.writeData(data);
	}

	@Override
	public String readData() {
		return wrappee.readData();
	}

}
