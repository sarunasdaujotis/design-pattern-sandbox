package com.sarunasdaujotis.behavior.chain;

public abstract class ProductPartProcessor {

	public ProductPartProcessor nextProcessor;

	public ProductPartProcessor(final ProductPartProcessor nextProcessor) {
		this.nextProcessor = nextProcessor;
	}

	public abstract void process(final String json);
}
