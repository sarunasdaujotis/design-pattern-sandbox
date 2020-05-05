package com.sarunasdaujotis.behavior.strategy;

public class ProductImportContext {

	private ProductImportStrategy productImportStrategy;

	public void setProductImportStrategy(final ProductImportStrategy productImportStrategy) {
		this.productImportStrategy = productImportStrategy;
	}

	public void execute(final String json) {
		productImportStrategy.execute(json);
	}
}
