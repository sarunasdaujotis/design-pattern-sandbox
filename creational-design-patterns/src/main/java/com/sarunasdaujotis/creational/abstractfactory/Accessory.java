package com.sarunasdaujotis.creational.abstractfactory;

public class Accessory extends Product {

	public static final String ACCESSORY = "ACCESSORY";

	private String sku;
	private String description;
	private boolean available;

	@Override
	public String getProductType() {
		return ACCESSORY;
	}

	@Override
	public String getSku() {
		return sku;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public boolean isAvailable() {
		return available;
	}
}
