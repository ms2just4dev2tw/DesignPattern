package org.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 包装盒
 * 
 * @author TungWang
 */
public class Box implements Product {

	// 盒子里包含的产品
	private List<Product> container;

	public Box() {
		container = new ArrayList<>();
	}

	public void addProduct(Product product) {
		container.add(product);
	}

	public boolean removeProduct(Product product) {
		return container.remove(product);
	}

	@Override
	public double getPrice() {
		int totalPrice = 0;
		for (Product product : container)
			totalPrice += product.getPrice();
		return totalPrice;
	}

}
