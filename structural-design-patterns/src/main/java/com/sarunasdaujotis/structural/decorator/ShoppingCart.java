package com.sarunasdaujotis.structural.decorator;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCart {

	Map<String, String> getProducts();

	BigDecimal currentPrice();

}
