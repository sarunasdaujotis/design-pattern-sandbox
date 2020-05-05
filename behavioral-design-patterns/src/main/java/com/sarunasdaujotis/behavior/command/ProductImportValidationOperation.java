package com.sarunasdaujotis.behavior.command;

public class ProductImportValidationOperation implements ImportOperation {

	private final ProductImport productImport;

	public ProductImportValidationOperation(final ProductImport productImport) {
		this.productImport = productImport;
	}

	@Override
	public boolean execute() {
		return productImport.validate();
	}

}
