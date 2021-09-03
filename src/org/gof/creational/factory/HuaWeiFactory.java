package org.gof.creational.factory;

import org.gof.creational.abstractfactory.ElectronicFactory;
import org.gof.creational.abstractfactory.Laptop;
import org.gof.creational.abstractfactory.Phone;
import org.gof.creational.abstractfactory.Tablet;

/**
 * 具体的工厂 - 华为工厂
 * <p>
 * 华为工厂不仅可以生产符合手机标准的手机，还可以生产其它产品
 * 
 * @author TungWang
 */
public class HuaWeiFactory implements ElectronicFactory {

	@Override
	public Phone getPhone() {
		return new HuaWeiPhone();
	}

	@Override
	public Laptop getLaptop() {
		return null;
	}

	@Override
	public Tablet getTablet() {
		return null;
	}

}
