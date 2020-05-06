package com.sarunasdaujotis.structural.bridge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductBridgeTest {

	private Product product;

	@Test
	public void testDeviceBridge() {
		product = new Device(new ForSale());
		assertEquals("DEVICE FORSALE", product.produce());

		product = new Device(new Legacy());
		assertEquals("DEVICE LEGACY", product.produce());
	}

	@Test
	public void testAccessoryBridge() {
		product = new Accessory(new ForSale());
		assertEquals("ACCESSORY FORSALE", product.produce());

		product = new Accessory(new Legacy());
		assertEquals("ACCESSORY LEGACY", product.produce());
	}
}