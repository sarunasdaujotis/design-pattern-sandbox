package com.sarunasdaujotis.structural.decorator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCartImpl implements ShoppingCart {

	@Override
	public Map<String, String> getProducts() {
		return new HashMap<>();
	}

	@Override
	public BigDecimal currentPrice() {
		return BigDecimal.ZERO;
	}
}
