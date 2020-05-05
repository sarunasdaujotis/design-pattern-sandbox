package com.sarunasdaujotis.creational.prototype;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrototypeTest {

	private static final String RANDOM_PROPERTY = "randomProperty";

	@Test
	public void testPlanPrototype() {
		final Product plan = new Plan(RANDOM_PROPERTY);

		final Product product = plan.copy();

		assertTrue(product instanceof Plan);
		assertEquals(RANDOM_PROPERTY, product.getRandomProperty());
	}

	@Test
	public void testServicePrototype() {
		final Product plan = new Service(RANDOM_PROPERTY);

		final Product product = plan.copy();

		assertTrue(product instanceof Service);
		assertEquals(RANDOM_PROPERTY, product.getRandomProperty());
	}

}