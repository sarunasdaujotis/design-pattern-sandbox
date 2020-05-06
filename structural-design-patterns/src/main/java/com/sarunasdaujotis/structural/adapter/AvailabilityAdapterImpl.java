package com.sarunasdaujotis.structural.adapter;

public class AvailabilityAdapterImpl implements AvailabilityAdapter {

	private Availability product;

	public AvailabilityAdapterImpl(final Availability product) {
		this.product = product;
	}

	@Override
	public String getAvailability() {
		return product.getAvailability().replaceAll("FORSALE", "AVAILABLE");
	}
}
