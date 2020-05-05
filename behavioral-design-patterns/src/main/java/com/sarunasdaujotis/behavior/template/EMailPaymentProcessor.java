package com.sarunasdaujotis.behavior.template;

public class EMailPaymentProcessor extends PaymentProcessor {

	private final String json;
	private final String email;

	public EMailPaymentProcessor(final String json, final String email) {
		this.json = json;
		this.email = email;
	}

	@Override
	public void transform() {
		System.out.println(json);
	}

	@Override
	public void send() {
		System.out.println("Send email payment to " + email);
	}

}
