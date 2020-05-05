package com.sarunasdaujotis.behavior.strategy;

public class AccessoryImport implements ProductImportStrategy {

	@Override
	public void execute(final String json) {
		System.out.println("accessory import strategy");
	}

}
