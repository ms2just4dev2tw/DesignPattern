package org.gof.behavioral.template;

import java.util.Calendar;
import java.util.Date;

public class YogurtRepository extends Repository {

	@Override
	protected boolean vaildateProduct(Product product) {
		Yogurt yg = (Yogurt) product;
		Date expiration = yg.getExpirationData();
		Date now = Calendar.getInstance().getTime();
		return expiration.after(now);
	}

}
