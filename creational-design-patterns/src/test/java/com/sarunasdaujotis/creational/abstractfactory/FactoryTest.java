package com.sarunasdaujotis.creational.abstractfactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FactoryTest {

	@Test
	public void testFactoryPattern() {
		final Product handset = ProductTypes.HANDSET.getInitiator();
		final Product accessory = ProductTypes.ACCESSORY.getInitiator();

		assertEquals(Handset.HANDSET, handset.getProductType());
		assertEquals(Accessory.ACCESSORY, accessory.getProductType());
	}
}