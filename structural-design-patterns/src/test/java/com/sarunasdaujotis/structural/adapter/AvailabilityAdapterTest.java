package com.sarunasdaujotis.structural.adapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class AvailabilityAdapterTest {

	private AvailabilityAdapter availabilityAdapter;

	@Test
	public void testDeviceAvailabilityTransformation() {
		final Device device = spy(new Device());

		availabilityAdapter = new AvailabilityAdapterImpl(device);

		assertEquals("AVAILABLE", availabilityAdapter.getAvailability());
	}
}