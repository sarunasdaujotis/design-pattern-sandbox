package com.sarunasdaujotis.behavior.strategy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ProductImportContextTest {

	private ProductImportContext productImportContext;

	@Before
	public void setUp() {
		productImportContext = new ProductImportContext();
	}

	@Test
	public void testDeviceImportStrategy() {
		final ProductImportStrategy deviceImport = spy(new DeviceImport());
		productImportContext.setProductImportStrategy(deviceImport);

		productImportContext.execute("device");

		verify(deviceImport).execute(any());
	}

	@Test
	public void testAccessoryImportStrategy() {
		final ProductImportStrategy accessoryImport = spy(new AccessoryImport());
		productImportContext.setProductImportStrategy(accessoryImport);

		productImportContext.execute("accessory");

		verify(accessoryImport).execute(any());
	}

}