package com.sarunasdaujotis.creational.factory;

public abstract class Product {

	private final ProductType productType;
	protected final String uid;

	public Product(final ProductType productType, final String uid) {
		this.productType = productType;
		this.uid = uid;
	}

	public abstract String getUid();
}
