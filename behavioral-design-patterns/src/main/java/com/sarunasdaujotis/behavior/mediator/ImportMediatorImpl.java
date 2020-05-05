package com.sarunasdaujotis.behavior.mediator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ImportMediatorImpl implements ImportMediator {

	private List<Importer> importers;

	public ImportMediatorImpl() {
		this.importers = Collections.synchronizedList(new ArrayList<>());
	}

	@Override
	public void execute(final String json, final ProductType productType) {
		final Optional<Importer> importerOptional = importers.stream()
				.filter(importer -> importer.productType == productType)
				.findFirst();

		importerOptional.ifPresent(importer -> importer.receive(true));
	}

	@Override
	public void addImporter(final Importer importer) {
		importers.add(importer);
	}
}
