package com.sarunasdaujotis.behavior.mediator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ImportMediatorImplTest {

	private DeviceImporter deviceImporter;
	private AccessoryImporter accessoryImporter;

	private ImportMediatorImpl importMediator;

	@Before
	public void setUp() {
		importMediator = new ImportMediatorImpl();
		deviceImporter = new DeviceImporter(importMediator);
		accessoryImporter = new AccessoryImporter(importMediator);

		importMediator.addImporter(deviceImporter);
		importMediator.addImporter(accessoryImporter);
	}

	@Test
	public void testDevice() {
		deviceImporter.send("device");
	}

	@Test
	public void testAccessory() {
		accessoryImporter.send("device");
	}
}