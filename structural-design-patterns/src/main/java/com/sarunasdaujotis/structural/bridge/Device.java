package com.sarunasdaujotis.structural.bridge;

public class Device extends Product {

	public Device(final Availability availability) {
		super(availability);
	}

	@Override
	public String produce() {
		return String.join(" ", "DEVICE", availability.type());
	}
}
