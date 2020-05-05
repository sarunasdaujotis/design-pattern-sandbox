package com.sarunasdaujotis.behavior.mediator;

public class AccessoryImporter extends Importer {

	public AccessoryImporter(final ImportMediator importMediator) {
		super(importMediator, ProductType.ACCESSORY);
	}

	@Override
	public void send(final String json) {
		importMediator.execute(json, productType);
	}

	@Override
	public void receive(final boolean processed) {
		System.out.println("Accessory <- Importer response: " + processed);
	}
}
