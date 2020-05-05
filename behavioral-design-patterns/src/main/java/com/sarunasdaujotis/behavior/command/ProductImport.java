package com.sarunasdaujotis.behavior.command;

public class ProductImport {

	private final String productName;

	public ProductImport(final String productName) {
		this.productName = productName;
	}

	public boolean importProduct() {
		return true;
	}

	public boolean validate() {
		return true;
	}
}
