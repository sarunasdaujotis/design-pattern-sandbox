package com.sarunasdaujotis.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class ProductOperationExecutor {

	private final List<ImportOperation> importOperations = new ArrayList<>();

	public void addImportOperation(final ImportOperation importOperation) {
		importOperations.add(importOperation);
	}

	public void execute() {
		for (ImportOperation importOperation : importOperations) {
			importOperation.execute();
		}
	}

}
