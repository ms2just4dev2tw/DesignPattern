package org.gof.structural.decorator;

import java.util.Base64;

/**
 * 加密装饰
 * 
 * @author TungWang
 */
public class EncryptionDecorator extends BasicDecorator {

	public EncryptionDecorator(DataSource source) {
		super(source);
	}

	@Override
	public void writeData(String data) {
		super.writeData(encode(data));
	}

	/**
	 * @param data 数据
	 * @return 加密后的数据
	 */
	private String encode(String data) {
		byte[] result = data.getBytes();
		for (int i = 0; i < result.length; i++)
			result[i] += (byte) 1;
		return Base64.getEncoder().encodeToString(result);
	}

	@Override
	public String readData() {
		return decode(super.readData());
	}

	/**
	 * @param data 数据
	 * @return 解密后的数据
	 */
	private String decode(String data) {
		byte[] result = Base64.getDecoder().decode(data);
		for (int i = 0; i < result.length; i++)
			result[i] -= (byte) 1;
		return new String(result);
	}

}
