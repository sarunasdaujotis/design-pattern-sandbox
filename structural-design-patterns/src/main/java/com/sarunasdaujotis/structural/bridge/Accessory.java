package com.sarunasdaujotis.structural.bridge;

public class Accessory extends Product {

	public Accessory(final Availability availability) {
		super(availability);
	}

	@Override
	public String produce() {
		return String.join(" ", "ACCESSORY", availability.type());
	}
}
