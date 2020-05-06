package com.sarunasdaujotis.behavior.chain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ProductProcessorTest {

	@Test
	public void testChainOfResponsibilities() {
		final ProductAvailabilityPartProcessor productAvailabilityPartProcessor = spy(new ProductAvailabilityPartProcessor(null));
		final ProductProcessor productProcessor = spy(new ProductProcessor(productAvailabilityPartProcessor));

		productProcessor.process("TEST");

		verify(productAvailabilityPartProcessor).process(any());
	}
}