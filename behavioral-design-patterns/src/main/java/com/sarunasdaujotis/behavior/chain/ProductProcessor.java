package com.sarunasdaujotis.behavior.chain;

public class ProductProcessor extends ProductPartProcessor {

	public ProductProcessor(ProductPartProcessor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public void process(final String json) {
		System.out.println("Processing meta data " + json);
		if (nextProcessor != null) {
			nextProcessor.process(json);
		}
		System.out.println("End of chain");
	}
}
