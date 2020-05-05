package com.sarunasdaujotis.behavior.mediator;

public class DeviceImporter extends Importer {

	public DeviceImporter(final ImportMediator importMediator) {
		super(importMediator, ProductType.DEVICE);
	}

	@Override
	public void send(final String json) {
		importMediator.execute(json, productType);
	}

	@Override
	public void receive(final boolean processed) {
		System.out.println("Device <- Importer response: " + processed);
	}
}
