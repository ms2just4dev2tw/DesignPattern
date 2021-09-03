package org.gof.structural.facade;

import java.io.File;

/**
 * 视频转换门面(外观)
 * <p>
 * 外观模式在高内聚的组件外面提供一个简单易用的API
 * 
 * @author TungWang
 */
public class VideoConversionFacade {

	public File convertVideo(String fileName, String format) {
		System.out.println("VideoConversionFacade: conversion started.");
		VideoFile file = new VideoFile(fileName);
		// 源文件的编码类型
		Codec srcCodec = CodecFactory.extract(file);
		// 目标文件的编码类型
		Codec dstCodec = CodecFactory.extract(format);

		// 使用比特率读取器读取文件
		VideoFile buffer = BitrateReader.read(file, srcCodec);
		// 将缓存文件转换成目标类型的文件
		VideoFile intermediateResult = BitrateReader.convert(buffer, dstCodec);
		// 最后使用混音器给目标文件混音
		File result = (new AudioMixer()).fix(intermediateResult);
		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}

}
