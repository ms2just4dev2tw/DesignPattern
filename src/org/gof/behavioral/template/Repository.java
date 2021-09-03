package org.gof.behavioral.template;

import java.util.ArrayList;
import java.util.List;

/**
 * 仓库接口
 * 
 * @author TungWang
 */
public abstract class Repository {

	protected List<Product> container;

	public Repository() {
		container = new ArrayList<>();
	}

	/**
	 * 入库
	 * @param product 产品
	 */
	public void enter(Product product) {
		if (vaildateProduct(product))
			container.add(product);
		else
			System.out.println("质检不通过，不能入库");
	}

	/***
	 * @return 出库的产品
	 */
	public Product outbound() {
		for (Product product = getProduct(); product != null; product = getProduct())
			if (vaildateProduct(product))
				return product;
			else
				System.out.println("质检不通过，不能出库，换取下一个商品");
		return null;
	}

	public boolean isEmpty() {
		return container.size() == 0;
	}

	protected Product getProduct() {
		if (container.size() > 0)
			return container.remove(container.size() - 1);
		else
			return null;
	}

	/**
	 * @param product
	 * @return 产品质检的结果
	 */
	protected boolean vaildateProduct(Product product) {
		return true;
	}

}
