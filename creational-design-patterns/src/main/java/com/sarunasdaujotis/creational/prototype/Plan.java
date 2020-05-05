package com.sarunasdaujotis.creational.prototype;

public class Plan extends Product {

	public static final String PLAN = "PLAN";

	private String randomProperty;

	public Plan(final String randomProperty) {
		this.randomProperty = randomProperty;
	}

	@Override
	public String getRandomProperty() {
		return randomProperty;
	}

	@Override
	public String getType() {
		return PLAN;
	}

	@Override
	public Product copy() {
		return new Plan(getRandomProperty());
	}
}
