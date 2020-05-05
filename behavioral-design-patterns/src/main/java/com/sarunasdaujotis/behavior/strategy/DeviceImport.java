package com.sarunasdaujotis.behavior.strategy;

public class DeviceImport implements ProductImportStrategy {

	@Override
	public void execute(final String json) {
		System.out.println("device import strategy");
	}

}
