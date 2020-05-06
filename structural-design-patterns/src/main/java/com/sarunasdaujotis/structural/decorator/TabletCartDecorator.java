package com.sarunasdaujotis.structural.decorator;

import java.math.BigDecimal;
import java.util.Map;

public class TabletCartDecorator extends ShoppingCartDecorator {

	private final String name;
	private final BigDecimal price;

	public TabletCartDecorator(final ShoppingCart shoppingCart, final String name, final BigDecimal price) {
		super(shoppingCart);
		this.name = name;
		this.price = price;
	}

	@Override
	public Map<String, String> getProducts() {
		final Map<String, String> products = shoppingCart.getProducts();
		products.put("TABLET", name);
		return products;
	}

	@Override
	public BigDecimal currentPrice() {
		return shoppingCart.currentPrice().add(price);
	}
}
