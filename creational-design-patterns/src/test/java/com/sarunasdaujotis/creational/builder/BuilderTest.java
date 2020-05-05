package com.sarunasdaujotis.creational.builder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BuilderTest {

	@Test
	public void testBuilderPattern() {
		final Handset handset = new Handset.Builder()
				.withSku("sku")
				.withDescription("description")
				.withAvailability(true)
				.build();

		assertEquals("sku", handset.getSku());
		assertEquals("description", handset.getDescription());
		assertTrue(handset.isAvailable());
	}

	@Test
	public void testBuilderPatternPassBuilder() {
		final Accessory accessory = new Accessory.Builder()
				.withSku("sku")
				.withDescription("description")
				.withAvailability(true)
				.build();

		assertEquals("sku", accessory.getSku());
		assertEquals("description", accessory.getDescription());
		assertTrue(accessory.isAvailable());
	}
}