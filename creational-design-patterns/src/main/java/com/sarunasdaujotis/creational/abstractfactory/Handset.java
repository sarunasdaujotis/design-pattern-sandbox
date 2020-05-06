package com.sarunasdaujotis.creational.abstractfactory;

public class Handset extends Product {

	public static final String HANDSET = "HANDSET";

	private String sku;
	private String description;
	private boolean available;

	@Override
	public String getProductType() {
		return HANDSET;
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
