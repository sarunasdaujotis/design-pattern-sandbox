package com.sarunasdaujotis.structural.decorator;

import java.math.BigDecimal;
import java.util.Map;

public abstract class ShoppingCartDecorator implements ShoppingCart {

	protected ShoppingCart shoppingCart;

	public ShoppingCartDecorator(final ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public Map<String, String> getProducts() {
		return shoppingCart.getProducts();
	}

	@Override
	public BigDecimal currentPrice() {
		return shoppingCart.currentPrice();
	}
}
