package com.sarunasdaujotis.behavior.chain;

public class ProductAvailabilityPartProcessor extends ProductPartProcessor {

	public ProductAvailabilityPartProcessor(final ProductPartProcessor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public void process(final String json) {
		System.out.println("Processing availability data " + json);

		if (nextProcessor != null) {
			nextProcessor.process(json);
		}
	}
}
