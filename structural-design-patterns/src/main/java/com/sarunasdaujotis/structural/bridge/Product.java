package com.sarunasdaujotis.structural.bridge;

public abstract class Product {

	protected Availability availability;

	public Product(final Availability availability) {
		this.availability = availability;
	}

	public abstract String produce();
}
