package com.sarunasdaujotis.behavior.template;

public class PaperPaymentProcessor extends PaymentProcessor {

	private final String json;
	private final String address;

	public PaperPaymentProcessor(final String json, final String address) {
		this.json = json;
		this.address = address;
	}

	@Override
	public void transform() {
		System.out.println(json);
	}

	@Override
	public void send() {
		System.out.println("Send paper payment to " + address);
	}

}
