package org.gof.behavioral.template;

import java.util.Date;

public class Yogurt implements Product {

	// 保质期
	private Date expirationData;
	// 出厂日期
	private Date manufactureData;

	public Yogurt() {
	}

	public Yogurt(Date manufacture, Date expiration) {
		this.expirationData = expiration;
		this.manufactureData = manufacture;
	}

	public Date getExpirationData() {
		return expirationData;
	}

	public void setExpirationData(Date expirationData) {
		this.expirationData = expirationData;
	}

	public Date getManufactureData() {
		return manufactureData;
	}

	public void setManufactureData(Date manufactureData) {
		this.manufactureData = manufactureData;
	}

	@Override
	public String toString() {
		return "酸奶的生产日期" + manufactureData + "\r\n酸奶的保质期" + expirationData;
	}

}
