package com.sarunasdaujotis.creational.factory;

public class Device extends Product {

	public Device(final String uid) {
		super(ProductType.DEVICE, uid);
	}

	@Override
	public String getUid() {
		return super.uid;
	}
}
