package com.sarunasdaujotis.creational.prototype;

public class Service extends Product {

	public static final String SERVICE = "SERVICE";

	private String randomProperty;

	public Service(final String randomProperty) {
		this.randomProperty = randomProperty;
	}

	@Override
	public String getRandomProperty() {
		return randomProperty;
	}

	@Override
	public String getType() {
		return SERVICE;
	}

	@Override
	public Product copy() {
		return new Service(getRandomProperty());
	}
}
