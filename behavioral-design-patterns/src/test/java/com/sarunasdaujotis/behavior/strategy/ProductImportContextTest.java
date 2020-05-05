package com.sarunasdaujotis.behavior.strategy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ProductImportContextTest {

	@Mock
	private DeviceImport deviceImport;

	@Mock
	private AccessoryImport accessoryImport;

	private ProductImportContext productImportContext;

	@Before
	public void setUp() {
		productImportContext = new ProductImportContext();
	}

	@Test
	public void testDeviceImportStrategy() {
		productImportContext.setProductImportStrategy(deviceImport);

		productImportContext.execute("device");

		verify(deviceImport).execute(any());
	}

	@Test
	public void testAccessoryImportStrategy() {
		productImportContext.setProductImportStrategy(accessoryImport);

		productImportContext.execute("accessory");

		verify(accessoryImport).execute(any());
	}

}