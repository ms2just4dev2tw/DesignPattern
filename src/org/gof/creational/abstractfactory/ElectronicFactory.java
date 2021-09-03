package org.gof.creational.abstractfactory;

/**
 * 电子产品抽象工厂
 * 
 * @author TungWang
 */
public interface ElectronicFactory {

	// 返回抽象的手机实例
	Phone getPhone();

	// 返回笔记本实例
	Laptop getLaptop();

	// 返回平板实例
	Tablet getTablet();

}
