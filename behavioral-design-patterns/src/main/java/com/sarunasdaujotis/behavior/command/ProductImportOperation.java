package com.sarunasdaujotis.behavior.command;

public class ProductImportOperation implements ImportOperation {

	private ProductImport productImport;

	public ProductImportOperation(final ProductImport productImport) {
		this.productImport = productImport;
	}

	@Override
	public boolean execute() {
		return productImport.importProduct();
	}

}
