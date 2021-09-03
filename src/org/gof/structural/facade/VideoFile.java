package org.gof.structural.facade;

/**
 * 视频文件
 * 
 * @author TungWang
 */
public class VideoFile {

	// 文件名
	private String name;
	// 编码类型
	private String codecType;

	public VideoFile(String name) {
		this.name = name;
		this.codecType = name.substring(name.indexOf(".") + 1);
	}

	public String getCodecType() {
		return codecType;
	}

	public String getName() {
		return name;
	}

}
