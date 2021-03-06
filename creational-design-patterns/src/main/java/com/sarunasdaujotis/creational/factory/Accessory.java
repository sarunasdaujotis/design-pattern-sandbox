package com.sarunasdaujotis.creational.factory;

public class Accessory extends Product {

	public Accessory(final String uid) {
		super(ProductType.DEVICE, uid);
	}

	@Override
	public String getUid() {
		return super.uid;
	}
}
