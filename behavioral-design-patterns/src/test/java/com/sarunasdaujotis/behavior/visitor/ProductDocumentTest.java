package com.sarunasdaujotis.behavior.visitor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ProductDocumentTest {

	private ProductDocument productDocument;
	private ProductElementsVisitor visitor;

	@Before
	public void setUp() {
		productDocument = new ProductDocument();
		visitor = new ProductElementsVisitor();
	}

	@Test
	public void testHeaderProductBodyElement() {
		final ProductElement headerProductElement = spy(new HeaderProductElement());
		productDocument.addProductElement(headerProductElement);

		final String productElementResult = productDocument.accept(visitor);

		verify(headerProductElement).accept(any());

		Assert.assertEquals("header", productElementResult);
	}

	@Test
	public void testBodyProductElement() {
		final ProductElement bodyProductElement = spy(new BodyProductElement());
		productDocument.addProductElement(bodyProductElement);

		final String productElementResult = productDocument.accept(visitor);
		verify(bodyProductElement).accept(any());

		Assert.assertEquals("body", productElementResult);
	}

	@Test
	public void testMultipleProductElements() {
		final ProductElement headerProductElement = spy(new HeaderProductElement());
		final ProductElement bodyProductElement = spy(new BodyProductElement());

		productDocument.addProductElement(headerProductElement);
		productDocument.addProductElement(bodyProductElement);

		final String productElementResult = productDocument.accept(visitor);

		verify(headerProductElement).accept(any());
		verify(bodyProductElement).accept(any());

		Assert.assertEquals("header\nbody", productElementResult);
	}
}