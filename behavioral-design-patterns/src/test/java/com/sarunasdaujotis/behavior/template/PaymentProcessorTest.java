package com.sarunasdaujotis.behavior.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PaymentProcessorTest {

	private PaymentProcessor paymentProcessor;

	@Test
	public void testEmailPaymentProcessor() {
		paymentProcessor = spy(new EMailPaymentProcessor("json", "email@gmail.com"));
		paymentProcessor.process();

		verify(paymentProcessor).transform();
		verify(paymentProcessor).send();
	}

	@Test
	public void testPaperPaymentProcessor() {
		paymentProcessor = spy(new PaperPaymentProcessor("json", "Some address"));
		paymentProcessor.process();

		verify(paymentProcessor).transform();
		verify(paymentProcessor).send();
	}

}
