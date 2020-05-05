package com.sarunasdaujotis.behavior.mediator;

public abstract class Importer {

	protected ImportMediator importMediator;
	protected ProductType productType;

	public Importer(final ImportMediator importMediator, final ProductType productType) {
		this.importMediator = importMediator;
		this.productType = productType;
	}

	public abstract void send(final String json);

	public abstract void receive(final boolean processed);
}
