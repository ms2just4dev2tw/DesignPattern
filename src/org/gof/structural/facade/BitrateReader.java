package org.gof.structural.facade;

/**
 * 比特率读取器
 *  
 * @author TungWang
 */
public class BitrateReader {

	public static VideoFile read(VideoFile file, Codec codec) {
		System.out.println("BitrateReader: reading file...");
		return file;
	}

	public static VideoFile convert(VideoFile buffer, Codec codec) {
		System.out.println("BitrateReader: writing file...");
		return buffer;
	}

}
