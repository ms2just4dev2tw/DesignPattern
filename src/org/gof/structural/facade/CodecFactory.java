package org.gof.structural.facade;

/**
 *  编解码件工厂
 *  
 * @author TungWang
 */
public class CodecFactory {

	public static Codec extract(VideoFile file) {
		String type = file.getCodecType();
		return extract(type);
	}

	public static Codec extract(String type) {
		if (type.equals("mp4")) {
			System.out.println("CodecFactory: extracting mpeg audio...");
			return new MPEG4Compression();
		} else {
			System.out.println("CodecFactory: extracting ogg audio...");
			return new OggCompression();
		}
	}

}
