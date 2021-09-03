package org.gof.structural.decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * 压缩装饰
 * 
 * @author TungWang
 */
public class CompressionDecorator extends BasicDecorator {

	private int compLevel = 6;

	public CompressionDecorator(DataSource source) {
		super(source);
	}

	public int getCompressionLevel() {
		return compLevel;
	}

	public void setCompressionLevel(int value) {
		compLevel = value;
	}

	@Override
	public void writeData(String data) {
		super.writeData(compress(data));
	}

	/**
	 * @param stringData 数据
	 * @return 压缩后的数据
	 */
	private String compress(String stringData) {
		byte[] data = stringData.getBytes();
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
			DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compLevel));
			dos.write(data);
			dos.close();
			bout.close();
			return Base64.getEncoder().encodeToString(bout.toByteArray());
		} catch (IOException ex) {
			return null;
		}
	}

	@Override
	public String readData() {
		return decompress(super.readData());
	}

	/**
	 * @param stringData 数据
	 * @return 解压缩后的数据
	 */
	private String decompress(String stringData) {
		byte[] data = Base64.getDecoder().decode(stringData);
		try {
			InputStream in = new ByteArrayInputStream(data);
			InflaterInputStream iin = new InflaterInputStream(in);
			ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
			int b;
			while ((b = iin.read()) != -1) {
				bout.write(b);
			}
			in.close();
			iin.close();
			bout.close();
			return new String(bout.toByteArray());
		} catch (IOException ex) {
			return null;
		}
	}

}
