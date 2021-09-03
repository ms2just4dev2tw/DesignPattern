package org.gof.creational.factory;

import org.gof.creational.abstractfactory.Phone;

/**
 * 具体的手机产品 - 华为手机
 * 
 * @author TungWang
 */
public class HuaWeiPhone implements Phone {

	@Override
	public double getSize() {
		return 6.6;
	}

	@Override
	public String getId() {
		return "HuaWei";
	}

}
