package com.sarunasdaujotis.behavior.command;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ProductOperationExecutorTest {

	private ProductOperationExecutor productOperationExecutor;

	@Before
	public void setUp() {
		productOperationExecutor = new ProductOperationExecutor();
	}

	@Test
	public void testImportOperation() {
		final ImportOperation productImportOperation = spy(new ProductImportOperation(new ProductImport("test")));

		productOperationExecutor.addImportOperation(productImportOperation);
		productOperationExecutor.execute();

		verify(productImportOperation).execute();
	}

	@Test
	public void testValidationOperation() {
		final ImportOperation productImportOperation = spy(new ProductImportValidationOperation(new ProductImport("test")));

		productOperationExecutor.addImportOperation(productImportOperation);
		productOperationExecutor.execute();

		verify(productImportOperation).execute();
	}

	@Test
	public void testMoreThenOneOperation() {
		final ImportOperation importOperation = spy(new ProductImportOperation(new ProductImport("test")));
		final ImportOperation importValidationOperation = spy(new ProductImportValidationOperation(new ProductImport("test")));

		productOperationExecutor.addImportOperation(importOperation);
		productOperationExecutor.addImportOperation(importValidationOperation);
		productOperationExecutor.execute();

		verify(importOperation).execute();
		verify(importValidationOperation).execute();
	}
}