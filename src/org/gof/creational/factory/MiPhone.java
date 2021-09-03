package org.gof.creational.factory;

import org.gof.creational.abstractfactory.Phone;

/**
 * 具体的手机产品 - 小米手机
 * 
 * @author TungWang
 */
public class MiPhone implements Phone {

	@Override
	public double getSize() {
		return 6.2;
	}

	@Override
	public String getId() {
		return "Mi";
	}

}
