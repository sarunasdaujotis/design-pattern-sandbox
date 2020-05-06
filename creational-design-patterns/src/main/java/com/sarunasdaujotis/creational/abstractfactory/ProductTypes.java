package com.sarunasdaujotis.creational.abstractfactory;

import java.util.function.Supplier;

public enum ProductTypes {

	HANDSET(Handset::new),
	ACCESSORY(Accessory::new);

	private Supplier<Product> initiator;

	ProductTypes(final Supplier<Product> initiator) {
		this.initiator = initiator;
	}

	public Product getInitiator() {
		return initiator.get();
	}
}
