package com.sarunasdaujotis.structural.decorator;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShoppingCartDecoratorTest {

	private ShoppingCart shoppingCart;

	@Test
	public void testShoppingCartDecoration() {
		shoppingCart = new PhoneCartDecorator(
				new TabletCartDecorator(
						new ShoppingCartImpl(), "IPAD", new BigDecimal("3")), "IPHONE", new BigDecimal("4"));


		assertEquals(new BigDecimal("7"), shoppingCart.currentPrice());
		assertEquals("IPAD", shoppingCart.getProducts().get("TABLET"));
		assertEquals("IPHONE", shoppingCart.getProducts().get("PHONE"));
	}
}