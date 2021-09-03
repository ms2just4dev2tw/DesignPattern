package org.gof.structural.facade;

import java.io.File;

/**
 * 音频混合器
 * 
 * @author TungWang
 */
public class AudioMixer {

	public File fix(VideoFile result) {
		System.out.println("AudioMixer: fixing audio...");
		return new File("音频混音后的文件的文件路径");
	}

}
