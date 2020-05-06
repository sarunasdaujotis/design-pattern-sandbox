package com.sarunasdaujotis.creational.factory;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductFactoryTest {

	private ProductFactory productFactory;

	@Before
	public void setUp() {
		productFactory = new ProductFactory();
	}

	@Test
	public void testDeviceCreation() {
		Product product = productFactory.create(ProductType.DEVICE, "0");

		assertTrue(product instanceof Device);
		assertEquals("0", product.getUid());
	}

	@Test
	public void testAccessoryCreation() {
		final Product product = productFactory.create(ProductType.ACCESSORY, "1");

		assertTrue(product instanceof Accessory);
		assertEquals("1", product.getUid());
	}
}