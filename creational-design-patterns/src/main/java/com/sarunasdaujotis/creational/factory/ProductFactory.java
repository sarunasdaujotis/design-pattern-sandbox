package com.sarunasdaujotis.creational.factory;

public class ProductFactory {

	public Product create(final ProductType productType, final String uid) {
		switch (productType) {
			case DEVICE:
				return new Device(uid);
			case ACCESSORY:
				return new Accessory(uid);
		}
		throw new IllegalArgumentException("Unknown product type!");
	}
}
