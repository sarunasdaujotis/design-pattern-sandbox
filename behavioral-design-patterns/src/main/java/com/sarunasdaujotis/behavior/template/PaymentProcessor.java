package com.sarunasdaujotis.behavior.template;

public abstract class PaymentProcessor {

	public abstract void transform();
	public abstract void send();

	public void process() {
		transform();
		send();
	}
}
