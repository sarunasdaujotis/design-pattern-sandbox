package com.sarunasdaujotis.behavior.mediator;

public interface ImportMediator {

	void execute(String json, ProductType productType);

	void addImporter(Importer importer);
}
