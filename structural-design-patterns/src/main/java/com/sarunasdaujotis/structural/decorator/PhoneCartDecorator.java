package com.sarunasdaujotis.structural.decorator;

import java.math.BigDecimal;
import java.util.Map;

public class PhoneCartDecorator extends ShoppingCartDecorator {

	private final String name;
	private final BigDecimal price;

	public PhoneCartDecorator(final ShoppingCart shoppingCart, final String name, final BigDecimal price) {
		super(shoppingCart);
		this.name = name;
		this.price = price;
	}

	@Override
	public Map<String, String> getProducts() {
		final Map<String, String> products = super.getProducts();
		products.put("PHONE", name);
		return products;
	}

	@Override
	public BigDecimal currentPrice() {
		return super.currentPrice().add(price);
	}
}
